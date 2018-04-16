package gov.dhs.uscis.odos.service.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import gov.dhs.uscis.odos.domain.Building;
import gov.dhs.uscis.odos.service.dto.BuildingDTO;

/**
 * Mapper for the entity Building and its DTO BuildingDTO.
 */

@Mapper(componentModel = "spring", uses = {})
public interface BuildingMapper {

	BuildingMapper INSTANCE = Mappers.getMapper(BuildingMapper.class);

	Building toEntity(BuildingDTO dto);

	BuildingDTO toDto(Building buildingEntity);

}
