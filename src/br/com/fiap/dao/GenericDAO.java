package br.com.fiap.dao;

import br.com.fiap.exception.DBException;
import br.com.fiap.exception.EntityNotFoundException;

public interface GenericDAO<T,K> {

	public void inserir(T entidade) throws DBException;
	
	public void alterar(T entidade) throws DBException;
	
	public void excluir(K chave) throws DBException, EntityNotFoundException;
	
	public T buscar(K chave) throws EntityNotFoundException;
	
}