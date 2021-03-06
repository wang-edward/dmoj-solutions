package dmopc20c4p1;
import java.util.*;
import java.io.*;

public class Dmopc20c4p1 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException{
        long t = readLong();
        
        for (long k = 0; k < t; k++) {
            long n = readLong(), s = readLong();
            long sum = (n * (n+1))/2;
            long dif = sum-s;
            long maxB, minB;
            maxB = Math.min(n,dif-1);
            minB = dif/2;
            System.out.println(maxB-minB);
        }
    }

    static String next () throws IOException {
            while (st == null || !st.hasMoreTokens())
                    st = new StringTokenizer(br.readLine().trim());
            return st.nextToken();
    }
    static long readLong () throws IOException {
            return Long.parseLong(next());
    }
    static int readInt () throws IOException {
            return Integer.parseInt(next());
    }
    static double readDouble () throws IOException {
            return Double.parseDouble(next());
    }
    static char readCharacter () throws IOException {
            return next().charAt(0);
    }
    static String readLine () throws IOException {
            return br.readLine().trim();
    }
    
}
