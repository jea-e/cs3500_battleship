package cs3500.pa04.json;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Represents joining a game.
 */
public record JoinJson(
    @JsonProperty("name") String name,
    @JsonProperty("game-type") String gameType) {

}

