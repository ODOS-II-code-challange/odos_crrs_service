package gov.dhs.uscis.odos.repository;

import gov.dhs.uscis.odos.domain.ConferenceRoomSchedule;
import org.springframework.stereotype.Repository;

import org.springframework.data.jpa.repository.*;


/**
 * Spring Data JPA repository for the ConferenceRoomSchedule entity.
 */
@SuppressWarnings("unused")
@Repository
public interface ConferenceRoomScheduleRepository extends JpaRepository<ConferenceRoomSchedule, Long> {

}
