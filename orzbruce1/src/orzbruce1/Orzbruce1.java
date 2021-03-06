package orzbruce1;
import java.util.*;
import java.io.*;
import java.text.DecimalFormat;

public class Orzbruce1 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException{
        String test = "abcdef";
        for (int i = 0; i < test.length(); i++) {
            System.out.println((int)(test.charAt(i)-97));
        }
//        DecimalFormat df = new DecimalFormat(".00");
//        int a = readInt(), b = readInt(), c = readInt();
//        double ans = a/40000.0 + b/60000.0 + c/70000.0;
//        ans *= 60;
//        System.out.println(df.format(ans));
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
