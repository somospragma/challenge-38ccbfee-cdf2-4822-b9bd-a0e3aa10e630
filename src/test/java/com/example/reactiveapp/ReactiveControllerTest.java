package com.example.reactiveapp;

import com.example.reactiveapp.api.ReactiveController;
import com.example.reactiveapp.domain.FunctionalService;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import reactor.core.publisher.Mono;
import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class ReactiveControllerTest {
    @Autowired
    private ReactiveController controller;

    @MockBean
    private FunctionalService functionalService;

    @Test
    public void testProcess() {
        when(functionalService.processData("example")).thenReturn(Mono.just("EXAMPLE"));
        Mono<String> result = controller.process();
        assertEquals("EXAMPLE", result.block());
    }
}