package br.com.fiap.tests;

import java.util.List;

import javax.persistence.EntityManager;
import br.com.fiap.dao.impl.FraseDAOImpl;
import br.com.fiap.entity.Frase;
import br.com.fiap.singleton.EntityManagerFactorySingleton;

public class BuscaTodasFrases {

	public static void main(String[] args) {

		EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();

		FraseDAOImpl fraseDAO = new FraseDAOImpl(em);

		List<Frase> lista = fraseDAO.getAllSentences();
		System.out.println("tamanho lista: " + lista.size());
		
		for(Frase f: lista){
			System.out.println("FRASE: "+f.getFrase());
		}
	}
}
