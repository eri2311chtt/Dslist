package com.devsuperior.Dslist.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.Dslist.dto.GameListDTO;
import com.devsuperior.Dslist.entities.GameList;
import com.devsuperior.Dslist.repositories.GameListRepositotry;

@Service
public class GameListService {
	
	@Autowired
	private GameListRepositotry gameListRepository;
	
	
	
	@Transactional(readOnly = true)
	public List<GameListDTO> findAll(){
		List<GameList> result = gameListRepository.findAll();
		return result.stream() .map(x -> new GameListDTO(x)).toList();
		

    }
}
