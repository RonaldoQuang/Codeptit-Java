package J02004;

import java.util.*;

public class J02004_MangDoiXung {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt(), ok=1;
            int[] a=new int[n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
            for(int i=0;i<n/2;i++){
                if(a[i]!=a[n-1-i]){
                    ok=0;
                    break;
                }
            }
            if(ok==1) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
