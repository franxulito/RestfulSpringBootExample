package com.fran.restfulSpringBootExample.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import com.fran.restfulSpringBootExample.entities.Game;


@RestController
@RequestMapping(path = "/api/games")
public class GameController {

    @Autowired
    private GameService gameService1;


    @RequestMapping(method = RequestMethod.GET)
    public List<Game> getCostumers() {
        return gameService1.getGames();
    }

    @RequestMapping(method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public void addGame(@RequestBody Game game) {
        gameService1.addGame(game);
    }
}
