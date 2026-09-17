package com.example.reactiveapp.api;

import com.example.reactiveapp.domain.FunctionalService;
import com.example.reactiveapp.infrastructure.ReactiveRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class ReactiveController {
    @Autowired
    private FunctionalService functionalService;

    @GetMapping("/process")
    public Mono<String> process() {
        return functionalService.processData("example");
    }
}