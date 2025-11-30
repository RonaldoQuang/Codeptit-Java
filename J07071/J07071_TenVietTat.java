package J07071;

import java.util.*;
import java.io.*;

class ten implements Comparable<ten>{
    private String full, ten, ho;
    public ten(String s){
        this.full=s;
        String[] a=s.trim().split("\\s+");
        this.ten=a[a.length-1];
        this.ho=a[0];
    }
    public String getFull() {
        return full;
    }
    @Override
    public int compareTo(ten a){
        if(!this.ten.equals(a.ten)) return this.ten.compareTo(a.ten);
        return this.ho.compareTo(a.ho);
    }
}

public class J07071_TenVietTat {
    public static boolean check(String a, String b){
        int cnt=0;
        if(a.length()!=b.length()) return false;
        else{
            for(int i=0;i<a.length();i++){
                char x=a.charAt(i), y=b.charAt(i);
                if(x!=y) ++cnt;
            }
            if(cnt==1) return true;
            else return false;
        }
    }
    public static String chuanhoa(String a){
        String[] s=a.trim().split("\\s+");
        String w="";
        for(int i=0;i<s.length-1;i++){
            w+=Character.toUpperCase(s[i].charAt(0))+".";
        }
        w+=Character.toUpperCase(s[s.length-1].charAt(0));
        return w;
    }
    public static void main(String[] args) throws Exception{
        Scanner sc=new Scanner(new File("DANHSACH.in"));
        int n= sc.nextInt();
        List<ten> a=new ArrayList<>();
        sc.nextLine();
        while(n-->0){
            a.add(new ten(sc.nextLine()));
        }
        Collections.sort(a);
        int m=sc.nextInt();
        while(m-->0){
            String mau=sc.next();
            for(ten x:a){
                if(check(chuanhoa(x.getFull()),mau)) System.out.println(x.getFull());
            }
        }
    }
}
