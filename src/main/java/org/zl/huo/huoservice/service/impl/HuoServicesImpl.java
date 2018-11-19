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

import org.springframework.stereotype.Service;
import org.zl.huo.huoservice.bean.Job;
import org.zl.huo.huoservice.bean.Sex;
import org.zl.huo.huoservice.service.HuoService;

/**
 * 
 * 
 * @author Leo
 * @version 0.1
 */
@Service
public class HuoServicesImpl implements HuoService{

	@Override
	public Job getJob(String id) {
		Job job = new Job();
		job.setId(id);
		job.setAge(11);
		job.setSalary("test"+id);
		job.setSex(Sex.MALE);
		return job;
	}

	@Override
	public List<Job> queryJob(String param) {
		List<Job> list = new ArrayList<>();
		list.add(getJob("1"));
		return list;
	}

	
}
