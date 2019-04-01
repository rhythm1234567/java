package org.aeroplane;

public class Flight implements FlightInterface {
	private String  flightName;
	private int row;
	private int rowLength;
	private int[] fail= {-1};
	private Passenger[] passengerList;
	public Flight(String  flightName,int row,int rowLength) throws Exception {
		if(flightName==null||flightName.trim().length()==0||row<=0||rowLength<=0)
			throw new Exception("Error");
		else {
			this.flightName=flightName;
			this.row=row;
			this.rowLength=rowLength;
			this.passengerList=new Passenger[row*rowLength];
			for(int i=0;i<row*rowLength;i++)
				passengerList[i]=null;
		}
	}
	public int[] reserve(String[] names) {
		return null;
		
	}
	public boolean cancel(int bookingNumber) {
		return false;
		
	}
	public Passenger[] getPassengerList() {
		return  passengerList;
		
	}
}
