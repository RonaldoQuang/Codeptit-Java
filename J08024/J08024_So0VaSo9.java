package J08024;

import java.util.*;

public class J08024_So0VaSo9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        while(t-->0){
            int n=sc.nextInt();
            Queue<String> q=new LinkedList<>();
            q.add("9");
            while(Long.parseLong(q.peek())%n!=0){
                q.add(q.peek()+"0");
                q.add(q.peek()+"9");
                q.poll();
            }
            System.out.println(q.peek());
        }
    }
}
