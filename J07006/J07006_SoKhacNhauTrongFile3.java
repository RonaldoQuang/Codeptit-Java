package J07006;

import java.util.*;
import java.io.*;

public class J07006_SoKhacNhauTrongFile3 {
    public static void main(String[] args) throws Exception{
        ObjectInputStream ois=new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<Integer> a= (ArrayList<Integer>) ois.readObject();
        Map<Integer,Integer> mp=new HashMap<>();
        for(int x:a){
            mp.put(x,mp.getOrDefault(x,0)+1);
        }
        List<Integer> b=new ArrayList<>(mp.keySet());
        Collections.sort(b);
        for(int x:b){
            System.out.println(x+" "+mp.get(x));
        }
    }
}
