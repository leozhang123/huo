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
package org.zl.huo.huoservice.jpa.domain;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * 公司信息
 * 
 * @author Leo
 * @version 0.1
 */
@Entity
@Table(name = "h_company")
public class JCompany implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7732363675733495586L;
	
	@Id
	private String id;
	//企业名称
	@Column(name = "name")
	private String name;
	//招聘公司图标
	@Column(name = "logo")
	private String logo;
	//发薪日
	@Column(name = "pay_day")
	private String payDay;
	//公司介绍
	@Column(name = "info")
	private String info;
	
	@OneToMany(cascade = {CascadeType.ALL}, mappedBy = "company") 
	private List<JJob> job;
	
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the logo
	 */
	public String getLogo() {
		return logo;
	}
	/**
	 * @param logo the logo to set
	 */
	public void setLogo(String logo) {
		this.logo = logo;
	}
	/**
	 * @return the payDay
	 */
	public String getPayDay() {
		return payDay;
	}
	/**
	 * @param payDay the payDay to set
	 */
	public void setPayDay(String payDay) {
		this.payDay = payDay;
	}
	/**
	 * @return the info
	 */
	public String getInfo() {
		return info;
	}
	/**
	 * @param info the info to set
	 */
	public void setInfo(String info) {
		this.info = info;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Company [id=");
		builder.append(id);
		builder.append(", name=");
		builder.append(name);
		builder.append(", logo=");
		builder.append(logo);
		builder.append(", payDay=");
		builder.append(payDay);
		builder.append(", info=");
		builder.append(info);
		builder.append("]");
		return builder.toString();
	}
	/**
	 * @return the job
	 */
	public List<JJob> getJob() {
		return job;
	}
	/**
	 * @param job the job to set
	 */
	public void setJob(List<JJob> job) {
		this.job = job;
	}
}
