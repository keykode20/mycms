package hello.repository;

import hello.model.Site;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface SiteRepository extends CrudRepository<Site, Integer> {

    @Override
    List<Site> findAll();

}
