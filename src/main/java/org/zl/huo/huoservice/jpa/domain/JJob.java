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
import java.time.LocalDateTime;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.zl.huo.huoservice.bean.Sex;

/**
 * 招聘职位信息
 * 
 * @author Leo
 * @version 0.1
 */
@Entity
@Table(name="h_job")
public class JJob implements Serializable {

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
	@Column
	private String basicSalary;
	//薪资结构
	@Column
	private String SalaryStructure;
	//伙食
	@Column
	private String food;
	//住宿
	@Column
	private String dormitory;
	//交通
	@Column
	private String traffic;
	//工作内容
	@Column
	private String JobContent ;
	//工作时长
	@Column
	private String workTime;
	//工作环境
	@Column
	private String workEnv;
	//合同说明
	@Column
	private String contractDesc;
	//工资发放
	@Column
	private String Payroll;
	//保险说明
	@Column
	private String InsuranceDesc;
	//身份证
	@Column
	private String idCard;
	//毕业证
	@Column
	private String diploma;
	//技能证书
	@Column
	private String skillCertificate;
	//纹身
	@Column
	private String tattoo;
	///烟疤
	@Column
	private String scars;
	//英文水平
	@Column
	private String englishLevel;
	//服装要求
	@Column
	private String clothingRequirements;
	//体检要求
	@Column
	private String physicalExamination;
	
	@Column
	private LocalDateTime createDate;
	
	@ManyToOne(cascade = {CascadeType.PERSIST,CascadeType.REFRESH},fetch = FetchType.EAGER,optional=false)
	@JoinColumn(name = "companyid")
	private JCompany company;
	
	
	public JJob() {
		super();
	}
	
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

	/**
	 * @return the basicSalary
	 */
	public String getBasicSalary() {
		return basicSalary;
	}

	/**
	 * @param basicSalary the basicSalary to set
	 */
	public void setBasicSalary(String basicSalary) {
		this.basicSalary = basicSalary;
	}

	/**
	 * @return the salaryStructure
	 */
	public String getSalaryStructure() {
		return SalaryStructure;
	}

	/**
	 * @param salaryStructure the salaryStructure to set
	 */
	public void setSalaryStructure(String salaryStructure) {
		SalaryStructure = salaryStructure;
	}

	/**
	 * @return the food
	 */
	public String getFood() {
		return food;
	}

	/**
	 * @param food the food to set
	 */
	public void setFood(String food) {
		this.food = food;
	}

	/**
	 * @return the dormitory
	 */
	public String getDormitory() {
		return dormitory;
	}

	/**
	 * @param dormitory the dormitory to set
	 */
	public void setDormitory(String dormitory) {
		this.dormitory = dormitory;
	}

	/**
	 * @return the traffic
	 */
	public String getTraffic() {
		return traffic;
	}

	/**
	 * @param traffic the traffic to set
	 */
	public void setTraffic(String traffic) {
		this.traffic = traffic;
	}

	/**
	 * @return the jobContent
	 */
	public String getJobContent() {
		return JobContent;
	}

	/**
	 * @param jobContent the jobContent to set
	 */
	public void setJobContent(String jobContent) {
		JobContent = jobContent;
	}

	/**
	 * @return the workTime
	 */
	public String getWorkTime() {
		return workTime;
	}

	/**
	 * @param workTime the workTime to set
	 */
	public void setWorkTime(String workTime) {
		this.workTime = workTime;
	}

	/**
	 * @return the workEnv
	 */
	public String getWorkEnv() {
		return workEnv;
	}

	/**
	 * @param workEnv the workEnv to set
	 */
	public void setWorkEnv(String workEnv) {
		this.workEnv = workEnv;
	}

	/**
	 * @return the contractDesc
	 */
	public String getContractDesc() {
		return contractDesc;
	}

	/**
	 * @param contractDesc the contractDesc to set
	 */
	public void setContractDesc(String contractDesc) {
		this.contractDesc = contractDesc;
	}

	/**
	 * @return the payroll
	 */
	public String getPayroll() {
		return Payroll;
	}

	/**
	 * @param payroll the payroll to set
	 */
	public void setPayroll(String payroll) {
		Payroll = payroll;
	}

	/**
	 * @return the insuranceDesc
	 */
	public String getInsuranceDesc() {
		return InsuranceDesc;
	}

	/**
	 * @param insuranceDesc the insuranceDesc to set
	 */
	public void setInsuranceDesc(String insuranceDesc) {
		InsuranceDesc = insuranceDesc;
	}

	/**
	 * @return the idCard
	 */
	public String getIdCard() {
		return idCard;
	}

	/**
	 * @param idCard the idCard to set
	 */
	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}

	/**
	 * @return the diploma
	 */
	public String getDiploma() {
		return diploma;
	}

	/**
	 * @param diploma the diploma to set
	 */
	public void setDiploma(String diploma) {
		this.diploma = diploma;
	}

	/**
	 * @return the skillCertificate
	 */
	public String getSkillCertificate() {
		return skillCertificate;
	}

	/**
	 * @param skillCertificate the skillCertificate to set
	 */
	public void setSkillCertificate(String skillCertificate) {
		this.skillCertificate = skillCertificate;
	}

	/**
	 * @return the tattoo
	 */
	public String getTattoo() {
		return tattoo;
	}

	/**
	 * @param tattoo the tattoo to set
	 */
	public void setTattoo(String tattoo) {
		this.tattoo = tattoo;
	}

	/**
	 * @return the scars
	 */
	public String getScars() {
		return scars;
	}

	/**
	 * @param scars the scars to set
	 */
	public void setScars(String scars) {
		this.scars = scars;
	}

	/**
	 * @return the englishLevel
	 */
	public String getEnglishLevel() {
		return englishLevel;
	}

	/**
	 * @param englishLevel the englishLevel to set
	 */
	public void setEnglishLevel(String englishLevel) {
		this.englishLevel = englishLevel;
	}

	/**
	 * @return the clothingRequirements
	 */
	public String getClothingRequirements() {
		return clothingRequirements;
	}

	/**
	 * @param clothingRequirements the clothingRequirements to set
	 */
	public void setClothingRequirements(String clothingRequirements) {
		this.clothingRequirements = clothingRequirements;
	}

	/**
	 * @return the physicalExamination
	 */
	public String getPhysicalExamination() {
		return physicalExamination;
	}

	/**
	 * @param physicalExamination the physicalExamination to set
	 */
	public void setPhysicalExamination(String physicalExamination) {
		this.physicalExamination = physicalExamination;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Job [id=");
		builder.append(id);
		builder.append(", salary=");
		builder.append(salary);
		builder.append(", position=");
		builder.append(position);
		builder.append(", age=");
		builder.append(age);
		builder.append(", sex=");
		builder.append(sex);
		builder.append(", address=");
		builder.append(address);
		builder.append(", location=");
		builder.append(location);
		builder.append(", basicSalary=");
		builder.append(basicSalary);
		builder.append(", SalaryStructure=");
		builder.append(SalaryStructure);
		builder.append(", food=");
		builder.append(food);
		builder.append(", dormitory=");
		builder.append(dormitory);
		builder.append(", traffic=");
		builder.append(traffic);
		builder.append(", JobContent=");
		builder.append(JobContent);
		builder.append(", workTime=");
		builder.append(workTime);
		builder.append(", workEnv=");
		builder.append(workEnv);
		builder.append(", contractDesc=");
		builder.append(contractDesc);
		builder.append(", Payroll=");
		builder.append(Payroll);
		builder.append(", InsuranceDesc=");
		builder.append(InsuranceDesc);
		builder.append(", idCard=");
		builder.append(idCard);
		builder.append(", diploma=");
		builder.append(diploma);
		builder.append(", skillCertificate=");
		builder.append(skillCertificate);
		builder.append(", tattoo=");
		builder.append(tattoo);
		builder.append(", scars=");
		builder.append(scars);
		builder.append(", englishLevel=");
		builder.append(englishLevel);
		builder.append(", clothingRequirements=");
		builder.append(clothingRequirements);
		builder.append(", physicalExamination=");
		builder.append(physicalExamination);
		builder.append("]");
		return builder.toString();
	}

	/**
	 * @return the company
	 */
	public JCompany getCompany() {
		return company;
	}

	/**
	 * @param company the company to set
	 */
	public void setCompany(JCompany company) {
		this.company = company;
	}

	/**
	 * @return the createDate
	 */
	public LocalDateTime getCreateDate() {
		return createDate;
	}

	/**
	 * @param createDate the createDate to set
	 */
	public void setCreateDate(LocalDateTime createDate) {
		this.createDate = createDate;
	}
}
