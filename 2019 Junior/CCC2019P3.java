import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class CCC2019P3 {
    public static void main(String[]args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char prevChar = ' ';
        char currentChar = ' ';
        int magnitude = 0;
        StringBuilder codedMessage = new StringBuilder();
        int lines = Integer.parseInt(br.readLine());
        ArrayList<String> output = new ArrayList<String>();

        for (int n=0 ; n<lines ; n++) {
            String input = br.readLine();
            for (int i=0 ; i<input.length() ; i++) {
                // Check if it's the first character
                if (i == 0) {
                    magnitude++;
                    continue;
                }
                // Check if the current character is the previous character
                prevChar = input.charAt(i -1);
                currentChar = input.charAt(i);
                if (currentChar == prevChar) {
                    magnitude++;
                } else { // If it's not, add the coded message
                    codedMessage.append(magnitude + " " + prevChar + " ");
                    magnitude = 1;
                }
            }
            // Last character
            codedMessage.append(magnitude + " " + currentChar);
            output.add(codedMessage.toString());
            codedMessage.setLength(0);
            magnitude = 0;
        }
        br.close();
        for (int i=0 ; i<output.size() ; i++) {
            System.out.println(output.get(i));
        }
    }
}
