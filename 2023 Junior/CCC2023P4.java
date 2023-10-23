import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.ArrayList;

public class CCC2023P4 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int c = Integer.parseInt(br.readLine());
        ArrayList<Integer> lane1 = new ArrayList<Integer>();
        ArrayList<Integer> lane2 = new ArrayList<Integer>();

        // Read the list of integers
        StringTokenizer st = new StringTokenizer(br.readLine());

        // Add the integers to the list
        for (int i = 0; i < c; i++) {
            lane1.add(Integer.parseInt(st.nextToken()));
        }

        // Do the same for the second list
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < c; i++) {
            lane2.add(Integer.parseInt(st.nextToken()));
        }

        // Add both to a 2D ArrayList
        ArrayList<ArrayList<Integer>> road = new ArrayList<ArrayList<Integer>>();
        road.add(lane1);
        road.add(lane2);

        // Calculate the amount of tape
        int tape = 0;
        for (int n = 0; n < 2; n++) {
            int o = (n == 0) ? 1 : 0;
            for (int i = 0; i < c; i++) {
                int currentTriangle = road.get(n).get(i);
                int leftTriangle = (i > 0) ? road.get(n).get(i - 1) : 0;
                int rightTriangle = (i < c - 1) ? road.get(n).get(i + 1) : 0;
                int verticalTriangle = (i % 2 == 0) ? road.get(o).get(i) : 0;

                if (currentTriangle == 1) {
                    tape += 3;
                    if (currentTriangle == rightTriangle) {
                        tape--;
                    }
                    if (currentTriangle == leftTriangle) {
                        tape--;
                    }
                    if (currentTriangle == verticalTriangle) {
                        tape--;
                    }
                }
            }
        }
        System.out.println(tape);
        br.close();
    }
}