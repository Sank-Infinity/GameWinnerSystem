package in.co.infinity.game.winner.service;

import org.springframework.stereotype.Service;

import in.co.infinity.game.winner.domain.RaceDetailTableVO;

@Service
public interface GameService {

	RaceDetailTableVO SaveGameDetals(RaceDetailTableVO raceDetailTableVO);
	RaceDetailTableVO getRaceDetails(String raceId);
}
