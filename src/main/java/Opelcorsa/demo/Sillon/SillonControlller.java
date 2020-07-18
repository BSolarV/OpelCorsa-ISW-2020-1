package Opelcorsa.demo.Sillon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/quimioterapia/sillones")
public class SillonControlller {
    
    @Autowired
    private SillonService sillonService;

    @PostMapping
}