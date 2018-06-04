package com.tozhang.learningSpringBoot.LearnSpringBoot.Controller;


import com.tozhang.learningSpringBoot.LearnSpringBoot.entity.Chapter;
import com.tozhang.learningSpringBoot.LearnSpringBoot.repository.ChapterRepository;
import reactor.core.publisher.Flux;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ChapterController {
    private final ChapterRepository repository;

    //Constructor injection is used to automatically load it with a copy of ChapterRepository. With Spring, if there is only one constructor call, there is no need to include an @Autowired annotation.
    public ChapterController(ChapterRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/chapters")
    //@GetMapping tells Spring that this is the place to route /chapters calls. In this case, it returns the results of the findAll() call found in ReactiveCrudRepository.
    public Flux<Chapter> listing() {
        return repository.findAll();
    }
}
