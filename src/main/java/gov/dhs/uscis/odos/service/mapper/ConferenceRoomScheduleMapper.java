package gov.dhs.uscis.odos.service.mapper;

import java.text.ParseException;
import java.util.Date;
import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import org.apache.commons.lang3.time.DateFormatUtils;
import org.apache.commons.lang3.time.DateUtils;
import org.dozer.Mapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import gov.dhs.uscis.odos.domain.ConferenceRoomSchedule;
import gov.dhs.uscis.odos.service.dto.ConferenceRoomScheduleDTO;


/**
 * Mapper for the entity ConferenceRoomSchedule and its DTO
 * ConferenceRoomScheduleDTO.
 */
@Named
public class ConferenceRoomScheduleMapper implements EntityMapper<ConferenceRoomScheduleDTO, ConferenceRoomSchedule> {

	@Inject
	private Mapper mapper;
	
	private static final Logger log  = LoggerFactory.getLogger(ConferenceRoomScheduleMapper.class);
	
	private static final String DATE_FORMAT  = "yyyy-MM-dd hh24:mi";

	@Override
	public ConferenceRoomSchedule toEntity(ConferenceRoomScheduleDTO dto) {
		ConferenceRoomSchedule conferenceRoomSchedule  =  mapper.map(dto, ConferenceRoomSchedule.class);
		conferenceRoomSchedule.setRoomScheduleStartTime(convertDateString(dto.getRoomScheduleStartTime(), DATE_FORMAT));
		conferenceRoomSchedule.setRoomScheduleEndTime(convertDateString(dto.getRoomScheduleEndTime(), DATE_FORMAT));
		return conferenceRoomSchedule;
		
	}

	@Override
	public ConferenceRoomScheduleDTO toDto(ConferenceRoomSchedule entity) {
		ConferenceRoomScheduleDTO conferenceRoomScheduleDTO = mapper.map(entity, ConferenceRoomScheduleDTO.class);
		conferenceRoomScheduleDTO.setRoomScheduleStartTime(convertDateValue(entity.getRoomScheduleStartTime(), DATE_FORMAT));
		conferenceRoomScheduleDTO.setRoomScheduleEndTime(convertDateValue(entity.getRoomScheduleEndTime(), DATE_FORMAT));
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
	
	private Date convertDateString(String dateStr, String format) {
		Date dateValue = null;
		try {
			dateValue = DateUtils.parseDate(dateStr, format);
		}
		catch(ParseException e) {
			log.error("Error parsing date value " + dateStr, e);
			throw new RuntimeException(e);
		}
		return dateValue;
	}
	
	private String convertDateValue(Date dateValue, String format) {
		String dateStr = null;
		dateStr = DateFormatUtils.format(dateValue, format);
		return dateStr;
	}

}
