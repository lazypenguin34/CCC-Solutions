import java.util.Scanner;

public class CCC2019P1 {
    public static void main(String[]args) {
        Scanner input = new Scanner(System.in);
        int currentPoint = 0;
        int appleScore = 0;
        int bananaScore = 0;

        for (int n=3 ; n>0 ; n--) {
            currentPoint = input.nextInt();
            input.nextLine();
            currentPoint = currentPoint * n;
            appleScore = appleScore + currentPoint;
        }

        for (int n=3 ; n>0 ; n--) {
            currentPoint = input.nextInt();
            input.nextLine();
            currentPoint = currentPoint * n;
            bananaScore = bananaScore + currentPoint;
        }

        if (appleScore > bananaScore) {
            System.out.println("A");
        }

        if (bananaScore > appleScore) {
            System.out.println("B");
        }

        if (bananaScore == appleScore) {
            System.out.println("T");
        }

        input.close();
    }
}