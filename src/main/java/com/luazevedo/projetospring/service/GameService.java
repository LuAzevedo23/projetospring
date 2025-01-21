package com.luazevedo.projetospring.service;

import com.luazevedo.projetospring.dto.GameDTO;
import com.luazevedo.projetospring.entities.Game;
import com.luazevedo.projetospring.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    public List<GameDTO> findAll() {
        List<Game> result = gameRepository.findAll();
        return result.stream().map(x -> new GameDTO(x)).toList();

        //ou dessa forma tb da certo:
        //List<GameDTO> dto =result.stream().map(x -> new GameDTO(x)).toList();
        //return dto;

    }
}
