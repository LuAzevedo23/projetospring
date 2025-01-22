package com.luazevedo.projetospring.controller;

import com.luazevedo.projetospring.dto.GameDTO;
import com.luazevedo.projetospring.dto.GameListDTO;
import com.luazevedo.projetospring.service.GameListService;
import com.luazevedo.projetospring.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {

    @Autowired
    private GameListService gameListService;
    @Autowired
    private GameService gameService;

    @GetMapping
    public List<GameListDTO> findAll() {
        List<GameListDTO> result = gameListService.findAll();
        return result;
    }
    @GetMapping(value = "/{listId}/games")
    public List<GameDTO> findByList(@PathVariable Long listId) {
        List<GameDTO> result = gameService.findByList(listId);
        return result;
    }
}
