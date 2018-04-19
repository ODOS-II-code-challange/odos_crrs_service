package gov.dhs.uscis.odos.service.dto;

import java.io.Serializable;

/**
 * A DTO for the a ConferenceRoomSchedule entity
 *
 */
public class ConferenceRoomScheduleDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6440528019905191789L;

	private String requestorId;

	private String roomScheduleStartTime;

	private String roomScheduleEndTime;

	private String conferenceTitle;

	private Long conferenceRoomId;

	public String getRequestorId() {
		return requestorId;
	}

	public void setRequestorId(String requestorId) {
		this.requestorId = requestorId;
	}

	public String getRoomScheduleStartTime() {
		return roomScheduleStartTime;
	}

	public void setRoomScheduleStartTime(String roomScheduleStartTime) {
		this.roomScheduleStartTime = roomScheduleStartTime;
	}

	public String getRoomScheduleEndTime() {
		return roomScheduleEndTime;
	}

	public void setRoomScheduleEndTime(String roomScheduleEndTime) {
		this.roomScheduleEndTime = roomScheduleEndTime;
	}

	public String getConferenceTitle() {
		return conferenceTitle;
	}

	public void setConferenceTitle(String conferenceTitle) {
		this.conferenceTitle = conferenceTitle;
	}

	public Long getConferenceRoomId() {
		return conferenceRoomId;
	}

	public void setConferenceRoomId(Long conferenceRoomId) {
		this.conferenceRoomId = conferenceRoomId;
	}

}
