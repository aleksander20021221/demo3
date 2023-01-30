package com.example.demo3.controller;

import com.example.demo3.dto.PersonDto;
import com.example.demo3.service.PersonService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.websocket.server.PathParam;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Map;


@RestController
@RequestMapping("/persons")
@RequiredArgsConstructor (onConstructor_ = @Autowired)
public class PersonController {

    private final PersonService personService;

    @GetMapping("/{id}")
    public PersonDto findById(@PathVariable("id") String id){
        return personService.findById(id);
    }

    @PostMapping
    public PersonDto createPerson(@RequestBody PersonDto personDto) {
        return personService.create(personDto);
    }

    @PutMapping("/{id}")
    public PersonDto updatePut(
            @RequestBody PersonDto personDto,
            @PathVariable("id") String id,
            @RequestParam("id") String paramId,
            @RequestHeader Map<String, String> headers,
            @RequestHeader(value = "Content-Type") String contentType,
            HttpServletRequest request,
            HttpServletResponse response
    ){
        return personService.updateWithPut(personDto, id);
    }

    @PatchMapping("/{id}")
    public PersonDto updatePatch(@RequestBody PersonDto personDto, @PathVariable("id") String id){
        return personService.updateWithPatch(personDto, id);
    }

    @DeleteMapping("/{id}")
    public void delete (@PathVariable("id") String id){
        personService.delete(id);
    }

}
