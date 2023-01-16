package com.example.demo3.controller;

import com.example.demo3.dto.PersonDto;
import com.example.demo3.service.PersonService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/persons")
@RequiredArgsConstructor (onConstructor_ = @Autowired)
public class PersonController {

    private final PersonService personService;

    @GetMapping("/{id}")
    public PersonDto findPersonById(@PathVariable("id") String id){
        return personService.findById(id);
    }

    @PostMapping
    public PersonDto createPerson(@RequestBody PersonDto personDto) {
        return personService.create(personDto);
    }
    @PutMapping("/{id}")
    public PersonDto updatePerson(@RequestBody PersonDto personDto){
        return personService.updateWithPut(personDto);
    }

    @PatchMapping("/{id}")
    public PersonDto updatePatch(@RequestBody PersonDto personDto){
        return personService.updateWithPatch(personDto);
    }
}
