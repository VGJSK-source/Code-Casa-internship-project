import java.util.*;
import java.util.Random;
class   MainGame{
    public int number;
    public int inputnumber; 
    public int noOfGuesses=0;
    
    public int getnoOfGuesses(){
        return noOfGuesses;
    }

    public void setnoOfGuesses( int noOfGuesses){
        this.noOfGuesses=noOfGuesses;
    } 

    MainGame(){
        Random r= new Random();
        this.number=r.nextInt(100);
    }
    
   
    MainGame(int n){
    this.number=n;
    }
    void takeUserINputNumber(){
        System.out.println("Guess the number");
        Scanner sc= new Scanner(System.in);
        inputnumber=sc.nextInt();
        //return inputnumber;
    }
    boolean isCorrectNumber(){
    if(inputnumber==number){
        noOfGuesses++;
        System.out.format("Yes you guesses it right, it was %d\n you guessed it in %d attempt ",number,noOfGuesses);
        return true;
    }
    else if(inputnumber<number){
        System.out.println("Number is too low....");
    }
    else if(inputnumber>number){
        System.out.println("Number is too high...");
    }
    return false;
    }

    
    
}
public class Game{
   public static void main(String[] args) {
        System.out.println("Hello world..");
        MainGame mg= new MainGame();
        boolean b=false;
        while(!b){ 
        mg.takeUserINputNumber();
        b= mg.isCorrectNumber();
        System.out.println(b);
        }
    } 
}

