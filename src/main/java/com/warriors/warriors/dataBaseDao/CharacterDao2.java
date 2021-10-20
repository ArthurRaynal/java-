package com.warriors.warriors.dataBaseDao;

import com.warriors.warriors.model.Character;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CharacterDao2 extends CrudRepository<Character, Integer> {
}
