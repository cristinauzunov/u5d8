package cristinauzunov.u5d8.controllers;

import cristinauzunov.u5d8.entities.Autore;

import cristinauzunov.u5d8.services.AutoreService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/authors")
public class AutoreController {

    private AutoreService autoreService;

    public AutoreController(AutoreService autoreService) {
        this.autoreService = autoreService;
    }

    @GetMapping
    public List<Autore> getTutti() {
        return autoreService.getTutti();
    }

    @GetMapping("/{id}")
    public Autore getById(@PathVariable String id) {
        return autoreService.getById(id);
    }

    @PostMapping
    public Autore crea(@RequestBody Autore nuovoAutore) {
        return autoreService.crea(nuovoAutore);
    }

    @PutMapping("/{id}")
    public Autore modifica(@PathVariable String id, @RequestBody Autore autoreAggiornato) {
        return autoreService.modifica(id, autoreAggiornato);
    }

    @DeleteMapping("/{id}")
    public void elimina(@PathVariable String id) {
        autoreService.elimina(id);
    }
}