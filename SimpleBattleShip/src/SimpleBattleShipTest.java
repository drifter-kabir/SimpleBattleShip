import java.util.Scanner;

public class SimpleBattleShipTest {
    public static void main(String[] args){
        System.out.println("There is a 7X7 grid Battleground. There are 7 battleships"
                +" of enemies. You need to destroy all of them.\nBut you have to " +
                "guess their locations first. Try to guess less for the best Score.");
        Scanner sc=new Scanner(System.in);
        String st="";
        int cnt=0;
        int[] ar=new int[7];
        SimpleBattleShip game=new SimpleBattleShip();
        for(int j=0;j<7;j++){
            ar[j]= (int) ((Math.random() * 49) + 1);
           // System.out.println(ar[j]);
        }
        game.setLocations(ar);

        while(st!="YES"){
            cnt++;
            int gs=sc.nextInt();
            st=game.makeGuess(gs);
            clearScreen();
        }
        System.out.println();
        System.out.println();
        System.out.println("WELL DONE!!!");
        System.out.printf("YOUR SCORE: %.2f",(double)100*7/cnt);
    }
    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
