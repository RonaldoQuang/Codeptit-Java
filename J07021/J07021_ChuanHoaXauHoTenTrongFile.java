package J07021;

import java.util.*;
import java.io.File;

public class J07021_ChuanHoaXauHoTenTrongFile {
    public static void main(String[] args) throws Exception{
        Scanner sc=new Scanner(new File("DATA.in"));
        while(sc.hasNextLine()){
            String s=sc.nextLine();
            if(s.equals("END")){
                break;
            }
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
