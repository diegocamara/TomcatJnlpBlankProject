package com.blankjnlp.application.reports;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public class AbstractReport {

	private String fileName;
	private Map<String, Object> parameters;
	private List<? extends Serializable> dataSource;

	public AbstractReport(String fileName, Map<String, Object> parameters, List<? extends Serializable> dataSource) {
		setFileName(fileName);
		setParameters(parameters);
		setDataSource(dataSource);
	}

	public AbstractReport() {

	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public Map<String, Object> getParameters() {
		return parameters;
	}

	public void setParameters(Map<String, Object> parameters) {
		this.parameters = parameters;
	}

	public List<? extends Serializable> getDataSource() {
		return dataSource;
	}

	public void setDataSource(List<? extends Serializable> dataSource) {
		this.dataSource = dataSource;
	}

}
