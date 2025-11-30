package J04022;

import java.util.*;

class WordSet{
    private String s;
    public WordSet(String s){
        this.s=s.toLowerCase();
    }
    public String union(WordSet s2){
        String res="";
        Set<String> se=new TreeSet<>();
        for(String w:this.s.trim().split("\\s+")) se.add(w);
        for(String w:s2.s.trim().split("\\s+")) se.add(w);
        for (String w:se) res+=w+" ";
        return res.trim();
    }
    public String intersection(WordSet s2){
        String res="";
        Set<String> set1= new TreeSet<>();
        Set<String> set2 = new TreeSet<>();
        for(String w:this.s.split("\\s+")) set1.add(w);
        for(String w:s2.s.split("\\s+")) set2.add(w);
        set1.retainAll(set2);
        for(String w:set1) res+=w+" ";
        return res.trim();
    }
}

public class J04022_Wordset {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        WordSet s1 = new WordSet(in.nextLine());
        WordSet s2 = new WordSet(in.nextLine());
        System.out.println(s1.union(s2));
        System.out.println(s1.intersection(s2));
    }
}
