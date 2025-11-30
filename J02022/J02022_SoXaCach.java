package J02022;

import java.util.*;

public class J02022_SoXaCach {
    public static int cnt=0;
    public static int [] a=new int[11], vs=new int[11];
    public static void kq(int n){
        int ok=1;
        for(int i=1;i<n;i++){
            if(Math.abs(a[i]-a[i+1])==1){
                ok=0;
                break;
            }
        }
        if(ok==1){
            for(int i=1;i<=n;i++){
                System.out.print(a[i]);
            }
            System.out.println();
        }
    }
    public static void Try(int i, int n){
        for(int j=1;j<=n;j++){
            if(vs[j]==0){
                a[i]=j;
                vs[j]=1;
                if(i==n){
                    kq(n);
                }
                else Try(i+1,n);
                vs[j]=0;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            //Arrays.fill(vs,0);
            Try(1,n);
        }
    }
}
