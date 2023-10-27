import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class CCC2022S1 {
    private static int n = 0;
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[]args) throws IOException {
        n = Integer.parseInt(br.readLine());
        int output = 0;

        // Checks for combinations of multiples of 4 and 5
        for (int i=0 ; n>= i*5 ; i++) {
            if ((n - i * 5) % 4 == 0) {
                output++;
            }
        }
        System.out.println(output);
    }
}