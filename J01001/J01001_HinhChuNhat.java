package J01001;

import java.util.*;

public class J01001_HinhChuNhat {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt(), n=sc.nextInt();
        if(m<=0||n<=0){
            System.out.println(0);
        }
        else{
            System.out.println((m+n)*2+" "+m*n);
        }
    }
}
