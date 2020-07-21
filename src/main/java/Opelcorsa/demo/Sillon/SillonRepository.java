package Opelcorsa.demo.Sillon;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import Opelcorsa.demo.Quimioterapia.Quimioterapia;

@Repository
public interface SillonRepository extends  CrudRepository<Sillon, Long>{
	Sillon findByid(long id);
}