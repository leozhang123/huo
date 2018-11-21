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
package org.zl.huo.huoservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.zl.huo.huoservice.bean.ActionResult;
import org.zl.huo.huoservice.bean.Job;
import org.zl.huo.huoservice.bean.Pager;
import org.zl.huo.huoservice.service.HuoService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

/**
 * 业务接口
 * 
 * @author Leo
 * @version 0.1
 */
@RestController
@RequestMapping("/job")
@Api("DSB查询服务")
public class JobController {

	@Autowired
	HuoService huoService;
	
	@GetMapping("/{id}")
	@ApiOperation(value="获取招聘职位信息")
	@ApiImplicitParam(name="id",value="职位信息id",dataType="string",paramType="path",required=true)
	public ActionResult<?> getJob(@PathVariable("id") String id){
		Job job = huoService.getJob(id);
		return new ActionResult<>(job);
	}
	
	@GetMapping("/top10")
	@ApiOperation(value="获取最新10条招聘职位信息")
	@ApiImplicitParam(name="param",value="查询条件",dataType="string",paramType="path",required=false)
	public ActionResult<?> findTop10(@RequestParam(value="param",required=false) String param){
		List<Job> jobs = huoService.findTop10(param);
		return new ActionResult<>(jobs);
	}
	
	@PostMapping("/")
	@ApiOperation(value="新增招聘职位信息")
	public ActionResult<?> saveJob(Job job){
		Job j = huoService.saveJob(job);
		return new ActionResult<>(j);
	}
	
	@PutMapping("/")
	@ApiOperation(value="更新招聘职位信息")
	public ActionResult<?> updateJob(Job job){
		Job j = huoService.updateJob(job);
		return new ActionResult<>(j);
	}
	
	@DeleteMapping("/{id}")
	@ApiOperation(value="删除招聘职位信息")
	@ApiImplicitParam(name="id",value="职位信息id",dataType="string",paramType="path",required=true)
	public ActionResult<?> deleteJob(@PathVariable("id") String id){
		huoService.deleteJob(id);
		return new ActionResult<>();
	}
	
	@GetMapping("/findall")
	@ApiOperation(value="分页查询招聘职位信息")
	@ApiImplicitParams({
		@ApiImplicitParam(name="pageNumber",value="页号",dataType="int",defaultValue="0",required=false,example="0"),
		@ApiImplicitParam(name="pageSize",value="页大小",dataType="int",defaultValue="10",required=false,example="10")
	})
	public Pager<Job> findAll(@RequestParam(value="pageNumber",required=false,defaultValue="0")int pageNumber,@RequestParam(value="pageSize",required=false,defaultValue="10") int pageSize){
		return huoService.findAll(PageRequest.of(pageNumber, pageSize));
	}
}
