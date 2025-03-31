import java.io.*;
import java.util.*;
public class HarderTask {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] ab = br.readLine().split(" ");
        int a = Integer.parseInt(ab[0]);
        int b = Integer.parseInt(ab[1]);
        long[][] carDistance = new long[a+b][];
        int nOfCars = 0;
        for (int i = 0; i < a+b; i++) {
            String[] s = br.readLine().split(" ");
            int noOfCars = Integer.parseInt(s[0]);
            nOfCars += noOfCars;
            long[] speeds = new long[noOfCars];
            for (int j = 1; j < noOfCars; j++) {
               speeds[j] = Long.parseLong(s[j]);
            }
            carDistance[i] = speeds;
        }
        long[] badIntervals = badIntervals(carDistance, nOfCars);
        Arrays.sort(badIntervals);
        System.out.println((int) badIntervals[0]);
    }
    private static long[] badIntervals(long[][] carDistance, int nOfCars){
        long[] badIntervals = new long[nOfCars];
        for (int i = 0; i < carDistance.length; i++) {
            if(carDistance[i] != null){
                for (int j = 0; j < carDistance[i].length; j++) {
                    badIntervals[i+j] = (long) (carDistance[i][j]/5.56e-3-((i+1)*1.43e12));
                }
            }
        }
        return badIntervals;
    }
}