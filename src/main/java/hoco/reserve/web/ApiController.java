package hoco.reserve.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import hoco.reserve.domain.Reservation;
import hoco.reserve.domain.ReservationRepository;
import hoco.reserve.domain.Room;
import hoco.reserve.domain.RoomRepository;
import hoco.reserve.utils.DemoData;
@Controller
@ResponseBody 
public class ApiController {
	@Autowired
	public ReservationRepository reservationRepository;

	@Autowired
	public RoomRepository roomRepository;

	@Autowired
	private DemoData demoData;

	@RequestMapping(value = "/getreservations")
	List<Reservation> getReservations() {
		return (List<Reservation>) reservationRepository.findAll();
	}

	@RequestMapping("/getrooms")
	List<Room> getRooms() {
		return (List<Room>) roomRepository.findAll();
	}

	@PostMapping("/api/reset")
	public ResponseEntity<String>  reset() {
		demoData.populate();
		return ResponseEntity.ok("DB reset done");
	}

}
