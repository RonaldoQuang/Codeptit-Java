package J07015;

import java.util.*;
import java.io.*;

public class J07015_SoNguyenToTrongFileNhiPhan {
    static boolean[] prime=new boolean[10001];
    public static void sang(){
        prime[0]=prime[1]=false;
        for(int i=2;i<=10000;i++){
            prime[i]=true;
        }
        for(int i=2;i<=Math.sqrt(10000);i++){
            if(prime[i]){
                for(int j=i*i;j<=10000;j+=i){
                    prime[j]=false;
                }
            }
        }
    }
    public static void main(String[] args) throws Exception{
        sang();
        Map<Integer,Integer> mp=new HashMap<>();
        ObjectInputStream ois=new ObjectInputStream(new BufferedInputStream(new FileInputStream("SONGUYEN.in")));
        ArrayList<Integer> a= (ArrayList<Integer>) ois.readObject();
        for(int x:a){
            if(prime[x]) mp.put(x,mp.getOrDefault(x,0)+1);
        }
        for(int i=2;i<10000;i++){
            if(prime[i]) System.out.println(i+" "+mp.get(i));
        }
    }
}
