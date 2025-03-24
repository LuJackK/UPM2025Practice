import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] ab = br.readLine().split(" ");
        int a = Integer.parseInt(ab[0]);
        int b = Integer.parseInt(ab[1]);
        int[][] carSpeeds = new int[a+b][];
        for (int i = 0; i < a+b; i++) {
            String[] s = br.readLine().split(" ");
            int[] speeds = new int[s[0]];
            for (int j = 1; j < s[0]; j++) {
               speeds[j] = Integer.parseInt(s[j]);
            }
            carDistance[i] = speeds;
        }


    }
    private int[][] badIntervals(int[][] carDistance){
        for (int i = 0; i < carDistance.length; i++) {
            for (int j = 0; j < carDistance[i].length; j++) {
                int[i+j][0] =  carDistance[i][j]/5.56e-3;
                int[i+j][1] = carDistance[i][j]+5e9/5.56e-3
            }
        }
        return carDistance;
    }
}