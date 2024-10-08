package org.example.gamesapi.feign;

import org.example.gamesapi.dto.GamesDTO;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@org.springframework.cloud.openfeign.FeignClient(name = "games", url = "https://gamesapi0.s3.sa-east-1.amazonaws.com")
public interface GamesClient {
    @GetMapping("/Games.JSON")
    List<GamesDTO> getGames();
}
