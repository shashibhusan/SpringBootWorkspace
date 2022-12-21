package com.javatpoint.service;

import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.javatpoint.model.Books;
import com.javatpoint.repository.BooksRepository;

@ExtendWith(MockitoExtension.class)
public class BooksServiceTest {

	@Mock
	private BooksRepository booksRepository;
	
	@Mock
	private Books book;

	@InjectMocks
	private BooksService service;
	
	@Test
	public void testOtherMethods1()
	{
		List<Books> bs=service.getAllBooks();
		assertNotNull(bs);
	}
	
	@Test
	public void testOtherMethods2()
	{
		Optional<Books> bs=service.getBooksById(1236);
		assertNotNull(bs);
	}

	@Test
	public void testAllMethod() {
		service.delete(111111);
		verify(booksRepository, times(1)).deleteById(111111);
		
		service.update(book,11);
		verify(booksRepository, times(1)).save(book);
	}
	
	@Test
	public void testOtherMethods()
	{
		 service.saveOrUpdate(book);
		 verify(booksRepository, times(1)).save(book);
	}
	
	

}
