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

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.domain.Page;
import org.zl.huo.huoservice.bean.Job;
import org.zl.huo.huoservice.bean.Pager;
import org.zl.huo.huoservice.jpa.domain.JCompany;
import org.zl.huo.huoservice.jpa.domain.JJob;

/**
 * @author Leo
 *
 */
public class ModelHelper {

	public static JJob job2JJob(Job job) {
		if (job == null) {
			return null;
		}
		JJob jjob = new JJob();
		jjob.setAddress(job.getAddress());
		jjob.setAge(job.getAge());
		jjob.setBasicSalary(job.getBasicSalary());
		jjob.setDiploma(job.getDiploma());
		jjob.setContractDesc(job.getContractDesc());
		jjob.setDormitory(job.getDormitory());
		jjob.setEnglishLevel(job.getEnglishLevel());
		jjob.setFood(job.getFood());
		jjob.setId(job.getId());
		jjob.setIdCard(job.getIdCard());
		jjob.setClothingRequirements(job.getClothingRequirements());
		jjob.setInsuranceDesc(job.getInsuranceDesc());
		jjob.setJobContent(job.getJobContent());
		jjob.setLocation(job.getLocation());
		jjob.setPayroll(job.getPayRoll());
		jjob.setPhysicalExamination(job.getPhysicalExamination());
		jjob.setPosition(job.getPosition());
		jjob.setSalary(job.getSalary());
		jjob.setSalaryStructure(job.getSalaryStructure());
		jjob.setScars(job.getScars());
		jjob.setSex(job.getSex());
		jjob.setSkillCertificate(job.getSkillCertificate());
		jjob.setTattoo(job.getTattoo());
		jjob.setTraffic(job.getTraffic());
		jjob.setWorkEnv(job.getWorkEnv());
		jjob.setWorkTime(job.getWorkTime());
		jjob.setCreateDate(job.getCreateDate());
		JCompany com = new JCompany();
		com.setId(job.getCompanyId());
		com.setInfo(job.getCompanyInfo());
		com.setName(job.getCompanyName());
		com.setPayDay(job.getPayDay());
		com.setLogo(job.getCompanyLogo());
		List<JJob> list = new ArrayList<>();
		list.add(jjob);
		com.setJob(list);
		jjob.setCompany(com);
		return jjob;
	}

	public static List<JJob> job2JJob(List<Job> jobs) {
		List<JJob> jjobs = new ArrayList<>();
		if (jobs != null) {
			jobs.forEach(j->{
				jjobs.add(job2JJob(j));
			});
		}
		return jjobs;
	}

	public static Job jjob2Job(JJob jjob) {
		if (jjob == null) {
			return null;
		}
		Job job = new Job();
		job.setAddress(jjob.getAddress());
		job.setAge(jjob.getAge());
		job.setBasicSalary(jjob.getBasicSalary());
		job.setDiploma(jjob.getDiploma());
		job.setContractDesc(jjob.getContractDesc());
		job.setDormitory(jjob.getDormitory());
		job.setEnglishLevel(jjob.getEnglishLevel());
		job.setFood(jjob.getFood());
		job.setId(jjob.getId());
		job.setIdCard(jjob.getIdCard());
		job.setClothingRequirements(jjob.getClothingRequirements());
		job.setInsuranceDesc(jjob.getInsuranceDesc());
		job.setJobContent(jjob.getJobContent());
		job.setLocation(jjob.getLocation());
		job.setPayRoll(jjob.getPayroll());
		job.setPhysicalExamination(jjob.getPhysicalExamination());
		job.setPosition(jjob.getPosition());
		job.setSalary(jjob.getSalary());
		job.setSalaryStructure(jjob.getSalaryStructure());
		job.setScars(jjob.getScars());
		job.setSex(jjob.getSex());
		job.setSkillCertificate(jjob.getSkillCertificate());
		job.setTattoo(jjob.getTattoo());
		job.setTraffic(jjob.getTraffic());
		job.setWorkEnv(jjob.getWorkEnv());
		job.setWorkTime(jjob.getWorkTime());
		job.setCreateDate(jjob.getCreateDate());
		JCompany com = jjob.getCompany();
		if(com!=null) {
			job.setCompanyId(com.getId());
			job.setCompanyInfo(com.getInfo());
			job.setCompanyLogo(com.getLogo());
			job.setCompanyName(com.getName());
			job.setPayDay(com.getPayDay());
		}
		return job;
	}

	public static List<Job> jjob2Job(List<JJob> jjobs) {
		List<Job> jobs = new ArrayList<>();
		if (jjobs != null) {
			jjobs.forEach(j->{
				jobs.add(jjob2Job(j));
			});
		}
		return jobs;
	}

	public static Pager<Job> toPager(Page<JJob> page) {
		Pager<Job> pager = new Pager<>(page.getPageable().getPageNumber(),page.getPageable().getPageSize());
		if(!page.isEmpty()) {
			List<Job> jobs = jjob2Job(page.getContent());
			pager.setData(jobs);
		}
		pager.setTotalPages(page.getTotalPages());
		pager.setTotalElements(page.getTotalElements());
		return pager;
	}
}
