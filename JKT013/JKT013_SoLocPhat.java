package JKT013;

import java.util.*;

public class JKT013_SoLocPhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        while(t-->0){
            int n=sc.nextInt();
            Queue<String> q=new LinkedList<>();
            ArrayList<String> v=new ArrayList<>();
            q.add("");
            while(true){
                if(q.peek().length()==n+1){
                    break;
                }
                else{
                    q.add(q.peek()+"6");
                    q.add(q.peek()+"8");
                    if(q.peek().length()<=n&&q.peek().length()>0) v.add(q.peek());
                    q.poll();
                }
            }
            System.out.println(v.size());
            for(int i=v.size()-1;i>=0;i--){
                System.out.print(v.get(i)+" ");
            }
            System.out.println();
        }
    }
}
