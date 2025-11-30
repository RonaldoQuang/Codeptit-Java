package J08015;

import java.util.*;

public class J08015_CapSoCoTongBangK {
    public static long upper_bound(long[] a, long k, int l, int r){
        long x=r+1;
        while(l<=r){
            int m=(l+r)/2;
            if(a[m]==k){
                x=m;
                l=m+1;
            }
            else if(a[m]>=k){
                r=m-1;
            }
            else l=m+1;
        }
        return x;
    }
    public static long lower_bound(long[] a, long k, int l, int r){
        long x=r+1;
        while(l<=r){
            int m=(l+r)/2;
            if(a[m]==k){
                x=m;
                r=m-1;
            }
            else if(a[m]>=k){
                r=m-1;
            }
            else l=m+1;
        }
        return x;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            long k=sc.nextLong();
            long[] a=new long[n];
            for(int i=0;i<n;i++) a[i]=sc.nextLong();
            Arrays.sort(a);
            long cnt=0;
            for(int i=0;i<n-1;i++){
                long it=upper_bound(a,k-a[i],i+1,n-1);
                long it2=lower_bound(a,k-a[i],i+1,n-1);
                if(it2<n){
                    cnt+=it-it2+1;
                }
            }
            System.out.println(cnt);
        }
    }
}
