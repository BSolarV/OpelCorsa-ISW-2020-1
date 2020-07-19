package Opelcorsa.demo.Sillon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SillonService {

    @Autowired
    private SillonRepository sillonRepository;

    public Sillon agregarSillon(Sillon sillon){
        return sillonRepository.save(sillon);
    }

    public Iterable<Sillon> listAll(){
        return sillonRepository.findAll();
    }

    public void eliminarSillon(long id){
        sillonRepository.deleteById(id);
    }

    public Sillon obtenerSillon(long id){
        return sillonRepository.
    }
    
}