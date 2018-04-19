package gov.dhs.uscis.odos.service.dto;


import java.time.LocalDate;
import javax.validation.constraints.*;
import java.io.Serializable;
import java.util.Objects;

/**
 * A DTO for the ConferenceRoomSchedule entity.
 */
public class ConferenceRoomScheduleDTO implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = -737083741204310273L;

	private Long id;

    @NotNull
    private String requestorId;

    @NotNull
    private LocalDate roomScheduleStartTime;

    @NotNull
    private LocalDate roomScheduleEndTime;

    private String conferenceTitle;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRequestorId() {
        return requestorId;
    }

    public void setRequestorId(String requestorId) {
        this.requestorId = requestorId;
    }

    public LocalDate getRoomScheduleStartTime() {
        return roomScheduleStartTime;
    }

    public void setRoomScheduleStartTime(LocalDate roomScheduleStartTime) {
        this.roomScheduleStartTime = roomScheduleStartTime;
    }

    public LocalDate getRoomScheduleEndTime() {
        return roomScheduleEndTime;
    }

    public void setRoomScheduleEndTime(LocalDate roomScheduleEndTime) {
        this.roomScheduleEndTime = roomScheduleEndTime;
    }

    public String getConferenceTitle() {
        return conferenceTitle;
    }

    public void setConferenceTitle(String conferenceTitle) {
        this.conferenceTitle = conferenceTitle;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        ConferenceRoomScheduleDTO conferenceRoomScheduleDTO = (ConferenceRoomScheduleDTO) o;
        if(conferenceRoomScheduleDTO.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), conferenceRoomScheduleDTO.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "ConferenceRoomScheduleDTO{" +
            "id=" + getId() +
            ", requestorId='" + getRequestorId() + "'" +
            ", roomScheduleStartTime='" + getRoomScheduleStartTime() + "'" +
            ", roomScheduleEndTime='" + getRoomScheduleEndTime() + "'" +
            ", conferenceTitle='" + getConferenceTitle() + "'" +
            "}";
    }
}
