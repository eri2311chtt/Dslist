package com.devsuperior.Dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.Dslist.entities.Game;

public interface GameRepositotry extends JpaRepository<Game, Long> {

}
