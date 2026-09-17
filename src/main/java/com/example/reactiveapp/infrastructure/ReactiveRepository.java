package com.example.reactiveapp.infrastructure;

import reactor.core.publisher.Flux;

public interface ReactiveRepository {
    Flux<String> findAll();
}