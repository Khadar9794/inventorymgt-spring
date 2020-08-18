package com.dxctraining.inventorymgt.ui;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.dxctraining.inventorymgt.item.entities.Item;
import com.dxctraining.inventorymgt.item.service.IItemService;
import com.dxctraining.inventorymgt.supplier.entities.Supplier;
import com.dxctraining.inventorymgt.supplier.exceptions.InvalidSupplierArgumentException;
import com.dxctraining.inventorymgt.supplier.exceptions.SupplierNullException;
import com.dxctraining.inventorymgt.supplier.service.ISupplierService;

@Component
public class InventoryUi {
	
	@Autowired
	private ISupplierService supplierService;
	
	@Autowired
	private IItemService itemService;
	
	@PostConstruct
	public void runUi() {
		try {
			List<Item> list = new ArrayList<>();
			Supplier supplier1 = new Supplier("fazil");
			supplierService.addSupplier(supplier1);
			Supplier supplier2 = new Supplier("adil");
			supplierService.addSupplier(supplier2);
			Supplier supplier3 = new Supplier("mustaq");
			supplierService.addSupplier(supplier3);
			
			Item item1 = new Item("phone", supplier1);
			list.add(item1);
			itemService.addItem(item1);
			Item item2 = new Item("Computer", supplier2);
			list.add(item2);
			itemService.addItem(item2);
			Item item3 = new Item("laptop", supplier3);
			list.add(item3);
			itemService.addItem(item3);
			
			
			System.out.println("*****Fetching supplier by id*****");
			int id1 = supplier1.getId();
			Supplier fetched = supplierService.findById(id1);
			System.out.println("fetched id is "+fetched.getId()+" fetched supplier = "+fetched.getName());
			
			
			System.out.println("******Fetching item by id******");
			int itemid1 = item1.getId();
			Item itemfetched = itemService.findById(itemid1);
			System.out.println("fetched item id is "+itemfetched.getId()+" fetched item name is "+itemfetched.getName());
			
			
			System.out.println("*****Deleting an item******");
			int itemid3 = item3.getId();
			itemService.removeItem(itemid3);
			System.out.println("removed item id is "+itemid3);
			
			
		}catch (InvalidSupplierArgumentException e) {
			e.printStackTrace();
		}catch (SupplierNullException e) {
			e.printStackTrace();
		}
		
	}

}