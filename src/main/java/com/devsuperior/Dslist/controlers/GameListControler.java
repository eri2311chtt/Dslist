package com.devsuperior.Dslist.controlers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.Dslist.dto.GameListDTO;
import com.devsuperior.Dslist.dto.GameMinDTO;
import com.devsuperior.Dslist.service.GameListService;
import com.devsuperior.Dslist.service.GameService;

@RestController
@RequestMapping(value = "/lists")
public class GameListControler {
	

    
    @Autowired
    private GameListService gameListService;
    
    @Autowired
    private GameService gameService;
    
    @GetMapping
	public List<GameListDTO> findAll(){
		List<GameListDTO> result = gameListService.findAll();
		return result;
	}
    
    @GetMapping(value = "/{listId}/games")
	public List<GameMinDTO> findByList(@PathVariable Long listId){
		List<GameMinDTO> result = gameService.findbyList(listId);
		return result;
	}
}