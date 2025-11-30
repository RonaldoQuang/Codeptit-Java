package J07029;

import java.util.*;
import java.io.*;

public class J07029_SoNguyenToLonNhatTrongFile {
    static boolean[] a=new boolean[1000001];
    public static void sang(){
        a[0]=a[1]=false;
        for(int i=2;i<=1000000;i++){
            a[i]=true;
        }
        for(int i=2;i<=Math.sqrt(1000000);i++){
            if(a[i]){
                for(int j=i*i;j<=1000000;j+=i){
                    a[j]=false;
                }
            }
        }
    }
    public static void main(String[] args) throws Exception{
        sang();
        ObjectInputStream ois=new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<Integer> x= (ArrayList<Integer>) ois.readObject();
        Map<Integer,Integer> mp=new HashMap<>();
        x.forEach(e->{
            if(a[e]){
                mp.put(e,mp.getOrDefault(e,0)+1);
            }
        });
        List<Integer> b=new ArrayList<>(mp.keySet());
        Collections.sort(b,Collections.reverseOrder());
        for(int i=0;i<10;i++){
            System.out.println(b.get(i)+" "+mp.get(b.get(i)));
        }
    }
}