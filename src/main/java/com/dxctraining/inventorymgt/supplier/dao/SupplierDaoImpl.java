package com.dxctraining.inventorymgt.supplier.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.dxctraining.inventorymgt.supplier.entities.Supplier;
import com.dxctraining.inventorymgt.supplier.exceptions.SupplierNullException;

@Repository
public class SupplierDaoImpl implements ISupplierDao {
	
	@PersistenceContext
	private EntityManager entitymanager;
	
	@Override
	public Supplier findById(int id) {
		Supplier supplier = entitymanager.find(Supplier.class, id);
		if(supplier == null) {
			throw new SupplierNullException("Supplier is null");
		}
		return supplier;
	}

	@Override
	public Supplier addSupplier(Supplier supplier) {
		entitymanager.persist(supplier);
		return supplier;
	}

	@Override
	public Supplier updateSupplier(Supplier supplier) {
		entitymanager.merge(supplier);
		return supplier;
	}

	@Override
	public void removeSupplier(int id) {
		Supplier supplier = findById(id);
		entitymanager.remove(supplier);
		
	}

	@Override
	public List<Supplier> listAll() {
		String jpaql = "from Supplier";
		TypedQuery<Supplier>query=entitymanager.createQuery(jpaql, Supplier.class);
		List<Supplier>listAll=query.getResultList();
		return listAll;
	}


}