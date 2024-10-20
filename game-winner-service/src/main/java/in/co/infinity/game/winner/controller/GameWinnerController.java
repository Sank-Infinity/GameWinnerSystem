package in.co.infinity.game.winner.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.co.infinity.game.winner.domain.RaceDetailTableVO;
import in.co.infinity.game.winner.service.GameService;


@RestController
@RequestMapping("/v1/api/")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class GameWinnerController {

	
	@Autowired
	GameService gameService;
	
	@GetMapping(value = "get-message")
	public String getMessage() {
		return "hello-world";
	}
	
	@PostMapping(value = "save-race-details")
	public RaceDetailTableVO saveRaceDetails(@RequestBody RaceDetailTableVO raceDetailTableVO) {
		return gameService.SaveGameDetals(raceDetailTableVO);
	}
	
	@GetMapping(value = "get-details/id/{raceid}")
	public RaceDetailTableVO getRaceDetails(@PathVariable("raceid") String raceid) {
		return gameService.getRaceDetails(raceid);
	}
	
	

}
