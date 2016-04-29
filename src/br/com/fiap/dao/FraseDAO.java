package br.com.fiap.dao;

import br.com.fiap.entity.Frase;

public interface FraseDAO extends GenericDAO<Frase, Integer> {
	String getRandom();
}
