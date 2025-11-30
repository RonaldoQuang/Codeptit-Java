package J08012;

import java.util.*;

public class J08012_HinhSao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //int t=sc.nextInt();
        //while(t-->0){
        int n=sc.nextInt();
        int x=sc.nextInt(), y=sc.nextInt();
        int cnt1=0, cnt2=0;
        for(int i=1;i<=n-2;i++){
            int a=sc.nextInt(), b=sc.nextInt();
            if(a==x||b==x) ++cnt1;
            if(a==y||b==y) ++cnt2;
        }
        if(cnt1==n-2||cnt2==n-2) System.out.println("Yes");
        else System.out.println("No");
        //}
    }
}
