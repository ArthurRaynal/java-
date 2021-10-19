package com.warriors.warriors.web.controller;

import com.warriors.warriors.dao.CharacterDao;
import com.warriors.warriors.model.Character;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CharacterController {

    @Autowired
    private CharacterDao characterDao;

    @Operation(summary = "Get all characters")
    @ApiResponse(responseCode = "200",description = "found the list")
    @RequestMapping(value = "/characters", method = RequestMethod.GET)
    public @ResponseBody
    List<Character> characterList(){
        return characterDao.findAll();
    }

    @Operation(summary = "Get character by id")
    @GetMapping(value = "/characters/{id}")
    public Character characterById(@PathVariable int id) {
        return characterDao.findById(id);
    }

    @Operation(summary = "Create character")
    @PostMapping(value = "/character")
    public Character addCharacter(@RequestBody Character character){
        return characterDao.save(character);
    }

    @Operation(summary = "Update character")
    @PutMapping(value = "/character/{id}")
    public void updateCharacter(@RequestBody Character character, @PathVariable int id){
        characterDao.update(character,id);
    }

    @Operation(summary = "Delete character by id")
    @DeleteMapping(value = "/character/{id}")
    public void deleteCharacter(@PathVariable int id){
        characterDao.deleteById(id);
    }
}
