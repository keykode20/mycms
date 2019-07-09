package hello.repository;

import hello.model.Site;
import org.springframework.data.repository.CrudRepository;

public interface SiteRepository extends CrudRepository<Site, Integer> {
}
