package com.devsuperior.Dslist.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.Dslist.dto.GameMinDTO;
import com.devsuperior.Dslist.entities.Game;
import com.devsuperior.Dslist.repositories.GameRepositotry;

@Service
public class GameService {
	
	@Autowired
	private GameRepositotry gameRepository;
	
	public List<GameMinDTO> findAll(){
		List<Game> result = gameRepository.findAll();
		return result.stream() .map(x -> new GameMinDTO(x)).toList();
		

    }
}
