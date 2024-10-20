package in.co.infinity.game.winner.utility;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class HelperUitility {
	
	public static final String RACEID = "RCID";
	public static final String PARTICIPANTSID = "PRTID";
	public static final String LAPID = "LPID";
	
	
	public int generateUniqueId() {
        Random random = new Random();
        // Generate a random 6-digit number between 100000 and 999999 (inclusive)
        return 100000 + random.nextInt(900000);
    }
	
	public String getRaceId() {
		return RACEID + generateUniqueId();
	}
	
	public String getParticipantId() {
		return PARTICIPANTSID + generateUniqueId();
	}
	
	public String getLapId() {
		return LAPID + generateUniqueId();
	}
	
}
