package com.example.reactiveapp.domain;

import reactor.core.publisher.Mono;

public class FunctionalService {
    public Mono<String> processData(String input) {
        return Mono.just(input.toUpperCase());
    }
}