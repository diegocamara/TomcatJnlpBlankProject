package com.blankjnlp.application.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@Table(name = "User")
@IdClass(UserKey.class)
public class User extends PersistentObject<UserKey> {

    @Id
    private Integer id;

    @Column(name = "NAME")
    private String name;

    @Override
    public UserKey getKey() {
	UserKey userKey = new UserKey();
	userKey.setId(getId());
	return userKey;
    }

    public Integer getId() {
	return id;
    }

    public void setId(Integer id) {
	this.id = id;
    }

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

}
