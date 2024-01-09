package com.example.demo.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Product;
import com.example.demo.service.ProductService;

@RestController
public class ProductController {

	@Autowired
	private ProductService service;

	@PostMapping("/addProduct")
	public Product addProduct(@RequestBody Product product) {
		return service.saveProduct(product);
	}

	/*
	 * Post request working as Get request So, if there is large data for get then
	 * we can use post and send the the URL data in body of get request.
	 */
	@PostMapping("/addProduct1")
	public List<Product> addProduct1() {
		return service.getProducts();
	}

	@PostMapping("/addProducts")
	public List<Product> addProducts(@RequestBody List<Product> products) {
		return service.saveProducts(products);
	}

	@GetMapping("/getAllProduct")
	public List<Product> getAllProduct(@RequestBody Product product) {
		/*
		 * Here I'm sending data is body of get request. So if URL data is too large
		 * then we can send data in body of get request but will be against the
		 * specification
		 */
		System.out.println("=======Product name =======" + product.getName());
		return service.getProducts();
	}

	@GetMapping("/getProductById/{id}")
	public Product getProductById(@PathVariable int id) {
		return service.getProductById(id);
	}

	@DeleteMapping("/deleteProductById/{id}")
	public String deleteProductById(@PathVariable int id) {
		return service.deleteProduct(id);
	}

	@PutMapping("/updateProduct")
	public Product updateProduct(@RequestBody Product product) {
		return service.updateProduct(product);
	}

	@PatchMapping("/updateFields/{id}")
	public Product updateProductFields(@PathVariable int id, @RequestBody Map<String, Object> fields) {
		return service.updateProductByfield(id, fields);
	}

}
