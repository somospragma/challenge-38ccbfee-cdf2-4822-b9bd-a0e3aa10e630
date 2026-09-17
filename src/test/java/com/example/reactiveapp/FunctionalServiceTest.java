package com.example.reactiveapp;

import com.example.reactiveapp.domain.FunctionalService;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;
import static org.junit.jupiter.api.Assertions.*;

public class FunctionalServiceTest {
    @Test
    public void testProcessData() {
        FunctionalService service = new FunctionalService();
        Mono<String> result = service.processData("example");
        assertEquals("EXAMPLE", result.block());
    }
}