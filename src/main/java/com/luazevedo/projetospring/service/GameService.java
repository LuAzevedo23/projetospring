package com.luazevedo.projetospring.service;

import com.luazevedo.projetospring.dto.GameDTO;
import com.luazevedo.projetospring.dto.GameMaxDTO;
import com.luazevedo.projetospring.entities.Game;
import com.luazevedo.projetospring.projections.GameProjection;
import com.luazevedo.projetospring.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    @Transactional(readOnly = true)
    public GameMaxDTO findById(Long id) {
        Game result = gameRepository.findById(id).get();
        return new GameMaxDTO(result);
    }

    @Transactional(readOnly = true)
    public List<GameDTO> findAll() {
        List<Game> result = gameRepository.findAll();
        return result.stream().map(x -> new GameDTO(x)).toList();

        //ou dessa forma tb da certo:
        //List<GameDTO> dto =result.stream().map(x -> new GameDTO(x)).toList();
        //return dto;
    }

    @Transactional(readOnly = true)
    public List<GameDTO> findByList(Long listId) {
        List<GameProjection> result = gameRepository.searchByList(listId);
        return result.stream().map(x -> new GameDTO(x)).toList();
    }
}