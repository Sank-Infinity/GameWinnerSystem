package in.co.infinity.game.winner.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.co.infinity.game.winner.domain.RaceDetailTableVO;
import in.co.infinity.game.winner.entity.RaceDetailTable;
import in.co.infinity.game.winner.repository.RaceDetailTableRepository;
import in.co.infinity.game.winner.service.GameService;
import in.co.infinity.game.winner.utility.HelperUitility;

@Service
public class GameServiceImpl implements GameService {

	@Autowired
	RaceDetailTableRepository repo;

	@Autowired
	HelperUitility helperUitility;
	
	@Override
	public RaceDetailTableVO SaveGameDetals(RaceDetailTableVO raceDetailTableVO) {
		// TODO Auto-generated method stub
		System.out.print(raceDetailTableVO);
		RaceDetailTable raceDetailTable = new RaceDetailTable();
		raceDetailTable.setLaps(raceDetailTableVO.getLaps());
		raceDetailTable.setLength(raceDetailTableVO.getLength());
		raceDetailTable.setPaticipants(raceDetailTableVO.getPaticipants());
		raceDetailTable.setRaceId(helperUitility.getRaceId());
		
		System.out.print(raceDetailTable);
		
		raceDetailTable = repo.save(raceDetailTable);
		raceDetailTableVO.setRaceId(raceDetailTable.getRaceId());
		
		return raceDetailTableVO;
	}

	@Override
	public RaceDetailTableVO getRaceDetails(String raceId) {
		RaceDetailTable raceDetailTable = repo.findByRaceId(raceId);
		
		RaceDetailTableVO raceDetailTableVO = new RaceDetailTableVO();
		raceDetailTableVO.setLaps(raceDetailTable.getLaps());
		raceDetailTableVO.setLength(raceDetailTable.getLength());
		raceDetailTableVO.setPaticipants(raceDetailTable.getPaticipants());
		raceDetailTableVO.setRaceId(raceDetailTable.getRaceId());
		
		return raceDetailTableVO;
	}

}
