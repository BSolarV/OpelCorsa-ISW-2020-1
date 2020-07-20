package Opelcorsa.demo.Quimioterapia;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class QuimioterapiaService {
	
	@Autowired
    private QuimioterapiaRepository quimioterapiaRepository;

    public Iterable<Quimioterapia> listAll(){
        return quimioterapiaRepository.findAll();
    }
    
    public Optional<Quimioterapia> encontrarSala(long id){
    	return quimioterapiaRepository.findById(id);
    }
    
    public Quimioterapia agregarSala(Quimioterapia quimioterapia){
        return quimioterapiaRepository.save(quimioterapia);
    }
    
    public void eliminarSala(long id){
    	quimioterapiaRepository.deleteById(id);
    }
}
