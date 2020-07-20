package Opelcorsa.demo.Quimioterapia;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuimioterapiaRepository extends CrudRepository<Quimioterapia, Long> {
	Quimioterapia findByID(long id);
	
}
