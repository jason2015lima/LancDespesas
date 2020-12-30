package com.lancamento.despesa.dao;

import java.io.Serializable;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import com.lancamento.despesa.model.CentroCusto;

public class CentroCustoDAO implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Inject
	private EntityManager em;
	
	public void salvar(CentroCusto centroCusto) {
		em.merge(centroCusto);
	}

}
