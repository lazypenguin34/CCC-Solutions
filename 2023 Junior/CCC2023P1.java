import java.util.Scanner;

public class CCC2023P1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int points = a * 50 - b * 10;
        if(a > b) {
            points += 500;
        }
        System.out.println(points);
        input.close();
    }
}