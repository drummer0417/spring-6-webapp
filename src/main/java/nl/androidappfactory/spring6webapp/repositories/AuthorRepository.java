package nl.androidappfactory.spring6webapp.repositories;

import nl.androidappfactory.spring6webapp.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
