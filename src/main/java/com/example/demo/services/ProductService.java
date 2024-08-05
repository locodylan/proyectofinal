package com.example.demo.services;

import java.util.List;
import com.example.demo.model.*;

public interface ProductService {
	Product getProduct(int id);
	List<Product> listProducts();
}
