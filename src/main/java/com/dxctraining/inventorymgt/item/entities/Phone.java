package com.dxctraining.inventorymgt.item.entities;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

import com.dxctraining.inventorymgt.supplier.entities.Supplier;

@Inheritance(strategy = InheritanceType.JOINED)
@Entity
public class Phone extends Item {
	private int storagesize;
	
	public Phone() {
		
	}
	
	public Phone(String name, Supplier supplier, int storagesize) {
		super(name, supplier);
		this.storagesize = storagesize;
	}

	public int getStoragesize() {
		return storagesize;
	}

	public void setStoragesize(int storagesize) {
		this.storagesize = storagesize;
	}
	
	

}
