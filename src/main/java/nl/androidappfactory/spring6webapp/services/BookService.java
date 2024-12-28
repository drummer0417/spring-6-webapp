package nl.androidappfactory.spring6webapp.services;

import nl.androidappfactory.spring6webapp.domain.Book;

public interface BookService {

    Iterable<Book> findAll();

}
