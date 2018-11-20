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
		Pager<Job> pager = new Pager<Job>();
		return pager;
	}
}
