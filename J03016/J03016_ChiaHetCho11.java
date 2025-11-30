package J03016;

import java.util.*;

public class J03016_ChiaHetCho11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String s=sc.nextLine();
            int sum=0, sum1=0;
            for(int i=0;i<s.length();i++){
                char c=s.charAt(i);
                if(i%2==0) sum+=c-'0';
                else sum1+=c-'0';
            }
            if(Math.abs(sum-sum1)%11==0) System.out.println(1);
            else System.out.println(0);
        }
    }
}
