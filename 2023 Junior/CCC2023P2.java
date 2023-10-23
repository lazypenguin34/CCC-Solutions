import java.util.*; //Import required classes

public class CCC2023P2{
    public static void main(String[] args) {
        //Creating an empty hashmap
        HashMap<String, Integer> hm = new HashMap<String, Integer>();

        //Inserting pairs in map using put() method
        hm.put("Poblano", 1500);
        hm.put("Mirasol", 6000);
        hm.put("Serrano", 15500);
        hm.put("Cayenne", 40000);
        hm.put("Thai", 75000);
        hm.put("Habanero", 125000);

        //Getting inputs
        int scholville = 0;
        String pepper = "";
        Scanner input = new Scanner(System.in);

        int pepperCount = input.nextInt();
        input.nextLine();

        for (int i=0; i<pepperCount;i++) {
            pepper = input.nextLine();
            scholville += hm.get(pepper);
        }
        System.out.println(scholville);
        input.close();
    }
}