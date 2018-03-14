package com.fran.restfulSpringBootExample.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.fran.restfulSpringBootExample.entities.Game;

import lombok.extern.slf4j.Slf4j;

@Component
@Scope("prototype")
@Slf4j
public class GameService
{
    private List<Game> games = new ArrayList<>();

    public GameService () {
        Game game1 = new Game();
        game1.setName("Mario");
        game1.setId(1L);
        games.add(game1);

        Game game2 = new Game();
        game2.setId(2L);
        game2.setName("Fifa");

        games.add(game2);
    }

    public void addGame(Game game) {
        log.info(games.toString());
        games.add(game);
    }

    public List<Game> getGames() {
        log.info(games.toString());
        return games;
    }
 }
