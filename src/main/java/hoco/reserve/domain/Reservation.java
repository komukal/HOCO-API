package hoco.reserve.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity

public class Reservation {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	private String apartment, bookingDate;
	private Date reservationDate, startTime, endTime;
	private Boolean invoiced;

	@ManyToOne
	@JoinColumn(name = "roomid")
	private Room room;

	// Constructors, getters ,setters
	public Reservation() {
	}

	public Reservation(String apartment, String bookedBy, String bookingDate, Date reservationDate, Date startTime,
			Date endTime, Boolean invoiced) {
		super();
		this.apartment = apartment;
		this.bookingDate = bookingDate;
		this.reservationDate = reservationDate;
		this.startTime = startTime;
		this.endTime = endTime;
		this.invoiced = invoiced;
	}

	public Long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getApartment() {
		return apartment;
	}

	public void setApartment(String apartment) {
		this.apartment = apartment;
	}

	public String getBookingDate() {
		return bookingDate;
	}

	public void setBookingDate(String bookingDate) {
		this.bookingDate = bookingDate;
	}

	public Date getReservationDate() {
		return reservationDate;
	}

	public void setReservationDate(Date reservationDate) {
		this.reservationDate = reservationDate;
	}

	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public Boolean getInvoiced() {
		return invoiced;
	}

	public void setInvoiced(Boolean invoiced) {
		this.invoiced = invoiced;
	}

	public Room getRoom() {
		return room;
	}

	public void setRoom(Room room) {
		this.room = room;
	}



}
