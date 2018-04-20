package gov.dhs.uscis.odos.service.mapper;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import org.dozer.Mapper;

import gov.dhs.uscis.odos.domain.ConferenceRoomSchedule;
import gov.dhs.uscis.odos.service.dto.ConferenceRoomScheduleDTO;
import io.undertow.util.DateUtils;

/**
 * Mapper for the entity ConferenceRoomSchedule and its DTO
 * ConferenceRoomScheduleDTO.
 */
@Named
public class ConferenceRoomScheduleMapper implements EntityMapper<ConferenceRoomScheduleDTO, ConferenceRoomSchedule> {

	@Inject
	private Mapper mapper;

	@Override
	public ConferenceRoomSchedule toEntity(ConferenceRoomScheduleDTO dto) {
		ConferenceRoomSchedule conferenceRoomSchedule  =  mapper.map(dto, ConferenceRoomSchedule.class);
		conferenceRoomSchedule.setRoomScheduleStartTime(DateUtils.parseDate(dto.getRoomScheduleStartTime()));
		conferenceRoomSchedule.setRoomScheduleEndTime(DateUtils.parseDate(dto.getRoomScheduleEndTime()));
		return conferenceRoomSchedule;
		
	}

	@Override
	public ConferenceRoomScheduleDTO toDto(ConferenceRoomSchedule entity) {
		ConferenceRoomScheduleDTO conferenceRoomScheduleDTO = mapper.map(entity, ConferenceRoomScheduleDTO.class);
		conferenceRoomScheduleDTO.setRoomScheduleStartTime(DateUtils.toDateString(entity.getRoomScheduleStartTime()));
		conferenceRoomScheduleDTO.setRoomScheduleEndTime(DateUtils.toDateString(entity.getRoomScheduleEndTime()));
		return conferenceRoomScheduleDTO;
	}

	@Override
	public List<ConferenceRoomSchedule> toEntity(List<ConferenceRoomScheduleDTO> dtoList) {
		
		return null;
	}

	@Override
	public List<ConferenceRoomScheduleDTO> toDto(List<ConferenceRoomSchedule> entityList) {
		
		return null;
	}

}
