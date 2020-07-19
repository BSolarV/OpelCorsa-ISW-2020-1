package Opelcorsa.demo.Quimioterapia;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class Quimioterapia {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    
}