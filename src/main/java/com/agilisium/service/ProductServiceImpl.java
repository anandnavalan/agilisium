package com.agilisium.service;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import org.springframework.stereotype.Service;

import com.agilisium.model.Product;

@Service
public class ProductServiceImpl implements ProductService {

	private static Set<Product> products = new HashSet<>();

	static {
		Product apple = new Product();
		apple.setId(1);
		apple.setName("Iphone 11 Pro Max");
		apple.setPrice(65000D);
		products.add(apple);

		Product oneplus = new Product();
		oneplus.setId(2);
		oneplus.setName("Oneplus 8 Pro");
		oneplus.setPrice(65000D);
		products.add(oneplus);

		Product samsung = new Product();
		samsung.setId(3);
		samsung.setName("Samsung S20");
		samsung.setPrice(79999D);
		products.add(samsung);
	}

	@Override
	public Collection<Product> getProducts() {
		return products;
	}

}