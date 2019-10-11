import java.util.Scanner;

class Question7{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String ans=("y");
        int roll;
        int sides=0;
        int dicerolls=0;
        int total =0;
        while(ans.equals("y")){
            System.out.println("How many dice do you want to roll? ");
            dicerolls=sc.nextInt();

            System.out.println("How many sides do these dice have?");
            sides=sc.nextInt();

            for(int i=0; i<dicerolls;i++){
                roll=rollDie(sides);
                total=total+roll;
                System.out.println("Your rolls: " + roll);

            }
            System.out.println("total:" + total);
            System.out.println("Do you want to roll again? y/n");

            ans=sc.next();

        }
    }
    public static int rollDie(int roll){

        roll= (int)(Math.random()*roll)+1 ;
        return roll;


    }
}