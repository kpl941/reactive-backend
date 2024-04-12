package com.thepracticaldeveloper.reactiveweb.repository;

import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.reactive.ReactiveSortingRepository;

import com.thepracticaldeveloper.reactiveweb.domain.Quote;

import reactor.core.publisher.Flux;

public interface QuoteMongoReactiveRepository extends ReactiveSortingRepository<Quote,String>{
	
	Flux<Quote> findAllByIdNotNullOrderByIdAsc(final Pageable page);
	
}
