package J07032;

import java.util.*;
import java.io.*;

public class J07032_SoThuanNghichTrongFileNhiPhan {
    static boolean[] a=new boolean[1000001];
    public static boolean check(int n){
        int res=0, m=n;
        while(n!=0){
            if(n%2==0) return false;
            res=res*10+n%10;
            n/=10;
        }
        if(res==m) return true;
        else return false;
    }
    public static void sang(){
        Arrays.fill(a, false);
        for(int i=100;i<=1000000;i++){
            if(check(i)){
                if((i>=100&i<1000)||(i>=10000&&i<1000000)) a[i]=true;
            }
        }
    }
    public static void main(String[] args) throws Exception{
        sang();
        Map<Integer,Integer> mp=new HashMap<>();
        Set<Integer> se=new TreeSet<>();
        ObjectInputStream ois=new ObjectInputStream(new BufferedInputStream(new FileInputStream("DATA1.in")));
        ArrayList<Integer> a1= (ArrayList<Integer>) ois.readObject();
        for(int x:a1){
            if(a[x]) mp.put(x,mp.getOrDefault(x,0)+1);
        }
        ObjectInputStream ois1=new ObjectInputStream(new BufferedInputStream(new FileInputStream("DATA2.in")));
        ArrayList<Integer> b= (ArrayList<Integer>) ois1.readObject();
        for(int x:b){
            if(mp.getOrDefault(x,0)>0){
                mp.put(x,mp.getOrDefault(x,0)+1);
                se.add(x);
            }
        }
        int cnt=0;
        for(int x:se){
            ++cnt;
            System.out.println(x+" "+mp.get(x));
            if(cnt==10) break;
        }
    }
}
