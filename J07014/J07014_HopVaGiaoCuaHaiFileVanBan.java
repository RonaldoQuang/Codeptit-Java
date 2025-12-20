package J07014;

import java.util.*;
import java.io.*;

class WordSet{
    private String s;
    public WordSet(String w) throws IOException{
        Scanner sc=new Scanner(new File(w));
        String s="";
        while(sc.hasNextLine()){
            String x=sc.nextLine().toLowerCase();
            s+=x+" ";
        }
        this.s=s;
    }
    public WordSet(String s, boolean isContent){
        this.s=s;
    }
    public WordSet union(WordSet b){
        Set<String> a=new TreeSet<>();
        String[] a1=this.s.split("\\s+");
        String[] a2=b.s.split("\\s+");
        for(String x:a1)  a.add(x);
        for(String x:a2) a.add(x);
        String c="";
        for(String x:a) c+=x+" ";
        WordSet x=new WordSet(c,true);
        return x;
    }
    public WordSet intersection(WordSet b){
        Map<String,Integer> mp=new HashMap<>();
        Set<String> a=new TreeSet<>();
        String[] a1=this.s.split("\\s+");
        String[] a2=b.s.split("\\s+");
        for(String x:a1) mp.put(x,1);
        for(String x:a2){
            if(mp.getOrDefault(x,0)==1) mp.put(x,2);
            else if(mp.getOrDefault(x,0)==1) mp.put(x,1);
        }
        for(Map.Entry<String,Integer> x:mp.entrySet()){
            if(x.getValue()==2) a.add(x.getKey());
        }
        String c="";
        for(String x:a) c+=x+" ";
        WordSet x=new WordSet(c,true);
        return x;
    }
    public String toString(){
        return s;
    }
}

public class J07014_HopVaGiaoCuaHaiFileVanBan {
    public static void main(String[] args) throws IOException {
        WordSet s1 = new WordSet("DATA1.in");
        WordSet s2 = new WordSet("DATA2.in");
        System.out.println(s1.union(s2));
        System.out.println(s1.intersection(s2));
    }
}
