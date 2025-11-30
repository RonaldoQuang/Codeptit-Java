package J03005;

import java.util.*;

public class J03005_ChuanHoaXauHoTen_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String s=sc.nextLine();
            String[] a=s.trim().split("\\s+");
            for(int i=1;i<a.length;i++){
                System.out.print(Character.toUpperCase(a[i].charAt(0)));
                for(int j=1;j<a[i].length();j++){
                    char c=a[i].charAt(j);
                    System.out.print(Character.toLowerCase(c));
                }
                if(i==a.length-1) System.out.print(", ");
                else System.out.print(" ");
            }
            System.out.println(a[0].toUpperCase());
        }
    }
}
