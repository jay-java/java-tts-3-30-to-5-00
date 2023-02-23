package com.orm;

import java.util.List;
import javax.transaction.Transactional;
import org.springframework.orm.hibernate5.HibernateTemplate;

public class Dao {
	private HibernateTemplate hibernateTemplate;

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	@Transactional
	public void insertUser(Model m) {
		this.hibernateTemplate.save(m);
	}
	public Model getModelById(int id) {
		Model m =this.hibernateTemplate.load(Model.class, id);
		return m;
	}
	public List<Model> getAllModel(){
		List<Model> list =  this.hibernateTemplate.loadAll(Model.class);
		return list;
	}
	@Transactional
	public void updateModel(Model m) {
		this.hibernateTemplate.update(m);
	}
	@Transactional
	public void deleteModel(Model m) {
		this.hibernateTemplate.delete(m);
	}
}
