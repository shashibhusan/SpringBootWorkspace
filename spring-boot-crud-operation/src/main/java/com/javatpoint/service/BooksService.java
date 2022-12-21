package com.javatpoint.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.javatpoint.model.Books;
import com.javatpoint.repository.BooksRepository;
import com.javatpoint.tutorialsPoint.CalculatorService;

//defining the business logic
@Service
public class BooksService {
	@Autowired
	BooksRepository booksRepository;
	
	@Autowired
	private CalculatorService calcService;

//getting all books record by using the method findaAll() of CrudRepository
	public List<Books> getAllBooks() {
		double result=calcService.add(111, 2222);
		System.out.println("=====>>"+result);
		List<Books> books = new ArrayList<Books>();
		booksRepository.findAll().forEach(books1 -> books.add(books1));
		return books;
	}

//getting a specific record by using the method findById() of CrudRepository
	public Optional<Books> getBooksById(int id) {
		return booksRepository.findById(id);
	}

//saving a specific record by using the method save() of CrudRepository
	public void saveOrUpdate(Books books) {
		booksRepository.save(books);
	}

//deleting a specific record by using the method deleteById() of CrudRepository
	public void delete(int id) {
		booksRepository.deleteById(id);
	}

//updating a record
	public void update(Books books, int bookid) {
		booksRepository.save(books);
	}
}