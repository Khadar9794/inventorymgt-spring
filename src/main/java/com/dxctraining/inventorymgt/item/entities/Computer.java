package com.dxctraining.inventorymgt.item.entities;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

import com.dxctraining.inventorymgt.supplier.entities.Supplier;

@Inheritance (strategy = InheritanceType.JOINED)
@Entity
public class Computer extends Item {
	private int discsize;
	
	public Computer() {
		
	}
	public Computer(String name, Supplier supplier, int discsize) {
		super(name, supplier);
		this.discsize = discsize;
	}
	public int getDiscsize() {
		return discsize;
	}
	public void setDiscsize(int discsize) {
		this.discsize = discsize;
	}
	
}
