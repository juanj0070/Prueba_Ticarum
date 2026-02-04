package com.example.demo;

import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/competiciones")
public class CompeticionController {
    private final CompeticionRepository competicionRepository;

    public CompeticionController(CompeticionRepository competicionRepository) {
        this.competicionRepository = competicionRepository;
    }

    @PostMapping
    public ResponseEntity<Competicion> crearCompeticion(@RequestBody Competicion competition) {
        Competicion saved = competicionRepository.save(competition);
        return ResponseEntity.status(HttpStatus.CREATED).body(saved);
    }

    @GetMapping
    public List<Competicion> listarCompeticiones() {
        return competicionRepository.findAll();
    }
}
