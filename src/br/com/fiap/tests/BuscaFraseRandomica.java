package br.com.fiap.tests;

import br.com.fiap.dao.impl.FraseDAOImpl;
import br.com.fiap.entity.Frase;
import br.com.fiap.singleton.EntityManagerFactorySingleton;

public class BuscaFraseRandomica {
	public static void main(String[] args) {

		FraseDAOImpl fraseDAO = new FraseDAOImpl(EntityManagerFactorySingleton.getInstance().createEntityManager());

		Frase frase = fraseDAO.getRandom();

		System.out.println("FRASE: " + frase.getFrase());
		System.out.println("ID: " + frase.getId());

		Frase frase2 = fraseDAO.getRandom();

		System.out.println("FRASE: " + frase2.getFrase());
		System.out.println("ID: " + frase2.getId());

		Frase frase3 = fraseDAO.getRandom();

		System.out.println("FRASE: " + frase3.getFrase());
		System.out.println("ID: " + frase3.getId());

	}

}
