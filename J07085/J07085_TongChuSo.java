package J07085;

import java.util.*;
import java.io.*;

public class J07085_TongChuSo {
    public static int tinh(String s){
        int sum=0;
        for(int i=0;i<s.length();i++){
            sum+=s.charAt(i)-'0';
        }
        return sum;
    }
    public static void main(String[] args) throws Exception{
        ObjectInputStream ois=new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<String> a= (ArrayList<String>) ois.readObject();
        List<String> b=new ArrayList<>();
        for(String x:a){
            String s="";
            for(int i=0;i<x.length();i++){
                char c=x.charAt(i);
                if(Character.isDigit(c)){
                    if(c=='0'){
                        if(s.length()!=0) s+=c;
                    }
                    else s+=c;
                }
            }
            b.add(s);
        }
        for(String x:b){
            System.out.println(x+" "+tinh(x));
        }
    }
}


