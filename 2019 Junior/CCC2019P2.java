import java.util.Scanner;
import java.util.ArrayList;

public class CCC2019P2 {
    public static void main(String[]args) {
        Scanner input = new Scanner(System.in);

        int lines = input.nextInt();
        input.nextLine();
        ArrayList<String> message = new ArrayList<String>();
        ArrayList<String> decodedMessage = new ArrayList<String>();
        int length = 0;
        StringBuilder currentCharacter = new StringBuilder();
        StringBuilder currentMessage = new StringBuilder();

        // Decode the message
        for (int i=0 ; i<lines ; i++) {
            message.add(input.nextLine());
            // Replace the current character with the character(s) to the right of the space

            // Store variables of each line and construct the string
            currentCharacter.append(message.get(i).substring(message.get(i).indexOf(" ") + 1));
            length = Integer.parseInt(message.get(i).substring(0, message.get(i).indexOf(" ")));
            for (int n=0 ; n<length ; n++) {
                currentMessage.append(currentCharacter);
            }
            // Add to the array of decoded messages and clear StringBuilders
            decodedMessage.add(currentMessage.toString());
            currentCharacter.setLength(0);
            currentMessage.setLength(0);
        }

        // Output the decoded message
        for (int i=0 ; i<lines ; i++) {
            System.out.println(decodedMessage.get(i));
        }
    }
}
