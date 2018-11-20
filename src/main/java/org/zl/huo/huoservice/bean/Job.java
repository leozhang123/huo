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
package org.zl.huo.huoservice.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 招聘职位信息
 * 
 * @author Leo
 * @version 0.1
 */
@Entity
@Table(name="h_job")
public class Job implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2981458250011887437L;
	
	@Id
	private String id;
	//综合薪资
	@Column(name="SALARY")
	private String salary;
	//工作岗位
	@Column(name="POSITION")
	private String position;
	//年龄
	@Column(name="AGE")
	private int age;
	//性别
	@Column(name="SEX")
	private Sex sex;
	//地址
	@Column(name="ADDRESS")
	private String address;
	//工作地点
	@Column(name="LOCATION")
	private String location;
	//底薪
	//薪资结构
	//伙食
	//住宿
	//交通
	//工作内容
	//工作时长
	//工作环境
	//合同说明
	//工资发放
	//保险说明
	//身份证
	//毕业证
	//技能证书
	//年龄
	//性别
	//纹身
	///烟疤
	//英文水平
	//服装要求
	//体检要求
	
	
	/**
	 * @return the salary
	 */
	public String getSalary() {
		return salary;
	}
	
	/**
	 * @param salary the salary to set
	 */
	public void setSalary(String salary) {
		this.salary = salary;
	}
	/**
	 * @return the position
	 */
	public String getPosition() {
		return position;
	}
	/**
	 * @param position the position to set
	 */
	public void setPosition(String position) {
		this.position = position;
	}
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	/**
	 * @return the location
	 */
	public String getLocation() {
		return location;
	}
	/**
	 * @param location the location to set
	 */
	public void setLocation(String location) {
		this.location = location;
	}
	/**
	 * @return the sex
	 */
	public Sex getSex() {
		return sex;
	}
	/**
	 * @param sex the sex to set
	 */
	public void setSex(Sex sex) {
		this.sex = sex;
	}
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
}
