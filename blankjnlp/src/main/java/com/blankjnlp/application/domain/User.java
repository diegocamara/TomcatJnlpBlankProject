package com.blankjnlp.application.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

import org.hibernate.envers.Audited;

@Entity
@Table(name = "User")
@Audited
@IdClass(UserKey.class)
public class User extends PersistentObject<UserKey> implements Serializable, IAuditLog {

    private static final long serialVersionUID = 1L;

    @Id
    private int code;

    @Column(name = "NAME")
    private String name;

    @Override
    public UserKey getKey() {
        UserKey userKey = new UserKey();
        userKey.setCode(getCode());
        return userKey;
    }

    @Override
    public long getId() {
        return getCode();
    }

    @Override
    public String getLogDetail() {

        StringBuilder detail = new StringBuilder();
        detail.append("User code: ").append(getCode()).append("User name: ").append(getName());

        return detail.toString();
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
