package gov.dhs.uscis.odos.service;

import gov.dhs.uscis.odos.domain.ConferenceRoomSchedule;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * Service Interface for managing ConferenceRoomSchedule.
 */
public interface ConferenceRoomScheduleService {

    /**
     * Save a conferenceRoomSchedule.
     *
     * @param conferenceRoomSchedule the entity to save
     * @return the persisted entity
     */
    ConferenceRoomSchedule save(ConferenceRoomSchedule conferenceRoomSchedule);

    /**
     * Get all the conferenceRoomSchedules.
     *
     * @param pageable the pagination information
     * @return the list of entities
     */
    Page<ConferenceRoomSchedule> findAll(Pageable pageable);

    /**
     * Get the "id" conferenceRoomSchedule.
     *
     * @param id the id of the entity
     * @return the entity
     */
    ConferenceRoomSchedule findOne(Long id);

    /**
     * Delete the "id" conferenceRoomSchedule.
     *
     * @param id the id of the entity
     */
    void delete(Long id);
}
