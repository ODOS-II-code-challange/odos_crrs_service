package gov.dhs.uscis.odos.service.mapper;

import gov.dhs.uscis.odos.domain.*;
import gov.dhs.uscis.odos.service.dto.BuildingDTO;

import org.mapstruct.*;

/**
 * Mapper for the entity Building and its DTO BuildingDTO.
 */
@Mapper(componentModel = "spring", uses = {})
public interface BuildingMapper extends EntityMapper<BuildingDTO, Building> {



    default Building fromId(Long id) {
        if (id == null) {
            return null;
        }
        Building building = new Building();
        building.setBuildingId(id);
        return building;
    }
}
