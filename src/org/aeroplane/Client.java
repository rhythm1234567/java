package org.aeroplane;
import java.util.*;
import java.io.*;
public class Client {

	private String flightName=null;
	private int row=0;
	private int rowLength=0;
	private Flight flight=null;
	private String cmdString=null;
	private BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
//*************************************
	public static void main(String[] args) {
		new Flight().commandShell();
	}
	private void commandShell() {
		System.out.println("\n==============================");
	    System.out.println("Command Shell V");
	    System.out.println("type'exit'command to exit.");
	    while(true)
	    {
	    	readCommand();
	    	processCommand();
	    }
	}
	
	//**************************************************
	private void processCommand() {
		// TODO Auto-generated method stub
		
	}
	private void readCommand() {
		// TODO Auto-generated method stub
		
	}
	private int readInt(String valstr) {
		int val=0;
		try {
			val=Integer.parseInt(valstr);
			
		}catch(Exception e) {
			val=Integer.MIN_VALUE;
		}
		return val;
		
	}
	
}
