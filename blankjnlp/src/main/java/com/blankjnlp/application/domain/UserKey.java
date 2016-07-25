package com.blankjnlp.application.domain;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Embeddable
public class UserKey implements Serializable {

    private static final long serialVersionUID = 1L;

    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    public Integer getId() {
	return id;
    }

    public void setId(Integer id) {
	this.id = id;
    }

}
