package com.devsuperior.Dslist.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.Dslist.dto.GameDTO;
import com.devsuperior.Dslist.dto.GameMinDTO;
import com.devsuperior.Dslist.entities.Game;
import com.devsuperior.Dslist.projections.GameMinProjetion;
import com.devsuperior.Dslist.repositories.GameRepositotry;

@Service
public class GameService {
	
	@Autowired
	private GameRepositotry gameRepository;
	
	@Transactional(readOnly = true)
	public GameDTO findByld(Long id) {
		Game result = gameRepository.findById(id).get();
	    return new GameDTO(result);
	} 
	
	@Transactional(readOnly = true)
	public List<GameMinDTO> findAll(){
		List<Game> result = gameRepository.findAll();
		return result.stream() .map(x -> new GameMinDTO(x)).toList();
		
	}
	
	@Transactional(readOnly = true)
	public List<GameMinDTO> findbyList(Long listId) {
		List<GameMinProjetion> result = gameRepository.searchByList(listId);
		return result.stream() .map(x -> new GameMinDTO(x)).toList();
		
	}
	
    }

