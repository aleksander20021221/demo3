package com.example.demo3.service.impl;

import com.example.demo3.dto.PersonDto;
import com.example.demo3.service.PersonService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class PersonSeviceImpl implements PersonService {

    @Override
    public PersonDto findById(String id) {
        return PersonDto.builder().id(id).build();
    }

    @Override
    public PersonDto create(PersonDto personDto) {
        return personDto;
    }

    @Override
    public PersonDto updateWithPut(PersonDto personDto) {
        return personDto;
    }

    @Override
    public PersonDto updateWithPatch(PersonDto personDto) {
        return personDto;
    }


}
