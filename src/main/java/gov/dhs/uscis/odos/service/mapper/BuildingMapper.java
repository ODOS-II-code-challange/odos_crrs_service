package gov.dhs.uscis.odos.service.mapper;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import org.apache.commons.lang3.Validate;
import org.dozer.Mapper;

import gov.dhs.uscis.odos.domain.Building;
import gov.dhs.uscis.odos.domain.ConferenceRoom;
import gov.dhs.uscis.odos.service.dto.BuildingDTO;
import gov.dhs.uscis.odos.service.dto.ConferenceRoomDTO;

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
		List<ConferenceRoomDTO> confDtos = new ArrayList<>();
		Validate.notNull(entity, "The Building entity must not be null");
		BuildingDTO buildingDTO = mapper.map(entity, BuildingDTO.class);
		for (ConferenceRoom conferenceRoom : entity.getConferenceRoom()) {
			confDtos.add(mapper.map(conferenceRoom, ConferenceRoomDTO.class));
		}
		buildingDTO.setConferenceRooms(confDtos);

		return buildingDTO;
	}

	@Override
	public List<Building> toEntity(List<BuildingDTO> dtoList) {
		List<Building> buildingLists = new ArrayList<>();
		for (BuildingDTO buildingDTO : dtoList) {
			buildingLists.add(mapper.map(buildingDTO, Building.class));
		}
		return buildingLists;
	}

	@Override
	public List<BuildingDTO> toDto(List<Building> entityList) {
		List<BuildingDTO> buildingDTOList = new ArrayList<>();
		for (Building buildingEnty : entityList) {
			buildingDTOList.add(mapper.map(buildingEnty, BuildingDTO.class));
		}
		return buildingDTOList;
	}

}
