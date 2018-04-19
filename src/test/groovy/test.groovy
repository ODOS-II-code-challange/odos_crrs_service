package gov.dhs.uscis.odos.contracts.crrsvc
import org.springframework.cloud.contract.spec.Contract

Contract.make {

	request {
		method 'POST'
		url '/api/buildings'
		headers {
			header('Content-Type', 'application/json')
			header('Accept', 'application/json')
		}
		body(""""
		{
			
		}
		""")
		response {
			status 200
			body(""""
			{
			[
			  {
			    "buildingId": 1,
			    "buildingName": "20 Mass",
			    "buildingDesc": "USCIS Headquarters",
			    "conferenceRooms": [
			      {
			        "conferenceRoomId": 2,
			        "roomNum": "8001",
			        "roomName": "Atomics",
			        "roomCapacity": 10,
			        "activeIndicator": "Y",
			        "building": {
			          "buildingId": 1,
			          "buildingName": "20 Mass",
			          "buildingDesc": "USCIS Headquarters"
			        }
			      },
			      {
			        "conferenceRoomId": 1,
			        "roomNum": "5000",
			        "roomName": "War Room",
			        "roomCapacity": 10,
			        "activeIndicator": "Y",
			        "building": {
			          "buildingId": 1,
			          "buildingName": "20 Mass",
			          "buildingDesc": "USCIS Headquarters"
			        }
			      },
			      {
			        "conferenceRoomId": 3,
			        "roomNum": "801",
			        "roomName": "White Oak",
			        "roomCapacity": 10,
			        "activeIndicator": "Y",
			        "building": {
			          "buildingId": 1,
			          "buildingName": "20 Mass",
			          "buildingDesc": "USCIS Headquarters"
			        }
			      }
			    ]
			  }
			]
	    """)
		headers {
			header('Content-Type', 'application/json;charset=UTF-8')
		}
	}
}