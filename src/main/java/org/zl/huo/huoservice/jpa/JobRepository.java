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
package org.zl.huo.huoservice.jpa;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.RepositoryDefinition;
import org.zl.huo.huoservice.jpa.domain.JJob;

/**
 * 
 * 
 * @author Leo
 * @version 0.1
 */
@RepositoryDefinition(domainClass = JJob.class, idClass = String.class)
public interface JobRepository extends PagingAndSortingRepository<JJob, String> {

	@Query("from Job where position like %:position%")
	List<JJob> findTop10ByPosition(@Param("position") String position,Pageable pageable);
	
	@Query("from Job")
	List<JJob> findTop10(Pageable pageable);
}
