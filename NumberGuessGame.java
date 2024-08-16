


import java.util.Scanner;

 class  NumberGuessGame{

    public static void main(String[] args) {
        int the_number = (int)(Math.random()*100);
         Scanner sc = new Scanner(System.in);
         int trycount =0;
         
          while(true){
        System.out.println("Enter your guess (1-100) :");
         int player_Guess_Number = sc.nextInt();
           trycount++;
           
        if(player_Guess_Number == the_number ){
            System.out.println("You guess exit number! You Win ");
            System.out.println("It took you"+" "+ trycount+" "+"tries");
            break;
        }
        
         if (player_Guess_Number<the_number){
            System.out.println("no! Guess number is greater.Guess again the number");
        }
        
        else if(player_Guess_Number>the_number){
            System.out.println("no! Guess number is smaller.Guess again the number");
           

         }
       }
    }
}