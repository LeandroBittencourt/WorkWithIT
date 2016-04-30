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
				"Se voc� pretende ser rico, pense em economizar tanto quanto em ganhar.",
				"Escolher o seu tempo � ganhar tempo.",
				"quele que n�o tem confian�a nos outros, n�o lhes pode ganhar aconfian�a.",
				"O medo de perder tira a vontade de ganhar.",
				"Dif�cil � ganhar um amigo em uma hora; f�cil � ofend�-lo em um minuto.",
				"Enquanto houver vontade de lutar haver� esperan�a de vencer.",
				"� melhor conquistar a si mesmo do que vencer mil batalhas.",
				"Maior que a tristeza de n�o haver vencido � a vergonha de n�o terlutado!",
				"O importante n�o � vencer todos os dias, mas lutar sempre." };

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
