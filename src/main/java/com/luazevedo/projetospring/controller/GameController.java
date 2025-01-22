package com.luazevedo.projetospring.controller;

import com.luazevedo.projetospring.dto.GameDTO;
import com.luazevedo.projetospring.dto.GameMaxDTO;
import com.luazevedo.projetospring.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/games")
public class GameController {

    @Autowired
    private GameService gameService;

    @GetMapping(value = "/{id}")
    public GameMaxDTO findById(@PathVariable Long id) {
        GameMaxDTO result = gameService.findById(id);
        return result;

    }

    @GetMapping
    public List<GameDTO> findAll() {
        List<GameDTO> result = gameService.findAll();
        return result;
    }
}
