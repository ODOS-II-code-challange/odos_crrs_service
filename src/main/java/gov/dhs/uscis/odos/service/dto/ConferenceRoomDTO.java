package gov.dhs.uscis.odos.service.dto;


import java.io.Serializable;
import java.util.Objects;

import gov.dhs.uscis.odos.domain.enums.ActiveIndicatorEnum;

/**
 * A DTO for the ConferenceRoom entity.
 */
public class ConferenceRoomDTO implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 6613433690413368185L;

	private Long conferenceRoomId;

    private String roomNum;

    private String roomName;
    
    private Integer roomCapacity;
    
    private ActiveIndicatorEnum activeIndicator;
    
    

    public Long getConferenceRoomId() {
		return conferenceRoomId;
	}

	public void setConferenceRoomId(Long conferenceRoomId) {
		this.conferenceRoomId = conferenceRoomId;
	}

	public String getRoomNum() {
		return roomNum;
	}

	public void setRoomNum(String roomNum) {
		this.roomNum = roomNum;
	}

	public String getRoomName() {
		return roomName;
	}

	public void setRoomName(String roomName) {
		this.roomName = roomName;
	}

	public Integer getRoomCapacity() {
		return roomCapacity;
	}

	public void setRoomCapacity(Integer roomCapacity) {
		this.roomCapacity = roomCapacity;
	}
	
	public ActiveIndicatorEnum getActiveIndicator() {
		return activeIndicator;
	}

	public void setActiveIndicator(ActiveIndicatorEnum activeIndicator) {
		this.activeIndicator = activeIndicator;
	}

	

	@Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        ConferenceRoomDTO conferenceRoomDTO = (ConferenceRoomDTO) o;
        if(conferenceRoomDTO.getConferenceRoomId() == null || getConferenceRoomId() == null) {
            return false;
        }
        return Objects.equals(getConferenceRoomId(), conferenceRoomDTO.getConferenceRoomId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getConferenceRoomId());
    }
}
