package gov.dhs.uscis.odos.service.mapper;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;
import java.util.List;

import org.dozer.Mapper;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import gov.dhs.uscis.odos.domain.ConferenceRoom;
import gov.dhs.uscis.odos.service.dto.ConferenceRoomDTO;

@RunWith(MockitoJUnitRunner.class)
public class ConferenceRoomMapperTest {
	
	private ConferenceRoom conferenceRoom;
	private ConferenceRoomDTO conferenceRoomDTO;
		
	@InjectMocks
	ConferenceRoomMapper conferenceRoomMapper;
	@Mock
	private Mapper mapper;

	@Before
	public void setup() {
		conferenceRoomDTO = new ConferenceRoomDTO();
		conferenceRoom = new ConferenceRoom();
		Mockito.when(mapper.map(conferenceRoom, ConferenceRoomDTO.class)).thenReturn(conferenceRoomDTO);
		Mockito.when(mapper.map(conferenceRoomDTO, ConferenceRoom.class)).thenReturn(conferenceRoom);
	}	

	@Test
	public void testToEntity() {
		assertNotNull(conferenceRoomMapper.toEntity(conferenceRoomDTO));
	}

	@Test
	public void testToDto() {
		ConferenceRoomDTO dtoReturn=  conferenceRoomMapper.toDto(conferenceRoom);
		assertEquals(conferenceRoomDTO, dtoReturn);
		
	}

	@Test
	public void testToEntityFromList() {
		List<ConferenceRoomDTO> entityList = new ArrayList<ConferenceRoomDTO>();
		entityList.add(conferenceRoomDTO);
		List<ConferenceRoom> dtoList=  conferenceRoomMapper.toEntity(entityList);
		assertEquals(dtoList.size(), 1);
	}


	@Test
	public void testToDtoFromList() {
		List<ConferenceRoom> entityList = new ArrayList<ConferenceRoom>();
		entityList.add(conferenceRoom);
		List<ConferenceRoomDTO> dtoList=  conferenceRoomMapper.toDto(entityList);
		assertEquals(dtoList.size(), 1);
	}


}
