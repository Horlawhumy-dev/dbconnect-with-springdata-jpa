package com.haroffcode.databaseconnect.repository;

import com.haroffcode.databaseconnect.models.Player;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerRepository extends JpaRepository<Player, Integer> {


}
