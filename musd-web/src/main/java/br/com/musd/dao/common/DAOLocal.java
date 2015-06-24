package br.com.musd.dao.common;



import br.com.musd.exception.AcessoDBError;

import java.io.Serializable;
import java.util.List;


public interface DAOLocal<T> {

	void salvar(T entity) throws AcessoDBError;

	void atualizar(T entity) throws AcessoDBError;

	void remover(Serializable id, Class<T> clazz) throws AcessoDBError;

	T getUm(Serializable id, Class<T> clazz) throws AcessoDBError;

	List<T> listar(Class<T> clazz) throws AcessoDBError;
}