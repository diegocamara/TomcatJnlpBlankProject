package com.blankjnlp.application.reports;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public class AbstractReport {

	private String path;
	private Map<String, Object> parameters;
	private List<? extends Serializable> dataSource;

	public AbstractReport(String path, Map<String, Object> parameters, List<? extends Serializable> dataSource) {
		setPath(path);
		setParameters(parameters);
		setDataSource(dataSource);
	}

	public AbstractReport() {

	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
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
