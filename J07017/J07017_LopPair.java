package J07017;

import java.util.*;
import java.io.*;

class Pair<K,V>{
    private int x, y;
    public Pair(int x, int y){
        this.x=x;
        this.y=y;
    }
    public boolean isPrime(){
        if(nto(this.x)&&nto(this.y)) return true;
        else return false;
    }
    public boolean nto(int n){
        for(int i=2;i*i<=n;i++){
            if(n%i==0) return false;
        }
        return n>1;
    }
    public String toString(){
        return x+" "+y;
    }
}

public class J07017_LopPair {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("DATA.in"));
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            boolean check = false;
            for(int i = 2; i <= 2*Math.sqrt(n); i++){
                Pair<Integer, Integer> p = new Pair<>(i, n-i);
                if(p.isPrime()){
                    System.out.println(p);
                    check = true;
                    break;
                }
            }
            if(!check) System.out.println(-1);
        }
    }
    public static void main6694370(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("DATA.in"));
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            boolean check = false;
            for(int i = 2; i <= 2*Math.sqrt(n); i++){
                Pair<Integer, Integer> p = new Pair<>(i, n-i);
                if(p.isPrime()){
                    System.out.println(p);
                    check = true;
                    break;
                }
            }
            if(!check) System.out.println(-1);
        }
    }
}

