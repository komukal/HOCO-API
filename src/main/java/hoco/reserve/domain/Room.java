package hoco.reserve.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Room {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "roomId", nullable = false, updatable = false)
	private Long roomId;

	private String roomName, roomDescription, openTime, closeTime;
	private int maxReservationTime, minReservationTime;

	public Room() {
	}

	public Room(String roomName, String roomDescription, String openTime, String closeTime, int maxReservationTime,
			int minReservationTime) {

		this.roomName = roomName;
		this.roomDescription = roomDescription;
		this.openTime = openTime;
		this.closeTime = closeTime;
		this.maxReservationTime = maxReservationTime;
		this.minReservationTime = minReservationTime;
	}

	public String getRoomName() {
		return roomName;
	}

	public void setRoomName(String roomName) {
		this.roomName = roomName;
	}

	public String getRoomDescription() {
		return roomDescription;
	}

	public void setRoomDescription(String roomDescription) {
		this.roomDescription = roomDescription;
	}

	public String getOpenTime() {
		return openTime;
	}

	public void setOpenTime(String openTime) {
		this.openTime = openTime;
	}

	public String getCloseTime() {
		return closeTime;
	}

	public void setCloseTime(String closeTime) {
		this.closeTime = closeTime;
	}

	public int getMaxReservationTime() {
		return maxReservationTime;
	}

	public void setMaxReservationTime(int maxReservationTime) {
		this.maxReservationTime = maxReservationTime;
	}

	public int getMinReservationTime() {
		return minReservationTime;
	}

	public void setMinReservationTime(int minReservationTime) {
		this.minReservationTime = minReservationTime;
	}

	public Long getRoomId() {
		return roomId;
	}

	@Override
	public String toString() {
		return "Room [roomId=" + roomId + ", roomName=" + roomName + ", roomDescription=" + roomDescription
				+ ", openTime=" + openTime + ", closeTime=" + closeTime + ", maxReservationTime=" + maxReservationTime
				+ ", minReservationTime=" + minReservationTime + "]";
	}

}
