package com.kg.booksss.booksss.Repository;

import com.kg.booksss.booksss.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Integer> {

}