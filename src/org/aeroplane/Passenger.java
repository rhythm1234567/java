package org.aeroplane;

public class Passenger implements PassengerInterface {
private String names;
private int bookingNumber;
private int rows;
private int seatPosition;
public Passenger(String names,int bookingNumber,int rows, int seatPosition) {
	this.names=names;
	this.bookingNumber=bookingNumber;
	this.rows=rows;
	this.seatPosition=seatPosition;
}
	public String getName() {
		// TODO Auto-generated method stub
		return names;
	}

	public int getBookingNumber() {
		// TODO Auto-generated method stub
		return bookingNumber;
	}

	public int getRow() {
		// TODO Auto-generated method stub
		return rows;
	}

	public int getSeatPosition() {
		// TODO Auto-generated method stub
		return seatPosition;
	}

}
