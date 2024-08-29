import java.util.*; 
class Randomnum{ 
public static void main (String args[]){ 
Scanner sc = new Scanner(System.in);
System.out.println("enter the number between 1 to 100"); 
int personNum = 0; 	
int count =0; 
Random random = new Random();
int randomNumber=random.nextInt(100)+1; 
int personNumber = 0; 	
boolean correctGuess=false; 
while(!correctGuess){ 	
personNum=sc.nextInt(); 	
count++; 
if (personNum < 1 || personNum > 100) {     
System.out.println("Please enter a number between 1 and 100."); 
continue; 	
       } 		
if (randomNumber == personNum){ 	
System.out.println("your guess is correct "); 
correctGuess=true;	 		 
   } 		
else if(randomNumber < personNum){ 		
System.out.println("your number is slightly high.try again"); 	
    } 		
else if(randomNumber > personNum){ 	
System.out.println("your number is slightly low.try again");
  } 	
} 
System.out.println("how many times i try the number "+count);	
System.out.println("randomnumber "+randomNumber); 	
sc.close();  
   }  
}