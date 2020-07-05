package com.darc.dogrestapi.service;

import com.darc.dogrestapi.entity.Dog;

import java.util.List;

public interface DogService {
    
    List<Dog> retrieveDogs();
    List<String> retrieveDogBreed();
    String retrieveDogBreedById(Long id);
    List<String> retrieveDogNames();
}