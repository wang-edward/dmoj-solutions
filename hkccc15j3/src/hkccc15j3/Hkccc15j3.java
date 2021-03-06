package hkccc15j3;
import java.util.*;
import java.io.*;
/**
 *
 * @author Edward Wang<https://github.com/edaword>
 */
public class Hkccc15j3 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    
    public static void main(String[] args) throws IOException{
        int n = readInt(), m = readInt();
        boolean row[] = new boolean[n], col[] = new boolean[n],left[] = new boolean[2*n-1], right[] = new boolean[2*n-1];
        
        Arrays.fill(row, Boolean.TRUE);
        Arrays.fill(col, Boolean.TRUE);
        Arrays.fill(left, Boolean.TRUE);
        Arrays.fill(right, Boolean.TRUE);
        
        for (int i = 0; i < m; i++) {
            int r = readInt(), c = readInt();
            r--; c--;
            row[r] = col[c] = left[r+c] = right[r+n-1-c] = false;
        }
        int ans = 0;
        for (int r = 0; r < n; r++) {
            for (int c = 0; c < n; c++) {
                if (row[r] && col[c] && left[r+c] && right[r+n-1-c]) {
                    ans++;
                }
            }
        }
        System.out.println(ans);
    }
    
    static String next() throws IOException {
        while (st==null || !st.hasMoreTokens()) {
            st = new StringTokenizer(br.readLine().trim());
        }
        return st.nextToken();
    }
    static long readLong() throws IOException {
        return Long.parseLong(next());
    }
    static int readInt() throws IOException {
        return Integer.parseInt(next());
    }
    static double readDouble() throws IOException {
        return Double.parseDouble(next());
    }
    static char readCharacter() throws IOException {
        return next().charAt(0);
    }
    static String readLine() throws IOException {
        return br.readLine().trim();
    }
}
