package J02017;

import java.util.*;

public class J02017_ThuGonDaySo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //int t=sc.nextInt();
        //while(t-->0){
        int n=sc.nextInt(), ok=0;
        ArrayList<Integer> a=new ArrayList<>(n);
        for(int i=0;i<n;i++){
            int x=sc.nextInt();
            a.add(x);
        }
        int i=1;
        while(i<a.size()){
            if((a.get(i)+a.get(i-1))%2==0){
                a.remove(i);
                a.remove(i-1);
                if(i>1) i--;
            }
            else i++;
        }
        System.out.println(a.size());
        //}
    }
}
