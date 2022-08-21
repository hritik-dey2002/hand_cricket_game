import java.util.Scanner;
import java.util.Random;
import java.util.*;


public class hand_cricket_game {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("You are batting ");
        System.out.println("Play:");
        int bat = sc.nextInt();

        Random rand =new Random();
        int ball=rand.nextInt(6);
        int score=0;
        while(bat!=ball){
            if (bat<=6){
                System.out.println("bat: " +bat+ "ball: " +ball);
                score=score+bat;
                bat=sc.nextInt();

                ball=rand.nextInt(6);
            }
            else if (bat>6) {
                System.out.println("Invalid input");
                bat=sc.nextInt();
            }
            else {
                break;
            }
        }
        if (bat==ball){
            System.out.println("out!!!"+"your score was " +score);
        }
    }
}
