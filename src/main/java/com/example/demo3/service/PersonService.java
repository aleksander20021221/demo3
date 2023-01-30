package com.example.demo3.service;

import com.example.demo3.dto.PersonDto;

public interface PersonService {
    public PersonDto findById(String id);
    public PersonDto create(PersonDto personDto);
    public PersonDto updateWithPut(PersonDto personDto, String id);
    public PersonDto updateWithPatch(PersonDto personDto, String id);
    void delete (String id);

}
