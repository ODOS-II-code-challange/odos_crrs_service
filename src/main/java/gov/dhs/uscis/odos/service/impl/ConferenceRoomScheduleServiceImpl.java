package gov.dhs.uscis.odos.service.impl;

import gov.dhs.uscis.odos.service.ConferenceRoomScheduleService;
import gov.dhs.uscis.odos.domain.ConferenceRoomSchedule;
import gov.dhs.uscis.odos.repository.ConferenceRoomScheduleRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


/**
 * Service Implementation for managing ConferenceRoomSchedule.
 */
@Service
@Transactional
public class ConferenceRoomScheduleServiceImpl implements ConferenceRoomScheduleService {

    private final Logger log = LoggerFactory.getLogger(ConferenceRoomScheduleServiceImpl.class);

    private final ConferenceRoomScheduleRepository conferenceRoomScheduleRepository;

    public ConferenceRoomScheduleServiceImpl(ConferenceRoomScheduleRepository conferenceRoomScheduleRepository) {
        this.conferenceRoomScheduleRepository = conferenceRoomScheduleRepository;
    }

    /**
     * Save a conferenceRoomSchedule.
     *
     * @param conferenceRoomSchedule the entity to save
     * @return the persisted entity
     */
    @Override
    public ConferenceRoomSchedule save(ConferenceRoomSchedule conferenceRoomSchedule) {
        log.debug("Request to save ConferenceRoomSchedule : {}", conferenceRoomSchedule);
        return conferenceRoomScheduleRepository.save(conferenceRoomSchedule);
    }

    /**
     * Get all the conferenceRoomSchedules.
     *
     * @param pageable the pagination information
     * @return the list of entities
     */
    @Override
    @Transactional(readOnly = true)
    public Page<ConferenceRoomSchedule> findAll(Pageable pageable) {
        log.debug("Request to get all ConferenceRoomSchedules");
        return conferenceRoomScheduleRepository.findAll(pageable);
    }

    /**
     * Get one conferenceRoomSchedule by id.
     *
     * @param id the id of the entity
     * @return the entity
     */
    @Override
    @Transactional(readOnly = true)
    public ConferenceRoomSchedule findOne(Long id) {
        log.debug("Request to get ConferenceRoomSchedule : {}", id);
        return conferenceRoomScheduleRepository.findOne(id);
    }

    /**
     * Delete the conferenceRoomSchedule by id.
     *
     * @param id the id of the entity
     */
    @Override
    public void delete(Long id) {
        log.debug("Request to delete ConferenceRoomSchedule : {}", id);
        conferenceRoomScheduleRepository.delete(id);
    }
}
