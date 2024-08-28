package org.example.gamesapi.feign;

import org.example.gamesapi.DTO.GameDTO;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@org.springframework.cloud.openfeign.FeignClient(name = "games", url = "https://gamesapi0.s3.sa-east-1.amazonaws.com")
public interface GameClient {
    @GetMapping("/Games.JSON")
    List<GameDTO> getGames();
}
