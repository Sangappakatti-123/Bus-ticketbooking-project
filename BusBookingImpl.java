package com;

public class BusBookingImpl implements BusBooking {
	int availableTickets;
	BusBookingImpl(int availableTickets){
		this.availableTickets=availableTickets;
	}
	
	@Override
	public  void buyTickets(int tickets) {
		if(tickets<=availableTickets) {
			 System.out.println("Buying "+tickets+" Tickets");
		     availableTickets= availableTickets-tickets;
		     System.out.println("Tickest Booked Sucessfully");
		}
		else { 
			try {
			String message="Invalid Tickets ! Available Tickets are "+availableTickets;
		     throw new InvalidTicketSizeException(message);
		     }catch(Exception e) {
		    	 System.out.println(e.getMessage());
		      }
			}
       }
	@Override
	public void cancelTickets(int tickets) {
		System.out.println("Cancelling "+tickets+" Tickets");
        availableTickets= availableTickets+tickets;//availableTickets+=tickets;
        System.out.println("Tickest Cancelled Sucessfully");
	}
	@Override
	public void getTickets() {
          System.out.println("Available tickets :"+availableTickets);
	}
}
