package io.zipcoder.microlabs.mastering_loops;
import java.util.*;


public class Numbers {

    public String oneToTen(){
    	String output = "";
    	//name of the fucntion
    	output += "oneToTen()\n";
    	output += "*** Output ***";
    	for (int x=1; x<=10; x++)
    	{
    		output += "\n" + x; 	
    		
    	}
        return output;
    }

    public String oddNumbers(){
    	String output = "oddNumbers()\n" + "*** Output ***";
    			for (int x=1; x<20; x+=2) {
    				output += "\n" + x;
    			}
        return output;
    }

    public String squares(){
    	String output = "squares()\n" + "*** Output ***";
    	for (int x=1; x<=10; x++) {
    		output += "\n" + x*x;
    	}
        return output;
    }

    public String random4(){
        return "";
    }

    public String even(int n){
    	String output = "even()\n" + "*** Output ***";
    	for (int x=2; x<=n; x+=2) {
			output += "\n" + x;
    	}
 
        return output;
    }

    public String powers(int n){
    	String output = "powers()\n" + "*** Output ***";
    	for (int x=1; x<=n; x+=1)
    	{
    		output += "\n" + (int) Math.pow(2, x);   
    	}
        return output;
    }
    
    public String areWeThereYet(String n) {
    	if (n.equalsIgnoreCase("yes")) 
    	{
    		return "Good!";
    	
    		}
    	else {
    		return "Are we there yet?";
    		
    	}
    }
    	

    
    public String triangle(String s, int n) {
    	String mytriangle = s;
    	String output= s;
    	
    	for (int x=1; x<n; x++){
    		mytriangle = mytriangle + s; 	
    		output = output + "\n" + mytriangle;
    		
    	}		
    	return output;
    }  
    
    public String testSquare() {
    	String output= "";
    	for (int i=1; i<=4; i++){
    		String value = "";
    		for (int j=1; j<=4; j++)
    		{
    			if((i*j)<10)
    			 value = value + "|  " + (i*j) + " ";
    			else
    				value = value + "| " + (i*j) + " ";
    		
    		}
    		output= output + "\n" + value + "|";
    				
    	}
    	return output;
    }
    
   
    //THIS QUESTION HAS NOT BEEN COMPLETED YET
    public String testSquaresn(int row, int column) {
    	String output= "";
    	for (int i=1; i<=row; i++){
    		String value = "";
    		for (int j=1; j<=column; j++)
    		{
    			if((i*j)<10)
    			 value = value + "|" + (i*j) + " ";
    			else
    				value = value + " | " + (i*j) + " ";
    		
    		}
    		output= output + value + "\n" + "|";
    				
    	}
    	return output;
    }
    
}
