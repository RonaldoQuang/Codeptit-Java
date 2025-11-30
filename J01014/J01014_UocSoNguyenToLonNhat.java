package J01014;

import java.util.*;

public class J01014_UocSoNguyenToLonNhat {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0) {
            long n = sc.nextLong(), x=n;
            for (long i = 2; i <= Math.sqrt(n); i++) {
                while (n % i == 0) {
                    n /= i;
                }
                x=i;
            }
            if(n!=1) System.out.println(n);
            else System.out.println(x);
        }
    }
}
