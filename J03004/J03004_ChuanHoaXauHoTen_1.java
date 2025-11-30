package J03004;

import java.util.*;

public class J03004_ChuanHoaXauHoTen_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String s=sc.nextLine();
            String[] a=s.trim().split("\\s+");
            for(String x:a){
                System.out.print(Character.toUpperCase(x.charAt(0)));
                for(int i=1;i<x.length();i++){
                    char c=x.charAt(i);
                    System.out.print(Character.toLowerCase(c));
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
