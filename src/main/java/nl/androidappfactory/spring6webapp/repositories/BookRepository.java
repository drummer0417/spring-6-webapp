package nl.androidappfactory.spring6webapp.repositories;

import nl.androidappfactory.spring6webapp.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
