package com.warriors.warriors.dao;

import com.warriors.warriors.model.Character;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CharacterDaoImpl implements CharacterDao{

    public static  List<Character> list = new ArrayList<>();

    static {
        list.add(new Character(0, "char1", "mage"));
        list.add(new Character(1, "char2", "warrior"));
        list.add(new Character(2, "char3", "mage"));
    }

    @Override
    public List<Character> findAll() {
        return list;
    }

    @Override
    public Character findById(int id) {
        return list.get(id);
    }

    @Override
    public Character save(Character character) {
        list.add(character);
        return character;
    }

    @Override
    public void deleteById(int id) {
        list.removeIf(character -> character.getId() == id);
    }

    @Override
    public void update(Character updateCharacter, int id) {
        for (Character character : list){
            if (character.getId() == id){
                character.setName(updateCharacter.getName());
                character.setJob(updateCharacter.getJob());
            }
        }
    }
}
