
import java.util.Scanner;

public class User {
    
    String userName;
    int userScore;
    
    public void setName() {
        
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter Username: ");
        userName = keyboard.next();
        keyboard.close();
        
    }
    
    public String getName() {
        
        return userName;
        
    }
    
    public void setScore() {
        
        userScore++;
        
    }
    
    public int getScore() {
    
        return userScore;
    
    }
    
    public int movesRemaining() {
    
    	//the goal of this class is to analyze the current values in the column, row, and 
    	// subgrid of the selected box and compute the possible values that would satisfy them.
    	return 0;
    }
    
}