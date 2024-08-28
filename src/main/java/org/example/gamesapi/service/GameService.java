package org.example.gamesapi.service;

import lombok.AllArgsConstructor;
import org.example.gamesapi.feign.GameClient;
import org.springframework.stereotype.Service;
import org.example.gamesapi.dto.GameDTO;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import java.util.List;

@Service
@AllArgsConstructor
public class GameService {
    private final GameClient gameClient;
    private static final Logger LOGGER = LogManager.getLogger(GameService.class);

    public List<GameDTO> getGames(){
        LOGGER.info("Getting games from GameClient");
        return gameClient.getGames();

    }
}
