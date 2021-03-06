package com.dxctraining.inventorymgt.item.dao;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dxctraining.inventorymgt.item.entities.Computer;
import com.dxctraining.inventorymgt.item.entities.Item;
import com.dxctraining.inventorymgt.item.entities.Phone;
import com.dxctraining.inventorymgt.item.exceptions.ItemNullException;

@Repository
public class ItemDaoImpl implements IItemDao{
	
	@Autowired
	private EntityManager entitymanager;
	
	@Override
	public Item findById(int id) {
		Item item = entitymanager.find(Item.class, id);
		if(item == null) {
			throw new ItemNullException("item is null");
		}
		return item;
	}

	@Override
	public Item addItem(Item item) {
		entitymanager.persist(item);
		return item;
	}

	@Override
	public Item updateItem(Item item) {
		entitymanager.merge(item);
		return item;
	}

	@Override
	public void removeItem(int id) {
		Item item = findById(id);
		entitymanager.remove(item);
		
	}

	@Override
	public List<Computer> computerlist() {
		String jpaql = "from Computer";
		TypedQuery<Computer>query=entitymanager.createQuery(jpaql, Computer.class);
		List<Computer> list = query.getResultList();
		return list;
	}

	@Override
	public List<Phone> phonelist() {
		String jpaql = "from Phone";
		TypedQuery<Phone>query=entitymanager.createQuery(jpaql, Phone.class);
		List<Phone>list = query.getResultList();
		return list;
	}
	

}