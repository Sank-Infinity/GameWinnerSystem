package in.co.infinity.game.winner.domain;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
public class RaceDetailTableVO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String raceId;

	private Integer length;
	private Integer laps;

	private Integer paticipants;

	public String getRaceId() {
		return raceId;
	}

	public void setRaceId(String raceId) {
		this.raceId = raceId;
	}

	public Integer getLength() {
		return length;
	}

	public void setLength(Integer length) {
		this.length = length;
	}

	public Integer getLaps() {
		return laps;
	}

	public void setLaps(Integer laps) {
		this.laps = laps;
	}

	public Integer getPaticipants() {
		return paticipants;
	}

	public void setPaticipants(Integer paticipants) {
		this.paticipants = paticipants;
	}

	@Override
	public String toString() {
		return "RaceDetailTableVO [raceId=" + raceId + ", length=" + length + ", laps=" + laps + ", paticipants="
				+ paticipants + "]";
	}

}
