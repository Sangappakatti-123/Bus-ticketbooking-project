package com;
import java.util.Scanner;
public class Solution {
 public static void main(String[] args) {
	     
	   Scanner sc=new Scanner(System.in);
	   BusBooking book=new BusBookingImpl(50);
	   
	   while(true) {
		   System.out.println("1:Buy Tickets\n2:Cancel Tickets");
		   System.out.println("3:Get Tickets\n4:Exit");
		   System.out.println("Enter choice");
		   int choice=sc.nextInt();
		   switch(choice) {
		      case 1: System.out.println("Enter No of Tickets to Buy");
		              book.buyTickets(sc.nextInt());
		              break;
		      case 2:System.out.println("Enter No of Tickets to Cancel");
                     book.cancelTickets(sc.nextInt());
                     break;
		      case 3:book.getTickets();
		    	     break;
		      case 4:System.out.println("Thank you for choosing our application");
		             System.exit(0);
		      default : System.out.println("Invalid choice");
		   
		   
		   }
	   }
 
 }
}
