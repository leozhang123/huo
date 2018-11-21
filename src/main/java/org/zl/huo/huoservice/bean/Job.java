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
import java.time.LocalDateTime;

import org.springframework.format.annotation.DateTimeFormat;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiModelProperty.AccessMode;

/**
 * 招聘职位信息
 * 
 * @author Leo
 * @version 0.1
 */
@ApiModel(value="Job",description="招聘职位信息")
public class Job implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2981458250011887437L;
	
	@ApiModelProperty(value="id.新建请留空",name="id",notes="新建请保持空")
	private String id;
	//综合薪资
	@ApiModelProperty(value="综合薪资",name="salary")
	private String salary;
	//工作岗位
	@ApiModelProperty(value="工作岗位",name="position")
	private String position;
	//年龄
	@ApiModelProperty(value="年龄",name="age",example="0")
	private int age;
	//性别
	@ApiModelProperty(value="性别",name="sex")
	private Sex sex;
	//地址
	@ApiModelProperty(value="地址",name="address")
	private String address;
	//工作地点
	@ApiModelProperty(value="工作地点",name="location")
	private String location;
	//底薪
	@ApiModelProperty(value="底薪",name="basicSalary")
	private String basicSalary;
	//薪资结构
	@ApiModelProperty(value="薪资结构",name="salaryStructure")
	private String salaryStructure;
	//伙食
	@ApiModelProperty(value="伙食",name="food")
	private String food;
	//住宿
	@ApiModelProperty(value="住宿",name="dormitory")
	private String dormitory;
	//交通
	@ApiModelProperty(value="交通",name="traffic")
	private String traffic;
	//工作内容
	@ApiModelProperty(value="工作内容",name="jobContent")
	private String jobContent ;
	//工作时长
	@ApiModelProperty(value="工作时长",name="workTime")
	private String workTime;
	//工作环境
	@ApiModelProperty(value="工作环境",name="workEnv")
	private String workEnv;
	//合同说明
	@ApiModelProperty(value="合同说明",name="contractDesc")
	private String contractDesc;
	//工资发放
	@ApiModelProperty(value="工资发放",name="payRoll")
	private String payRoll;
	//保险说明
	@ApiModelProperty(value="保险说明",name="insuranceDesc")
	private String insuranceDesc;
	//身份证
	@ApiModelProperty(value="身份证",name="idCard")
	private String idCard;
	//毕业证
	@ApiModelProperty(value="毕业证",name="diploma")
	private String diploma;
	//技能证书
	@ApiModelProperty(value="技能证书",name="skillCertificate")
	private String skillCertificate;
	//纹身
	@ApiModelProperty(value="纹身",name="tattoo")
	private String tattoo;
	///烟疤
	@ApiModelProperty(value="烟疤",name="scars")
	private String scars;
	//英文水平
	@ApiModelProperty(value="英文水平",name="englishLevel")
	private String englishLevel;
	//服装要求
	@ApiModelProperty(value="服装要求",name="clothingRequirements")
	private String clothingRequirements;
	//体检要求
	@ApiModelProperty(value="体检要求",name="physicalExamination")
	private String physicalExamination;
	
	@ApiModelProperty(value="创建时间",name="createDate",accessMode=AccessMode.READ_ONLY)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDateTime createDate;
	
	//企业信息
	@ApiModelProperty(value="企业id.新建请留空",name="companyId",notes="新建不要填写")
	private String companyId;
	//企业名称
	@ApiModelProperty(value="企业名称",name="companyName")
	private String companyName;
	
	//招聘公司图标
	@ApiModelProperty(value="招聘公司图标",name="companyLogo")
	private String companyLogo;
	//发薪日
	@ApiModelProperty(value="发薪日",name="payDay")
	private String payDay;
	//公司介绍
	@ApiModelProperty(value="公司介绍",name="companyInfo")
	private String companyInfo;
	
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
		return salaryStructure;
	}

	/**
	 * @param salaryStructure the salaryStructure to set
	 */
	public void setSalaryStructure(String salaryStructure) {
		this.salaryStructure = salaryStructure;
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
		return jobContent;
	}

	/**
	 * @param jobContent the jobContent to set
	 */
	public void setJobContent(String jobContent) {
		this.jobContent = jobContent;
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
	 * @return the insuranceDesc
	 */
	public String getInsuranceDesc() {
		return insuranceDesc;
	}

	/**
	 * @param insuranceDesc the insuranceDesc to set
	 */
	public void setInsuranceDesc(String insuranceDesc) {
		this.insuranceDesc = insuranceDesc;
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
			builder.append(", salaryStructure=");
			builder.append(salaryStructure);
			builder.append(", food=");
			builder.append(food);
			builder.append(", dormitory=");
			builder.append(dormitory);
			builder.append(", traffic=");
			builder.append(traffic);
			builder.append(", jobContent=");
			builder.append(jobContent);
			builder.append(", workTime=");
			builder.append(workTime);
			builder.append(", workEnv=");
			builder.append(workEnv);
			builder.append(", contractDesc=");
			builder.append(contractDesc);
			builder.append(", payRoll=");
			builder.append(payRoll);
			builder.append(", insuranceDesc=");
			builder.append(insuranceDesc);
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
			builder.append(", createDate=");
			builder.append(createDate);
			builder.append(", companyId=");
			builder.append(companyId);
			builder.append(", companyName=");
			builder.append(companyName);
			builder.append(", companyLogo=");
			builder.append(companyLogo);
			builder.append(", payDay=");
			builder.append(payDay);
			builder.append(", companyInfo=");
			builder.append(companyInfo);
			builder.append("]");
			return builder.toString();
		}

		/**
		 * @return the companyId
		 */
		public String getCompanyId() {
			return companyId;
		}

		/**
		 * @param companyId the companyId to set
		 */
		public void setCompanyId(String companyId) {
			this.companyId = companyId;
		}

		/**
		 * @return the companyName
		 */
		public String getCompanyName() {
			return companyName;
		}

		/**
		 * @param companyName the companyName to set
		 */
		public void setCompanyName(String companyName) {
			this.companyName = companyName;
		}

		/**
		 * @return the companyLogo
		 */
		public String getCompanyLogo() {
			return companyLogo;
		}

		/**
		 * @param companyLogo the companyLogo to set
		 */
		public void setCompanyLogo(String companyLogo) {
			this.companyLogo = companyLogo;
		}

		/**
		 * @return the payDay
		 */
		public String getPayDay() {
			return payDay;
		}

		/**
		 * @param companyInfo the companyInfo to set
		 */
		public void setCompanyInfo(String companyInfo) {
			this.companyInfo = companyInfo;
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

		/**
		 * @return the payRoll
		 */
		public String getPayRoll() {
			return payRoll;
		}

		/**
		 * @param payRoll the payRoll to set
		 */
		public void setPayRoll(String payRoll) {
			this.payRoll = payRoll;
		}

		/**
		 * @return the companyInfo
		 */
		public String getCompanyInfo() {
			return companyInfo;
		}

		/**
		 * @param payDay the payDay to set
		 */
		public void setPayDay(String payDay) {
			this.payDay = payDay;
		}

}
