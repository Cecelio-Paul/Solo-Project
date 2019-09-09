package com.qa.controllers;

import com.qa.models.Data;
import com.qa.repository.NoteRepository;
import com.qa.repository.PokerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sun.misc.Request;

import java.util.List;

@RestController
@CrossOrigin()

public class PokerController {

    @Autowired
    private PokerRepository repository;

    @RequestMapping(value = "Datas", method = RequestMethod.GET)
    public List<Data> listAllNotes(){
        return repository.findAll(); }

    @RequestMapping(value = "Datas", method = RequestMethod.POST)
    public Data addData(@RequestBody Data data){
        return repository.saveAndFlush(data);
    }

    @RequestMapping(value = "Datas/{id}", method = RequestMethod.GET) //only the 'datas' of id specifically gets sent back.
    public Data getData (@PathVariable Long id) {
        return repository.findOne(id);
    }

//    @RequestMapping(value = "Datas/{id}", method = RequestMethod.DELETE)
//    public Data deleteNote(@PathVariable Long id){
//        Data existing = repository.findOne(id);
//        repository.delete(existing);
//        return existing;
//  Used if you want to delete a piece of data corresponding to the id type.

    }
}
