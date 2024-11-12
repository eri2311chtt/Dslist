package com.devsuperior.Dslist.controlers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.Dslist.dto.GameDTO;
import com.devsuperior.Dslist.dto.GameMinDTO;
import com.devsuperior.Dslist.service.GameService;

@RestController
@RequestMapping(value = "/games")
public class GameControler {
	

    
    @Autowired
    private GameService gameService;
    
    @GetMapping(value = "/{id}")
   	public GameDTO findByid(@PathVariable Long id) {
   		GameDTO result = gameService.findByld(id);
   		return result;
    }
    
    @GetMapping
	public List<GameMinDTO> findAll(){
		List<GameMinDTO> result = gameService.findAll();
		return result;
	}
}
