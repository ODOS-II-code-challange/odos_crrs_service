package gov.dhs.uscis.odos.repository;

import gov.dhs.uscis.odos.domain.Building;
import org.springframework.stereotype.Repository;

import org.springframework.data.jpa.repository.*;


/**
 * Spring Data JPA repository for the Building entity.
 */
@SuppressWarnings("unused")
@Repository
public interface BuildingRepository extends JpaRepository<Building, Long> {

}
