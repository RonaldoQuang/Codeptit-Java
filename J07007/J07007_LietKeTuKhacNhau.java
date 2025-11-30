package J07007;

import java.util.*;
import java.io.File;

public class J07007_LietKeTuKhacNhau {
    public static void main(String[] args) throws Exception{
        Scanner sc=new Scanner(new File("VANBAN.in"));
        Set<String> se=new TreeSet<>();
        while(sc.hasNext()){
            se.add(sc.next().toLowerCase());
        }
        for(String x:se){
            System.out.println(x);
        }
    }
}
