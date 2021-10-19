package com.warriors.warriors.dao;

import com.warriors.warriors.model.Character;

import java.util.List;

public interface CharacterDao {
    public List<Character>findAll();
    public Character findById(int id);
    public Character save(Character character);
    public void deleteById(int id);
    public void update(Character character, int id);
}
