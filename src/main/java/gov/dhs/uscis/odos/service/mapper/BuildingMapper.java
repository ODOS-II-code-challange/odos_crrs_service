package gov.dhs.uscis.odos.service.mapper;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import org.dozer.Mapper;

import gov.dhs.uscis.odos.domain.Building;
import gov.dhs.uscis.odos.service.dto.BuildingDTO;

/**
 * Mapper for the entity Building and its DTO BuildingDTO.
 */
@Named
public class BuildingMapper implements EntityMapper<BuildingDTO, Building> {

	@Inject
	private Mapper mapper;

	@Override
	public Building toEntity(BuildingDTO dto) {
		return mapper.map(dto, Building.class);
	}

	@Override
	public BuildingDTO toDto(Building entity) {
		return mapper.map(entity, BuildingDTO.class);
	}

	@Override
	public List<Building> toEntity(List<BuildingDTO> dtoList) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<BuildingDTO> toDto(List<Building> entityList) {
		// TODO Auto-generated method stub
		return null;
	}

}
