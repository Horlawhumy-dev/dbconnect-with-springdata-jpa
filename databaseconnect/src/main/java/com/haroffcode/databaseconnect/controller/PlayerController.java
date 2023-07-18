package com.haroffcode.databaseconnect.controller;

import com.haroffcode.databaseconnect.models.Player;
import com.haroffcode.databaseconnect.repository.PlayerRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/players")
public class PlayerController {

    PlayerRepository playerRepository;
    Logger logger = LoggerFactory.getLogger(this.getClass());

    public PlayerController(PlayerRepository playerController) {
        this.playerRepository = playerController;
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("")
    public List<Player> getAllPlayers() {
        return playerRepository.findAll();
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/player/")
    public Player addPlayer(@RequestBody Player player) {
        return playerRepository.save(player);
    }

    @GetMapping("/{id}")
    public Optional<Player> getPlayerById(@PathVariable int id) {
        Optional<Player> player = Optional.empty();
        try {
            player = playerRepository.findById(id);
        } catch (Exception err) {
            logger.debug(String.valueOf(err));
        }

        return player;
    }
}
