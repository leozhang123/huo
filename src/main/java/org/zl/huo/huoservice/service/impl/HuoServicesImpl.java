/*
 * Copyright 2018 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.zl.huo.huoservice.service.impl;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;
import org.springframework.util.StringUtils;
import org.zl.huo.huoservice.bean.Job;
import org.zl.huo.huoservice.bean.Pager;
import org.zl.huo.huoservice.jpa.CompanyRepository;
import org.zl.huo.huoservice.jpa.JobRepository;
import org.zl.huo.huoservice.jpa.domain.JCompany;
import org.zl.huo.huoservice.jpa.domain.JJob;
import org.zl.huo.huoservice.service.HuoService;

/**
 * 
 * 
 * @author Leo
 * @version 0.1
 */
@Service
public class HuoServicesImpl implements HuoService{

	private static final Logger log = LoggerFactory.getLogger(HuoServicesImpl.class);
	
	@Autowired
	JobRepository jobRepository;
	
	@Autowired
	CompanyRepository companyRepository;
	
	@Override
	public Job getJob(String id) {
		/*Job job = new Job();
		job.setId(id);
		job.setAge(11);
		job.setSalary("test"+id);
		job.setSex(Sex.MALE);*/
		Optional<JJob> job = jobRepository.findById(id);
		return ModelHelper.jjob2Job(job.orElse(null));
	}

	@Override
	public List<Job> findTop10(String name) {
		log.debug("findTop10[{}]", name);
		if (StringUtils.isEmpty(name)) {
			return ModelHelper.jjob2Job(
					jobRepository.findTop10(PageRequest.of(0, 10, Sort.by(Sort.Direction.DESC, "createDate"))));
		}
		return ModelHelper.jjob2Job(jobRepository.findTop10ByPosition(name,
				PageRequest.of(0, 10, Sort.by(Sort.Direction.DESC, "createDate"))));
	}

	@Override
	@Transactional
	public Job saveJob(Job job) {
		job.setId(UUID.randomUUID().toString().replaceAll("-", ""));
		job.setCreateDate(LocalDateTime.now());
		JJob jjob = ModelHelper.job2JJob(job);
		log.debug("save job:{}",jjob);
		if(StringUtils.isEmpty(job.getCompanyId())) {
			JCompany company = jjob.getCompany();
			company.setId(UUID.randomUUID().toString().replaceAll("-", ""));
			companyRepository.save(company);
		}
		jjob=jobRepository.save(jjob);
		return ModelHelper.jjob2Job(jjob);
	}

	@Override
	@Transactional
	public Job updateJob(Job job) {
		Assert.hasText(job.getId(),"id is empty");
		Assert.hasText(job.getCompanyId(),"company id is empty");
		JJob jjob=jobRepository.save(ModelHelper.job2JJob(job));
		return ModelHelper.jjob2Job(jjob);
	}

	@Override
	public void deleteJob(String id) {
		jobRepository.deleteById(id);
	}

	@Override
	public Pager<Job> findAll(Pageable pageable) {
		return ModelHelper.toPager(jobRepository.findAll(pageable));
	}

	
}
