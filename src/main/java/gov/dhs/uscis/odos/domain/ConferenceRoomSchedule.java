package gov.dhs.uscis.odos.domain;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;
import javax.validation.constraints.*;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

/**
 * A ConferenceRoomSchedule.
 */
@Entity
@Table(name = "conference_room_schedule")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class ConferenceRoomSchedule implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "conf_rm_id")
    private Long id;

    @NotNull
    @Column(name = "requestor_id", nullable = false)
    private String requestorId;

    @NotNull
    @Column(name = "room_schedule_start_time", nullable = false)
    private LocalDate roomScheduleStartTime;

    @NotNull
    @Column(name = "room_schedule_end_time", nullable = false)
    private LocalDate roomScheduleEndTime;

    @Column(name = "conference_title")
    private String conferenceTitle;
    
    @ManyToOne(targetEntity = ConferenceRoom.class,cascade = CascadeType.ALL)
	@JoinColumn(name = "conf_rm_id")
	private ConferenceRoom conferenceRoom;

    // jhipster-needle-entity-add-field - JHipster will add fields here, do not remove
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRequestorId() {
        return requestorId;
    }

    public ConferenceRoomSchedule requestorId(String requestorId) {
        this.requestorId = requestorId;
        return this;
    }

    public void setRequestorId(String requestorId) {
        this.requestorId = requestorId;
    }

    public LocalDate getRoomScheduleStartTime() {
        return roomScheduleStartTime;
    }

    public ConferenceRoomSchedule roomScheduleStartTime(LocalDate roomScheduleStartTime) {
        this.roomScheduleStartTime = roomScheduleStartTime;
        return this;
    }

    public void setRoomScheduleStartTime(LocalDate roomScheduleStartTime) {
        this.roomScheduleStartTime = roomScheduleStartTime;
    }

    public LocalDate getRoomScheduleEndTime() {
        return roomScheduleEndTime;
    }

    public ConferenceRoomSchedule roomScheduleEndTime(LocalDate roomScheduleEndTime) {
        this.roomScheduleEndTime = roomScheduleEndTime;
        return this;
    }

    public void setRoomScheduleEndTime(LocalDate roomScheduleEndTime) {
        this.roomScheduleEndTime = roomScheduleEndTime;
    }

    public String getConferenceTitle() {
        return conferenceTitle;
    }

    public ConferenceRoomSchedule conferenceTitle(String conferenceTitle) {
        this.conferenceTitle = conferenceTitle;
        return this;
    }

    public void setConferenceTitle(String conferenceTitle) {
        this.conferenceTitle = conferenceTitle;
    }
    
    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here, do not remove

    public ConferenceRoom getConferenceRoom() {
		return conferenceRoom;
	}

	public void setConferenceRoom(ConferenceRoom conferenceRoom) {
		this.conferenceRoom = conferenceRoom;
	}

	@Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ConferenceRoomSchedule conferenceRoomSchedule = (ConferenceRoomSchedule) o;
        if (conferenceRoomSchedule.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), conferenceRoomSchedule.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "ConferenceRoomSchedule{" +
            "id=" + getId() +
            ", requestorId='" + getRequestorId() + "'" +
            ", roomScheduleStartTime='" + getRoomScheduleStartTime() + "'" +
            ", roomScheduleEndTime='" + getRoomScheduleEndTime() + "'" +
            ", conferenceTitle='" + getConferenceTitle() + "'" +
            "}";
    }
}
