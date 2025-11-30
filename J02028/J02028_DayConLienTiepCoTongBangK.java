package J02028;

import java.util.*;

public class J02028_DayConLienTiepCoTongBangK {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt(), co=0;
            long k=sc.nextLong();
            long[] a=new long[n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextLong();
                if(a[i]==0) co=1;
            }
            if(k==0){
                if(co==1) System.out.println("YES");
                else System.out.println("NO");
            }
            else{
                long sum=0;
                int i=0, x=0, ok=0, check=1;
                while(i<n){
                    if(check==1) sum+=a[i];
                    if(sum==k){
                        ok=1;
                        break;
                    }
                    else if(sum>k){
                        sum-=a[x];
                        x++;
                        check=0;
                    }
                    else{
                        ++i;
                        check=1;
                    }
                }
                if(ok==1) System.out.println("YES");
                else System.out.println("NO");
            }
        }
    }
}
