package gov.dhs.uscis.odos.service.mapper;

import org.dozer.Mapper;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import gov.dhs.uscis.odos.domain.ConferenceRoom;
import gov.dhs.uscis.odos.service.dto.ConferenceRoomDTO;

@RunWith(MockitoJUnitRunner.class)
public class ConferenceRoomScheduleMapperTest {
	
	private ConferenceRoom conferenceRoom;
	private ConferenceRoomDTO conferenceRoomDTO;
		
	@InjectMocks
	ConferenceRoomScheduleMapper  conferenceRoomScheduleMapper;
	@Mock
	private Mapper mapper;

	@Before
	public void setup() {

	}	

	@Test
	public void testToEntity() {
		
	}

	@Test
	public void testToDto() {
		
		
	}

	@Test
	public void testToEntityFromList() {
	
	}


	@Test
	public void testToDtoFromList() {
	
	}

}
