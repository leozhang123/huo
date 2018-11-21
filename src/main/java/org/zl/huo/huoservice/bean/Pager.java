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
import java.util.List;

import io.swagger.annotations.ApiModelProperty;

/**
 * 分页对象
 * @author Leo
 *
 */
public class Pager<T> implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8356052910275015241L;
	
	public static final int DEFAULT_SIZE = 10;
	
	@ApiModelProperty(value="页号",name="pageNo",example="0")
	private int page = 0;
	
	@ApiModelProperty(value="页大小",name="pageSize",example="10")
	private int pageSize = DEFAULT_SIZE;
	
	@ApiModelProperty(value="页数",name="totalPages",example="0")
	private int totalPages;
	
	@ApiModelProperty(value="结果集总数",name="totalElements",example="0")
	private long totalElements;
	
	@ApiModelProperty(value="结果集",name="rows")
	private List<T> data;
	
	/**
	 * 
	 */
	public Pager() {
		super();
	}
	/**
	 * @param page
	 * @param size
	 */
	public Pager(int page, int size) {
		if (page < 0) {
			throw new IllegalArgumentException("Page index must not be less than zero!");
		}

		if (size < 1) {
			throw new IllegalArgumentException("Page size must not be less than one!");
		}
		this.page = page;
		this.pageSize = size;
	}
	/**
	 * @return the page
	 */
	public int getPage() {
		return page;
	}
	/**
	 * @param page the page to set
	 */
	public void setPage(int page) {
		this.page = page;
	}

	/**
	 * @return the data
	 */
	public List<T> getData() {
		return data;
	}
	/**
	 * @param data the data to set
	 */
	public void setData(List<T> data) {
		this.data = data;
	}
	/**
	 * @return the totalPages
	 */
	public int getTotalPages() {
		return totalPages;
	}
	/**
	 * @param totalPages the totalPages to set
	 */
	public void setTotalPages(int totalPages) {
		this.totalPages = totalPages;
	}
	/**
	 * @return the pageSize
	 */
	public int getPageSize() {
		return pageSize;
	}
	/**
	 * @param pageSize the pageSize to set
	 */
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	/**
	 * @return the totalElements
	 */
	public long getTotalElements() {
		return totalElements;
	}
	/**
	 * @param totalElements the totalElements to set
	 */
	public void setTotalElements(long totalElements) {
		this.totalElements = totalElements;
	}

	@ApiModelProperty(value="首页",name="firstPage",example="false")
	public boolean isFirstPage() {
		return getPage() == 0;
	}

	@ApiModelProperty(value="末页",name="lastPage",example="false")
	public boolean isLastPage() {
		return getPage() == getTotalPages()-1;
	}

	public boolean hasPrevPage() {
		return getPage() >= 2;
	}

	public boolean hasNextPage() {
		return getPage() <= getTotalPages() - 1L;
	}
}
