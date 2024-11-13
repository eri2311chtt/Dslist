package com.devsuperior.Dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.Dslist.entities.GameList;

public interface GameListRepositotry extends JpaRepository<GameList, Long> {

}
