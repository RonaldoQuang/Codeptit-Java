package J02009;

import java.util.*;

class Guest implements Comparable<Guest> {
    private int t, d;
    public Guest(int t, int d){
        this.t=t;
        this.d=d;
    }
    public int getT(){
        return t;
    }
    public int getD() {
        return d;
    }
    @Override
    public int compareTo(Guest a){
        return this.t-a.t;
    }
}

public class J02009_XepHang {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<Guest> a=new ArrayList<>();
        int n=sc.nextInt();
        while(n-->0){
            int x= sc.nextInt(), y=sc.nextInt();
            a.add(new Guest(x,y));
        }
        Collections.sort(a);
        int t=0;
        for(Guest x:a){
            if(t>x.getT()) t+=x.getD();
            else t=x.getT()+x.getD();
        }
        System.out.println(t);
    }
}