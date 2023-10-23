import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class CCC2023P3 {
    public static void main(String[]args) {
        // Create scanner object and get number of people
        Scanner input = new Scanner(System.in);
        int numPeople = input.nextInt();
        input.nextLine();

        // Create an arraylist, with each element represting a day of the week
        // Then, take the input of the current person's availability and add a value of 1 to days which they are available
        ArrayList<Integer> availability = new ArrayList<Integer>();
        for (int d=0;d<5;d++) {
            availability.add(0);
        }

        // 1st for loop for iterating over the number of people
        for (int i=0;i<numPeople;i++) {
            String currentPerson = input.nextLine();
        
        // Nested for loop for iterating over the number of days in each week
            for (int d=0;d<5;d++) {
                if (currentPerson.charAt(d) == 'Y') {
                    availability.set(d, availability.get(d) + 1);
                }
            }
        }

        // Find the day(s) with the maximum availability

        ArrayList<Integer> commonDays = new ArrayList<Integer>();
        int maxAvailability = Collections.max(availability);

        for (int i=0 ; i<availability.size() ; i++) {
            if (availability.get(i) == maxAvailability) {
                commonDays.add(i + 1);
            }
        }
       
        // Print commonDays with the proper output specification
        StringBuilder output = new StringBuilder();

        for (int i=0 ; i < commonDays.size() ; i++) {
            output.append(commonDays.get(i) + ",");
        }
        output.deleteCharAt(output.length() - 1);
        System.out.println(output);
        input.close();
    }
}