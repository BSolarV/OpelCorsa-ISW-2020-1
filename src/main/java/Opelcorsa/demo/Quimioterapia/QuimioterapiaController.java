package Opelcorsa.demo.Quimioterapia;

import java.util.Optional;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Opelcorsa.demo.Sillon.Sillon;
import Opelcorsa.demo.Sillon.SillonRepository;
import Opelcorsa.demo.Sillon.SillonService;

import org.springframework.web.bind.annotation.PathVariable;




@RestController
@RequestMapping("/quimioterapia")
public class QuimioterapiaController {
	
	@Autowired
	private QuimioterapiaService quimioterapiaService;
	
	
	@Autowired
	private SillonService sillonService;
	
	
	@GetMapping("")
    public Iterable<Quimioterapia> getSalas (){
        return quimioterapiaService.listAll();
    }
	
	@GetMapping("/{id}")
	public Optional<Quimioterapia> verSala(long id) {
		return quimioterapiaService.encontrarSala(id);
	}
	
	@PostMapping("")
	public ResponseEntity<Quimioterapia> addSala(@RequestBody Quimioterapia quimioterapia){
		Quimioterapia nuevo = quimioterapiaService.agregarSala(quimioterapia);
		return new ResponseEntity<Quimioterapia>(nuevo,HttpStatus.CREATED);
	}
	
	@DeleteMapping("/{id}")
	public void deleteSala(@PathVariable long id){
		 quimioterapiaService.eliminarSala(id);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Quimioterapia> updateSala(@RequestBody Quimioterapia quimioterapiaDetails, @PathVariable long id ){
		//Quimioterapia quimioterapia = quimioterapiaRepository.findById(id);
		//.orElseThrow((Supplier<? extends X>) () -> new ResourceNotFoundException("Employee not found for this id :: " + id));
		Quimioterapia quimioterapia = quimioterapiaService.actualizarSala(id);
		//quimioterapia.setId(quimioterapiaDetails.getId());
		quimioterapia.setPiso(quimioterapiaDetails.getPiso());
		quimioterapia.setNumero(quimioterapiaDetails.getNumero());
		final Quimioterapia updatedQuimioterapia = quimioterapiaService.agregarSala(quimioterapia);
		
		
		return new ResponseEntity<Quimioterapia>(updatedQuimioterapia,HttpStatus.CREATED);
	}
	
	@PostMapping("/sillon")
	public Iterable<Quimioterapia> assingSillonToSala(@RequestBody SalaSillon data) {
		System.out.println("\n\n\n\n\n\n\n\n***************************\n\n\n\n\n\n\n");
		System.out.println(data.idSala);
		System.out.println(data.idSillon);
		System.out.println("\n\n\n\n\n\n\n\n***************************\n\n\n\n\n\n\n");
		Quimioterapia quimioterapia = quimioterapiaService.actualizarSala(data.idSala);
		Sillon sillon = sillonService.encontrarSillon(data.idSillon);
		quimioterapia.addSillon(sillon);
        return quimioterapiaService.listAll();
	}

	@DeleteMapping("/sillon")
	public Iterable<Quimioterapia> deleteSillonFromSala(long idSala, long idSillon){
		Quimioterapia quimioterapia = quimioterapiaService.actualizarSala(idSala);
		Sillon sillon = sillonService.encontrarSillon(idSillon);
		quimioterapia.removeSillon(sillon);
        return quimioterapiaService.listAll();
	}
}