package com.luazevedo.projetospring.service;

import com.luazevedo.projetospring.dto.GameDTO;
import com.luazevedo.projetospring.dto.GameListDTO;

import com.luazevedo.projetospring.entities.GameList;
import com.luazevedo.projetospring.repositories.GameListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameListService {

    @Autowired
    private GameListRepository gameListRepository;

    @Transactional(readOnly = true)
    public List<GameListDTO> findAll() {
        List<GameList> result = gameListRepository.findAll();
        return result.stream().map(x -> new GameListDTO(x)).toList();

    }
}
