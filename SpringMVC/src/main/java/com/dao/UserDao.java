package com.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.model.User;
@Repository
public class UserDao {
	
	private HibernateTemplate hibernateTemplate;

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	@Transactional
	public void inserUPdateUser(User u) {
		this.hibernateTemplate.saveOrUpdate(u);
	}
	
	public User getModelById(int id) {
		User m =this.hibernateTemplate.get(User.class, id);
		return m;
	}
	public List<User> getAllModel(){
		List<User> list =  this.hibernateTemplate.loadAll(User.class);
		return list;
	}
	
	@Transactional
	public void deleteModel(User m) {
		this.hibernateTemplate.delete(m);
	}
	
}
