package J03032;

import java.util.*;

public class J03032_DaoTu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String s=sc.nextLine();
            String[] a=s.trim().split("\\s+");
            for(int i=0;i<a.length;i++){
                for(int j=a[i].length()-1;j>=0;j--){
                    char c=a[i].charAt(j);
                    System.out.print(c);
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
