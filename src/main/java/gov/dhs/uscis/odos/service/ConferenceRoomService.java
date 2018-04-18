package gov.dhs.uscis.odos.service;

import java.util.List;

import gov.dhs.uscis.odos.service.dto.ConferenceRoomDTO;

/**
 * Service Interface for managing Building.
 */
public interface ConferenceRoomService {

    /**
     * Save a building.
     *
     * @param buildingDTO the entity to save
     * @return the persisted entity
     */
    ConferenceRoomDTO save(ConferenceRoomDTO conferenceRoomDTO);

    /**
     * Get all the buildings.
     *
     * @return the list of entities
     */
    List<ConferenceRoomDTO> findAll();

    /**
     * Get the "id" building.
     *
     * @param id the id of the entity
     * @return the entity
     */
    ConferenceRoomDTO findOne(Long id);

    /**
     * Delete the "id" building.
     *
     * @param id the id of the entity
     */
    void delete(Long id);
}
