package org.example.gamesapi.controller;

import lombok.AllArgsConstructor;
import org.example.gamesapi.dto.GameDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.example.gamesapi.service.GameService;

import java.util.List;

@RestController
@RequestMapping("/games")
@AllArgsConstructor
public class GameController {

    private final GameService gameService;

    @GetMapping("/list")
    public ResponseEntity<List<GameDTO>> getAllGames() {
    List<GameDTO> games = gameService.getGames();
    return ResponseEntity.ok().body(games);
    }
}
