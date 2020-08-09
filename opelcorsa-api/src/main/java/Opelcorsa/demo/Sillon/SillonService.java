package Opelcorsa.demo.Sillon;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SillonService {

    @Autowired
    private SillonRepository sillonRepository;

    public Sillon agregarSillon(final Sillon sillon) {
        return sillonRepository.save(sillon);
    }

    public Iterable<Sillon> listAll() {
        return sillonRepository.findAll();
    }

    public void eliminarSillon(final long id) {
        sillonRepository.deleteById(id);
    }

    public Optional<Sillon> obtenerSillon(final long id) {
        return sillonRepository.findById(id);
    }
    
    public Sillon encontrarSillon(final long id) {
        return sillonRepository.findByid(id);
    }
}