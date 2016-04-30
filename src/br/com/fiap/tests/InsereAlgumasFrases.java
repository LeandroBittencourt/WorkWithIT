package br.com.fiap.tests;

import javax.persistence.EntityManager;

import br.com.fiap.dao.impl.FraseDAOImpl;
import br.com.fiap.entity.Frase;
import br.com.fiap.exception.DBException;
import br.com.fiap.singleton.EntityManagerFactorySingleton;

public class InsereAlgumasFrases {

	public static void main(String[] args) {

		EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();
		FraseDAOImpl fraseDAO = new FraseDAOImpl(em);

		// ## POPULA O BANCO COM ALGUMAS FRASES
		// ----------------------------------------------------------

		String[] fraseArray = { "De que serve ao homem conquistar o mundointeiro se perder a alma?",
				"Se você pretende ser rico, pense em economizar tanto quanto em ganhar.",
				"Escolher o seu tempo é ganhar tempo.",
				"quele que não tem confiança nos outros, não lhes pode ganhar aconfiança.",
				"O medo de perder tira a vontade de ganhar.",
				"Difícil é ganhar um amigo em uma hora; fácil é ofendê-lo em um minuto.",
				"Enquanto houver vontade de lutar haverá esperança de vencer.",
				"É melhor conquistar a si mesmo do que vencer mil batalhas.",
				"Maior que a tristeza de não haver vencido é a vergonha de não terlutado!",
				"O importante não é vencer todos os dias, mas lutar sempre." };

		String[] fraseAutorArray = { "GG Martin", "Sergio Cortella", "RamonJuarez", "Seu Madruga", "William Bonner",
				"Deputado Sergio Reis", "Almir Sater", "Whasington Olivetto", "GloriaPerez", "JK Rowling" };

		for (int i = 0; i < 10; i++) {

			Frase frase = new Frase();
			frase.setFrase(fraseArray[i]);
			frase.setAutor(fraseAutorArray[i]);

			try {
				fraseDAO.inserir(frase);
			} catch (DBException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
