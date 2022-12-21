package com.javatpoint.model;

import javax.persistence.PostPersist;

public class AuditManager {
	
	@PostPersist
	public void testMethod(Books books)
	{
		 System.out.println("Boook details save successfully for book Id : "+books.getBookid());
	}

}
