package com.Driver;

import java.util.Scanner;

import com.services.OrderOfConstruction;

public class driverMain {
	
	 public static void main(String args[]) 
	 {         
		 OrderOfConstruction Build = new OrderOfConstruction();
		 System.out.println("Enter the total number floors in the building : ");   
		 Scanner sc = new Scanner(System.in); 
             int n = sc.nextInt(); 
            int x[] = new int[n+1];         
            for(int i=1;i<n+1;i++)
            {            
           	 System.out.println("Enter the floor size given on day : "+i);             
           	 int m=sc.nextInt();            
           	 x[m]=i;         
           	 }          
                 System.out.println("The order of construction is as follows jkb ");        
				   int Floorcount = Build.Building(x,n);		    
                 } 

		 
	 }
