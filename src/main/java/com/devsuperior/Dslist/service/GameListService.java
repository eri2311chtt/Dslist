package com.devsuperior.Dslist.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.Dslist.dto.GameListDTO;
import com.devsuperior.Dslist.entities.GameList;
import com.devsuperior.Dslist.projections.GameMinProjetion;
import com.devsuperior.Dslist.repositories.GameListRepositotry;
import com.devsuperior.Dslist.repositories.GameRepositotry;

@Service
public class GameListService {
	
	@Autowired
	private GameListRepositotry gameListRepository;
	
	@Autowired
	private GameRepositotry gameRepository;
	
	@Transactional(readOnly = true)
	public List<GameListDTO> findAll(){
		List<GameList> result = gameListRepository.findAll();
		return result.stream() .map(x -> new GameListDTO(x)).toList();
		}
	@Transactional
	public void mov(Long listId, int sourceIndex, int destinationIndex) {
    
		List<GameMinProjetion> list = gameRepository.searchByList(listId);
		
		GameMinProjetion obj = list.remove(sourceIndex);
		list.add(destinationIndex, obj);
		
		int min = sourceIndex < destinationIndex ? sourceIndex : destinationIndex;
		int max = sourceIndex < destinationIndex ? destinationIndex : sourceIndex;
		
		for (int i = min; i <= max; i++) {
			gameListRepository.updateBelongingPosition(listId, list.get(i).getId(), i);
		}
		  
    }
}
