package com.warriors.warriors.web.controller;

import com.warriors.warriors.dataBaseDao.CharacterDao2;
import com.warriors.warriors.model.Character;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class CharacterController {

    @Autowired
    private CharacterDao2 characterDao;

    @Operation(summary = "Get all characters")
    @RequestMapping(value = "/characters", method = RequestMethod.GET)
    public @ResponseBody
    Iterable<Character> characterList(){
        return characterDao.findAll();
    }

    @Operation(summary = "Get character by id")
    @GetMapping(value = "/characters/{id}")
    public Optional<Character> characterById(@PathVariable int id) {
        return characterDao.findById(id);
    }

    @Operation(summary = "Create character")
    @PostMapping(value = "/character")
    public Character addCharacter(@RequestBody Character character){
        return characterDao.save(character);
    }

    @Operation(summary = "Update character")
    @PutMapping(value = "/character/{id}")
    public Character updateCharacter(@RequestBody Character character, @PathVariable int id){
        character.setId(id);
        return characterDao.save(character);
    }

    @Operation(summary = "Delete character by id")
    @DeleteMapping(value = "/character/{id}")
    public void deleteCharacter(@PathVariable int id){
        characterDao.deleteById(id);
    }
}
