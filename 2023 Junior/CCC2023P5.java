import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class CCC2023P5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String w = br.readLine();
        int r = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());

        //Create 2D ArrayList for letters
        ArrayList<ArrayList<String>> set = new ArrayList<ArrayList<String>>();

        //Assemble the 2D word list
        for (int i=0 ; i<r ; i++) {
            ArrayList<String> row = new ArrayList<String>();
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int n=0 ; n<c ; n++) {
                row.add(st.nextToken());
            }
            set.add(row);
        }
        //Subtask #1 find the word once in any horizontal line
        for (int i=0 ; i<r ; i++) {
            for (int n=0 ; n<c ; n++) {
                if (set.get(i).get(n).equals(String.valueOf(w.charAt(0)))) {
                    
                }
            }
        }
    }
}
