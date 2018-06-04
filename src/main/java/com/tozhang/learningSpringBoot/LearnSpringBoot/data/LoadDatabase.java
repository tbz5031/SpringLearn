package com.tozhang.learningSpringBoot.LearnSpringBoot.data;

import com.tozhang.learningSpringBoot.LearnSpringBoot.entity.Chapter;
import com.tozhang.learningSpringBoot.LearnSpringBoot.repository.ChapterRepository;
import reactor.core.publisher.Flux;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration  //@Configuration marks this class as a source of beans.
public class LoadDatabase {

    @Bean //@Bean indicates that the return value of init() is a Spring Bean--​in this case, a CommandLineRunner (utility class from Spring Boot).
    //Spring Boot runs all CommandLineRunner beans after the entire application is up and running. This bean definition requests a copy of ChapterRepository.
    CommandLineRunner init(ChapterRepository repository) {
        return args -> {
            Flux.just(
                    new Chapter("Quick Start with Java"),
                    new Chapter("Reactive Web with Spring Boot"),
                    new Chapter("...and more!"))
                    .flatMap(repository::save)
                    .subscribe(System.out::println);
        };
    }

}
