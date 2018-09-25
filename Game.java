package New;
import java.util.*;

public class Game {
     static String computer;
	public static void main(String[] args)
	{
		String[] sArray = {"rock","paper","scissor"};
		int rand = (int)(Math.random()*3);
		computer =sArray[rand];
		System.out.println(computer);

		Scanner input =new Scanner(System.in);
		System.out.println("hello!");
		System.out.println("press yes if you want to play the game");
		int n =input.next().charAt(0);
		
		
		if(n == 'y')
		{
		  System.out.println("Welcome to the game \nenter any one from rock paper scissor");
			
		  Scanner inputn =new Scanner(System.in);
		  String player = inputn.nextLine();
	    
		
           if(player.equals(computer))
              {
        	      System.out.println("It's a draw");
              }
        
        
           else if(player.equals("rock"))
           {
     	     if(computer.equals("scissor"))
     	        {
              		System.out.println("YOU WON!!");
     	        }
            	else if(computer.equals(" paper"))
     	        {
     	        	System.out.println("YOU LOST!!");
     	        }
           }
           
           
           else if(player.equals("paper"))
              {
        	     if(computer.equals("rock"))
        	         {
        		         System.out.println("congrats YOU WON!!");
        	         }
        	     else if(computer.equals("scissor"))
        	         {
        		         System.out.println("get cut!!!! YOU LOST!!");
        	         }
              }
        
        
	
        
        
        else if(player.equals("scissor"))
        {
        	if(computer.equals(" rock"))
        	{
        		System.out.println("YOU LOST!crushed buy rock");
        	}
        	else if(computer.equals(" paper"))
        	{
        		System.out.println(" WON!!!");
        	}
        }
		
		else
		{
			System.out.println("Invalid input");
			System.exit(0);
		}

	}
		
	}

}