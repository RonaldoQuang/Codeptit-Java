package J07032;

import java.util.*;
import java.io.*;

public class J07032_SoThuanNghichTrongFileNhiPhan {
    static Map<Integer,Integer> mp=new HashMap<>();
    public static int tn(int n){
        int res=0;
        while(n!=0){
            res=res*10+n%10;
            n/=10;
        }
        return res;
    }
    public static void sang(){
        for(int i=1;i<100;i+=2){
            if(i%2==1&&tn(i)%2==1){
                for(int j=1;j<=9;j+=2){
                    StringBuilder s=new StringBuilder();
                    s.append(String.valueOf(i)+String.valueOf(j)+String.valueOf(tn(i)));
                    mp.put(Integer.parseInt(s.toString()),1);
                }
            }
        }
    }
    public static void main(String[] args) throws Exception{
        Map<Integer,Integer> m=new HashMap<>();
        Map<Integer,Integer> mp1=new HashMap<>();
        Map<Integer,Integer> mp2=new HashMap<>();
        ObjectInputStream ois=new ObjectInputStream(new FileInputStream("DATA1.in"));
        ArrayList<Integer> a= (ArrayList<Integer>) ois.readObject();
        for(int x:a){
            if(mp.getOrDefault(x,0)==1){
                mp1.put(x,mp1.getOrDefault(x,0)+1);
            }
        }
        ObjectInputStream ois1=new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> b= (ArrayList<Integer>) ois1.readObject();
        for(int x:a){
            if(mp.getOrDefault(x,0)==1&&mp1.getOrDefault(x,0)>=1){
                m.put(x,m.getOrDefault(x,0)+1);
                mp2.put(x,mp2.getOrDefault(x,0)+1);
            }
        }
        List<Integer> lis=new ArrayList<>(m.keySet());
        Collections.sort(lis);
        for(int i=0;i<10;i++){
            System.out.println(lis.get(i)+" "+(mp1.get(i)+mp2.get(i)));
        }
    }
}
