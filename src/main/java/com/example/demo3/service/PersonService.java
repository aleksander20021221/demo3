package com.example.demo3.service;

import com.example.demo3.dto.PersonDto;

public interface PersonService {
    PersonDto findById(String id);
    PersonDto create(PersonDto personDto);
    PersonDto updateWithPut(PersonDto personDto);
    PersonDto updateWithPatch(PersonDto personDto);
}
