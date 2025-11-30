package J01008;

import java.util.*;

public class J01008_PhanTichThuaSoNguyenTo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        for(int t=1;t<=x;t++){
            int n=sc.nextInt();
            System.out.print("Test "+t+": ");
            for(int i=2;i<=Math.sqrt(n);i++){
                int cnt=0;
                while(n%i==0){
                    ++cnt;
                    n/=i;
                }
                if(cnt>0){
                    System.out.print(i+"("+cnt+") ");
                }
            }
            if(n!=1) System.out.print(n+"(1)");
            System.out.println();
        }
    }
}
