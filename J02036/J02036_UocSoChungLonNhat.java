package J02036;

import java.util.*;

public class J02036_UocSoChungLonNhat {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            long[] a=new long[n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextLong();
            }
            System.out.print(a[0]+" ");
            for(int i=0;i<n-1;i++){
                System.out.print(bcnn(a[i],a[i+1])+" ");
            }
            System.out.println(a[n-1]);
        }
    }
    public static long ucln(long a, long b){
        if(b==0) return a;
        return ucln(b,a%b);
    }
    public static long bcnn(long a, long b){
        return a*b/ucln(a,b);
    }
}
