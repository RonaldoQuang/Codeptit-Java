package J07072;

import java.util.*;
import java.io.*;

class name implements Comparable<name>{
    private String full, ho, dem, ten;
    public name(String s){
        s=chuanhoa(s);
        this.full=s;
        String[] a=s.split(" ");
        this.ten=a[a.length-1];
        this.ho=a[0];
        if(a.length>2){
            StringBuilder sb=new StringBuilder();
            for(int i=1;i<a.length-1;i++){
                sb.append(a[i]).append(" ");
            }
            this.dem=sb.toString().trim();
        }
        else{
            this.dem="";
        }
    }
    public String chuanhoa(String s){
        String[] a=s.trim().split("\\s+");
        String w="";
        for(int i=0;i<a.length-1;i++){
            w+=Character.toUpperCase(a[i].charAt(0))+a[i].substring(1,a[i].length()).toLowerCase()+" ";
        }
        w+=Character.toUpperCase(a[a.length-1].charAt(0))+a[a.length-1].substring(1,a[a.length-1].length()).toLowerCase();
        return w;
    }
    @Override
    public int compareTo(name a){
        if(!this.ten.equals(a.ten)) return this.ten.compareTo(a.ten);
        if(!this.ho.equals(a.ho)) return this.ho.compareTo(a.ho);
        return this.dem.compareTo(a.dem);
    }
    public void kq(){
        System.out.println(this.full);
    }
}

public class J07072_ChuanHoaVaSapXep {
    public static void main(String[] args) throws Exception{
        Scanner sc=new Scanner(new File("DANHSACH.in"));
        List<name> a=new ArrayList<>();
        while(sc.hasNext()){
            a.add(new name(sc.nextLine()));
        }
        Collections.sort(a);
        for(name x:a) x.kq();
    }
}
