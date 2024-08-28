package org.example.gamesapi.service;

import lombok.AllArgsConstructor;
import org.example.gamesapi.feign.GameClient;
import org.springframework.stereotype.Service;
import org.example.gamesapi.dto.GameDTO;

import java.util.List;

@Service
@AllArgsConstructor
public class GameService {
    private final GameClient gameClient;

    public List<GameDTO> getGames(){
        return gameClient.getGames();
    }
}
