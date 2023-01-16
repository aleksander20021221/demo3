package com.example.demo3.service;

import com.example.demo3.dto.PersonDto;

public interface PersonService {
    public PersonDto findById(String id);
    public PersonDto create(PersonDto personDto);
    public PersonDto updateWithPut(PersonDto personDto);
    public PersonDto updateWithPatch(PersonDto personDto);

}
