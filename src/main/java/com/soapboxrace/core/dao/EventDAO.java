package com.soapboxrace.core.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import com.soapboxrace.core.dao.util.BaseDAO;
import com.soapboxrace.core.jpa.EventEntity;

@Stateless
public class EventDAO extends BaseDAO<EventEntity> {

	@PersistenceContext
	protected void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	public EventEntity findById(String securityToken) {
		return entityManager.find(EventEntity.class, securityToken);
	}

	public List<EventEntity> findAll() {
		TypedQuery<EventEntity> createNamedQuery = entityManager.createNamedQuery("EventEntity.findAll", EventEntity.class);
		return createNamedQuery.getResultList();
	}

}