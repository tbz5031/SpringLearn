package com.tozhang.learningSpringBoot.LearnSpringBoot.repository;

import com.tozhang.learningSpringBoot.LearnSpringBoot.entity.Chapter;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;


//ReactiveCrudRepository extends Repository, a Spring Data Commons marker interface that signals Spring Data to create a concrete implementation based on the reactive paradigm while also capturing domain information. It also comes with some predefined CRUD operations (save, delete, deleteById, deleteAll, findById, findAll, and more).
public interface ChapterRepository extends ReactiveCrudRepository<Chapter, String>{
    //It specifies the entity type (Chapter) and the type of the primary key (String).



}
