package in.co.infinity.game.winner.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.co.infinity.game.winner.entity.RaceDetailTable;

@Repository
public interface RaceDetailTableRepository extends JpaRepository<RaceDetailTable , String>{
	
	RaceDetailTable findByRaceId(String raceId);
	RaceDetailTable findByRaceIdAndLength(String raceId, Integer length);	
	
	List<RaceDetailTable> findByLength(Integer length);
				
}
