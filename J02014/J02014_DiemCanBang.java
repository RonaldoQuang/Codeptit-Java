package J02014;

import java.util.*;

public class J02014_DiemCanBang {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt(), ok=0;
            int[] a=new int[n];
            int sum2=0;
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
                if(i>=2){
                    sum2+=a[i];
                }
            }
            int sum1=a[0];
            for(int i=1;i<n-1;i++){
                if(sum1==sum2){
                    ok=1;
                    System.out.println(i+1);
                    break;
                }
                else{
                    sum1+=a[i];
                    sum2-=a[i+1];
                }
            }
            if(ok==0) System.out.println(-1);
        }
    }
}
