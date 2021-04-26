package hoco.reserve.utils;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import hoco.reserve.domain.Reservation;
import hoco.reserve.domain.ReservationRepository;
import hoco.reserve.domain.Room;
import hoco.reserve.domain.RoomRepository;

@Component
public class DemoData {
	
	@Autowired
	private RoomRepository roomRepository;

	@Autowired
	ReservationRepository reservationRepository;
	
	public void populate() {
		roomRepository.deleteAll();
		reservationRepository.deleteAll();
		
		Room r1 = new Room("Laundry room", "You can wash clothes here", "0600", "2300", 60, 180);
		Room r2 = new Room("Sauna", "A nice room where you can get sweaty", "1500", "2300", 60, 180);
		Room r3 = new Room("Common room", "A room with kitchen applicances, sofas, tv, tables and chairs where you can host parties", "0800", "2300", 60, 720);
		
		roomRepository.save(r1);
		roomRepository.save(r2);
		roomRepository.save(r3);
		
		Reservation res1 = new Reservation("A20", "a20@email.com", "26.04.2021", new Date(), new Date(), new Date(), false);
		res1.setRoom(r3);
		Reservation res2 = new Reservation("A2", "Jayjopas21@email.com", "20.04.2021", new Date(), new Date(), new Date(), false);
		res2.setRoom(r2);
		Reservation res3 = new Reservation("A52", "sdkk223@email.com", "10.04.2021", new Date(), new Date(), new Date(), false);
		res3.setRoom(r1);
		Reservation res4 = new Reservation("C10", "1110JOe@email.com", "22.04.2021", new Date(), new Date(), new Date(), false);
		res4.setRoom(r1);
		reservationRepository.save(res1);
		reservationRepository.save(res2);
		reservationRepository.save(res3);
		reservationRepository.save(res4);

		
	}
}
