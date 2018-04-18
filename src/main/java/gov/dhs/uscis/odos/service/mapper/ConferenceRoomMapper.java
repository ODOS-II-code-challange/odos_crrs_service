package gov.dhs.uscis.odos.service.mapper;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import org.dozer.Mapper;

import gov.dhs.uscis.odos.domain.ConferenceRoom;
import gov.dhs.uscis.odos.service.dto.ConferenceRoomDTO;

/**
 * Mapper for the entity ConferenceRoom and its DTO ConferenceRoomDTO.
 */
@Named
public class ConferenceRoomMapper implements EntityMapper<ConferenceRoomDTO, ConferenceRoom> {

	@Inject
	private Mapper mapper;

	@Override
	public ConferenceRoom toEntity(ConferenceRoomDTO dto) {	
		return mapper.map(dto, ConferenceRoom.class);
	}

	@Override
	public ConferenceRoomDTO toDto(ConferenceRoom entity) {
		return mapper.map(entity, ConferenceRoomDTO.class);
	}

	@Override
	public List<ConferenceRoom> toEntity(List<ConferenceRoomDTO> dtoList) {
		List<ConferenceRoom> conferenceRoomLists = new ArrayList<>();
		for (ConferenceRoomDTO conferenceRoomDTO : dtoList) {
			conferenceRoomLists.add(mapper.map(conferenceRoomDTO, ConferenceRoom.class));
		}
		return conferenceRoomLists;
	}

	@Override
	public List<ConferenceRoomDTO> toDto(List<ConferenceRoom> entityList) {
		List<ConferenceRoomDTO> conferenceRoomDTOList = new ArrayList<>();
		for (ConferenceRoom conferenceRoomEnty : entityList) {
			conferenceRoomDTOList.add(mapper.map(conferenceRoomEnty, ConferenceRoomDTO.class));
		}
		return conferenceRoomDTOList;
	}

}
