package in.co.infinity.game.winner.entity;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity 
@Table(name = "race_dtl_tbl")
public class RaceDetailTable implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "rdt_id")
	private String raceId;

	@Column(name = "rdt_length")
	private Integer length;

	@Column(name = "rdt_laps")
	private Integer laps;

	@Column(name = "rdt_participants")
	private Integer paticipants;
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	List<ParticipantDetailTable> paticipantDetail;

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
		return "RaceDetailTable [raceId=" + raceId + ", length=" + length + ", laps=" + laps + ", paticipants="
				+ paticipants + "]";
	}

	

}
