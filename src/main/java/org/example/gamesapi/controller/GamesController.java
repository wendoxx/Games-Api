package org.example.gamesapi.controller;

import lombok.AllArgsConstructor;
import org.example.gamesapi.dto.GamesDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.example.gamesapi.service.GamesService;

import java.util.List;

@RestController
@RequestMapping("/games")
@AllArgsConstructor
public class GamesController {

    private final GamesService gamesService;

    @GetMapping("/list")
    public ResponseEntity<List<GamesDTO>> getAllGames() {
    List<GamesDTO> games = gamesService.getGames();
    return ResponseEntity.ok().body(games);
    }
}
