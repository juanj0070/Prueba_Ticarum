package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertFalse;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

@DataJpaTest
public class CompeticionRepositoryTest {
    @Autowired
    private CompeticionRepository competicionRepository;

    @Test
    void cargaCompeticionDeEjemplo() {
        List<Competicion> competiciones = competicionRepository.findAll();
        assertFalse(competiciones.isEmpty());
    }
}
