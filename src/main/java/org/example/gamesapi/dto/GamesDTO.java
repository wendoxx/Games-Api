package org.example.gamesapi.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GamesDTO {
    private String name;
    private String description;
    private String price;
    private String developer;
}
