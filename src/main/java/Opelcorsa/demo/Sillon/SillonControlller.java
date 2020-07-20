package Opelcorsa.demo.Sillon;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/quimioterapia/sillones")
public class SillonControlller {

    @Autowired
    private SillonService sillonService;

    @PostMapping("")
    public ResponseEntity<Sillon> addSillon(@RequestBody Sillon sillon) {
        Sillon nuevo = sillonService.agregarSillon(sillon);
        return new ResponseEntity<Sillon>(nuevo, HttpStatus.CREATED);
    }

    @GetMapping("")
    public Iterable<Sillon> getSillones() {
        return sillonService.listAll();
    }

    @DeleteMapping(path = "/{id}")
    public void deleteSillon(@PathVariable long id) {
        sillonService.eliminarSillon(id);
    }

    @GetMapping(path = "/{id}")
    public Optional<Sillon> getSillon(@PathVariable long id) {
        return sillonService.obtenerSillon(id);
    }

    @PutMapping(path = "/{id}")
    public void updateSillon(@PathVariable long id){
        
    }
    
}