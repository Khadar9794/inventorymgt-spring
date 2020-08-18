package com.dxctraining.inventorymgt.supplier.service;

import com.dxctraining.inventorymgt.supplier.entities.Supplier;

public interface ISupplierService {
	Supplier addSupplier(Supplier supplier);
	Supplier updateSupplier(Supplier supplier);
	Supplier findById(int id);
	void removeSupplier(int id);
}
