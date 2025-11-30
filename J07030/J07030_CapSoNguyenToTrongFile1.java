package J07030;

import java.util.*;
import java.io.*;

public class J07030_CapSoNguyenToTrongFile1 {
    static boolean[] prime=new boolean[1000001];
    public static void sang(){
        prime[0]=prime[1]=false;
        for(int i=2;i<=1000000;i++){
            prime[i]=true;
        }
        for(int i=2;i<=Math.sqrt(1000000);i++){
            if(prime[i]){
                for(int j=i*i;j<=1000000;j+=i){
                    prime[j]=false;
                }
            }
        }
    }
    public static void main(String[] args) throws Exception{
        sang();
        Map<Integer,Integer> mp=new HashMap<>();
        ObjectInputStream ois=new ObjectInputStream(new FileInputStream("DATA1.in"));
        ArrayList<Integer> a= (ArrayList<Integer>) ois.readObject();
        for(int x:a){
            if(prime[x]) mp.put(x,1);
        }
        ObjectInputStream ois1=new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> b= (ArrayList<Integer>) ois1.readObject();
        for(int i:b){
            int x=1000000-i;
            if(mp.getOrDefault(x,0)==1&&prime[i]){
                mp.put(x,2);
            }
        }
        for(int i=2;i<500000;i++){
            if(mp.getOrDefault(i,0)==2){
                System.out.println(i+" "+(1000000-i));
            }
        }
    }
}
