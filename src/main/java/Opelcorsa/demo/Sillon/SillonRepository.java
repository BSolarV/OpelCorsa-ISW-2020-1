package Opelcorsa.demo.Sillon;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SillonRepository extends  CrudRepository<Sillon, Long>{
}