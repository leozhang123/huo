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
package org.zl.huo.huoservice.service;

import java.util.List;

import org.zl.huo.huoservice.bean.Job;

/**
 * 
 * 
 * @author Leo
 * @version 0.1
 */
public interface HuoService {


	/**
	 * 
	 * @param id
	 * @return
	 */
	Job getJob(String id);
	
	List<Job> queryJob(String param);
	
}
