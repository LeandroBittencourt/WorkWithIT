package br.com.fiap.bo;

import javax.persistence.EntityManager;

import br.com.fiap.dao.FraseDAO;
import br.com.fiap.dao.impl.FraseDAOImpl;
import br.com.fiap.entity.Frase;
import br.com.fiap.exception.DBException;
import br.com.fiap.singleton.EntityManagerFactorySingleton;

public class FraseBO {
	private FraseDAO dao;
	
	public String getFrase(){
		EntityManager em = EntityManagerFactorySingleton
				.getInstance().createEntityManager();
		dao = new FraseDAOImpl(em);
		return dao.getRandom();
	}
	
	public void setFrase(String frase, String autor){
		EntityManager em = EntityManagerFactorySingleton
				.getInstance().createEntityManager();
		dao = new FraseDAOImpl(em);
		try {
			dao.inserir(new Frase(frase,autor));
		} catch (DBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
