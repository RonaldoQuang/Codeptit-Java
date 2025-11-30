package J01012;

import java.util.*;

public class J01012_UocSoChiaHetCho2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt(), cnt=0;
            for(int i=1;i<=Math.sqrt(n);i++){
                if(n%i==0){
                    int j=n/i;
                    if(i%2==0) ++cnt;
                    if(j%2==0&&j!=i) ++cnt;
                }
            }
            System.out.println(cnt);
        }
    }
}
