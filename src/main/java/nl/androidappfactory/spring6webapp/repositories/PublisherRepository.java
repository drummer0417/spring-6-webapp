package nl.androidappfactory.spring6webapp.repositories;

import nl.androidappfactory.spring6webapp.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
