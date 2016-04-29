package br.com.fiap.dao.impl;

import java.util.Random;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import br.com.fiap.dao.FraseDAO;
import br.com.fiap.entity.Frase;

public class FraseDAOImpl extends GenericDAOImpl<Frase, Integer> implements FraseDAO{

	public FraseDAOImpl(EntityManager em) {
		super(em);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getRandom() {
		Query q = em.createNativeQuery("SELECT count(*) FROM Frase");
		int count = (Integer)q.getSingleResult();
		
		
		int num = new Random().nextInt(count);
		
		TypedQuery<Frase> queryResult = em.createQuery("FROM Frase f", Frase.class).setFirstResult(num).setMaxResults(1); 
		
		
		
		return queryResult.getResultList().get(0).getFrase(); 
	}
	
	

}
