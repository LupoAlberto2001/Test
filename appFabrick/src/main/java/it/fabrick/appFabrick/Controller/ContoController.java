package it.fabrick.appFabrick.Controller;

import it.fabrick.appFabrick.Model.Conto;
import it.fabrick.appFabrick.Repository.ContoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ContoController {
    @Autowired
    ContoRepository contoRepository;

    @PostMapping("saveConto")
    public void saveConto(@RequestBody Conto conto){ contoRepository.save(conto);}

    @GetMapping("getConto")
    public Conto getConto(){
        return (Conto) contoRepository.findAll();
    }

}
