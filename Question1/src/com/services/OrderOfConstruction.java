package com.services;

public class OrderOfConstruction {

   
	        public int Building(int[] x, int n) {
	        	   int j=n;         
	               boolean flag; 
	        	for(int i=1;i<=n;i++)
	            {             
	          	  flag=false;            
	          	  System.out.println("Day "+i+":");            
	          	  while(j>=1 && x[j]<=i){                 
	          		  flag=true;                 
	          		  System.out.print( j +" ");                 
	          		  j--;             
	          		  }            
	          	  if(flag==true){                 
	          		  System.out.println();             
	          		  }        
	          	  }
				return j;
	        	
	        }
	 }


