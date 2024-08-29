package org.example.gamesapi.service;

import lombok.AllArgsConstructor;
import org.example.gamesapi.feign.GamesClient;
import org.springframework.stereotype.Service;
import org.example.gamesapi.dto.GamesDTO;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import java.util.List;

@Service
@AllArgsConstructor
public class GamesService {
    private final GamesClient gamesClient;
    private static final Logger LOGGER = LogManager.getLogger(GamesService.class);

    public List<GamesDTO> getGames(){
        LOGGER.info("Getting games from GameClient");
        return gamesClient.getGames();

    }
}
