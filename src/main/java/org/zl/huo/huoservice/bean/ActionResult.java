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

/**
 * 接口返回对象
 * 
 * @author Leo
 * @version 0.1
 */
public class ActionResult<T> implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7102992553958095429L;

	private int code = 0;

	private String message = "success";

	private T data;

	/**
	 * 
	 */
	public ActionResult() {
		super();
	}

	/**
	 * @param data
	 */
	public ActionResult(T data) {
		super();
		this.data = data;
	}

	/**
	 * @param code
	 * @param message
	 */
	public ActionResult(int code, String message) {
		super();
		this.code = code;
		this.message = message;
	}

	/**
	 * @param code
	 * @param message
	 * @param data
	 */
	public ActionResult(int code, String message, T data) {
		super();
		this.code = code;
		this.message = message;
		this.data = data;
	}

	/**
	 * @return the code
	 */
	public int getCode() {
		return code;
	}

	/**
	 * @param code the code to set
	 */
	public void setCode(int code) {
		this.code = code;
	}

	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}

	/**
	 * @return the data
	 */
	public T getData() {
		return data;
	}

	/**
	 * @param data the data to set
	 */
	public void setData(T data) {
		this.data = data;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ActionResult [code=");
		builder.append(code);
		builder.append(", message=");
		builder.append(message);
		builder.append(", data=");
		builder.append(data);
		builder.append("]");
		return builder.toString();
	}
}
