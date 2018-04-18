package gov.dhs.uscis.odos.service.dto;


import java.io.Serializable;

import gov.dhs.uscis.odos.domain.ConferenceRoom;
import gov.dhs.uscis.odos.domain.Equipment;

/**
 * A DTO for the ConferenceRoomEquipment entity.
 */
public class ConferenceRoomEquipmentDTO implements Serializable {

	private static final long serialVersionUID = -1710534291177449596L;

    private Long conferenceRoomEquipId;
    
    private ConferenceRoom conferenceRoom;
    
    private Equipment equipment;

	public Long getConferenceRoomEquipId() {
		return conferenceRoomEquipId;
	}

	public void setConferenceRoomEquipId(Long conferenceRoomEquipId) {
		this.conferenceRoomEquipId = conferenceRoomEquipId;
	}

	public ConferenceRoom getConferenceRoom() {
		return conferenceRoom;
	}

	public void setConferenceRoom(ConferenceRoom conferenceRoom) {
		this.conferenceRoom = conferenceRoom;
	}

	public Equipment getEquipment() {
		return equipment;
	}

	public void setEquipment(Equipment equipment) {
		this.equipment = equipment;
	}
}
