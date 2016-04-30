package br.com.fiap.dao.impl;

import java.util.List;
import java.util.Random;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import br.com.fiap.dao.FraseDAO;
import br.com.fiap.entity.Frase;

public class FraseDAOImpl extends GenericDAOImpl<Frase, Integer> implements FraseDAO {

	public FraseDAOImpl(EntityManager em) {
		super(em);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Frase getRandom() {

		Query q = em.createQuery("select id from Frase");

		@SuppressWarnings("unchecked")
		List<Integer> listaDeIds = q.getResultList();

		Random randomGenerator = new Random();
		int randIndex = randomGenerator.nextInt(listaDeIds.size());
		int idAleatorio = listaDeIds.get(randIndex);
		Frase frase = em.find(Frase.class, idAleatorio);

		return frase;

	}

	public List<Frase> getAllSentences() {

		TypedQuery<Frase> q = em.createQuery("from Frase f", Frase.class);
		List<Frase> lista = q.getResultList();

		return lista;
	}

}
