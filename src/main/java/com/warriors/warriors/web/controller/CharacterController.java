package com.warriors.warriors.web.controller;

import com.warriors.warriors.model.Character;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CharacterController {

    @RequestMapping(value = "/Characters", method = RequestMethod.GET)
    public @ResponseBody
    List<Character> characterList(){
        Character char1 = new Character(1,"char1","mage");
        Character char2 = new Character(2,"char2","warrior");
        Character char3 = new Character(3,"char3","mage");
        List<Character> list = new ArrayList<>();
        list.add(char1);
        list.add(char2);
        list.add(char3);
        return list;
    }

    @GetMapping(value = "/Characters/{id}")
    public Character characterById(@PathVariable int id) {
        Character char1 = new Character(1, "char1", "mage");
        Character char2 = new Character(2, "char2", "warrior");
        Character char3 = new Character(3, "char3", "mage");
        List<Character> list = new ArrayList<>();
        list.add(char1);
        list.add(char2);
        list.add(char3);
        return list.get(id-1);
    }
}
