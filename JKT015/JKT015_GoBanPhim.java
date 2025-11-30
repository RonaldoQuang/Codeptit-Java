package JKT015;

import java.util.*;

public class JKT015_GoBanPhim {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuilder w = new StringBuilder(); // thay cho string w
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == '<') {
                if (w.length() > 0) {
                    st.push(w.charAt(w.length() - 1));
                    w.deleteCharAt(w.length() - 1); // pop_back
                }
            } else if (c == '>') {
                if (!st.isEmpty()) {
                    w.append(st.peek());
                    st.pop();
                }
            } else if (c == '-') {
                if (w.length() > 0) {
                    w.deleteCharAt(w.length() - 1); // pop_back
                }
            } else {
                w.append(c);
            }
        }

        while (!st.isEmpty()) {
            w.append(st.pop());
        }

        System.out.println(w.toString());
    }
}
