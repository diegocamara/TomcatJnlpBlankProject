package com.blankjnlp.application.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.springframework.stereotype.Component;

import com.blankjnlp.application.domain.User;

@Component
public class UserDAO extends AbstractDAO<User>{

	public List<User> findAll() {
		Criteria criteria = createCriteria();		
		return (List<User>)criteria.list();
	}

}
