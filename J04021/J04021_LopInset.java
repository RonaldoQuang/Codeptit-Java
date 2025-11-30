package J04021;

import java.util.*;

class IntSet{
    private int[] a;
    public IntSet(int[] a){
        this.a=a;
    }
    public IntSet union(IntSet s2){
        Set<Integer> se=new TreeSet<>();
        for(int i=0;i<this.a.length;i++){
            se.add(this.a[i]);
        }
        for(int i=0;i<s2.a.length;i++){
            se.add(s2.a[i]);
        }
        int[] x=new int[se.size()];
        int cnt=0;
        for(int i:se){
            x[cnt]=i;
            ++cnt;
        }
        IntSet c=new IntSet(x);
        return c;
    }
    @Override
    public String toString(){
        String res="";
        for(int i=0;i<a.length;i++) {
            res +=a[i]+" ";
        }
        return res.trim();
    }
}

public class J04021_LopInset {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt(), a[] = new int[n], b[] = new int[m];
        for(int i = 0; i<n; i++) a[i] = sc.nextInt();
        for(int i = 0; i<m; i++) b[i] = sc.nextInt();
        IntSet s1 = new IntSet(a);
        IntSet s2 = new IntSet(b);
        IntSet s3 = s1.union(s2);
        System.out.println(s3);
    }
}
