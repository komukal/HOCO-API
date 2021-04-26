package hoco.reserve.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import hoco.reserve.domain.Reservation;
import hoco.reserve.domain.ReservationRepository;
import hoco.reserve.domain.Room;
import hoco.reserve.domain.RoomRepository;
@Controller
@ResponseBody 
public class ApiController {
	@Autowired
	public ReservationRepository reservationRepository;

	@Autowired
	public RoomRepository roomRepository;



	@RequestMapping(value = "/getreservations")
	List<Reservation> getReservations() {
		return (List<Reservation>) reservationRepository.findAll();
	}

	@RequestMapping("/getrooms")
	List<Room> getRooms() {
		return (List<Room>) roomRepository.findAll();
	}


}
