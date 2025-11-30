package J02016;

import java.util.*;

public class J02016_BoBaSoPytago {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            long[] b=new long[n];
            long[] a=new long[n];
            for(int i=0;i<n;i++){
                b[i]=sc.nextInt();
                a[i]=b[i]*b[i];
            }
            Arrays.sort(a);
            int ok=0;
            for(int i=n-1;i>=2;i--){
                int l=0, r=i-1;
                while(l<r){
                    if(a[l]+a[r]==a[i]){
                        ok=1;
                        break;
                    }
                    else if(a[l]+a[r]<a[i]) ++l;
                    else --r;
                }
                if(ok==1) break;
            }
            if(ok==1) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
