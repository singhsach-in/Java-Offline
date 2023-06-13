package Stack.Questions;

import java.util.Stack;

class BracketsCheck {
    static boolean ispar(String x) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < x.length(); i++) {
            if (st.empty()) {
                char ch = getRevBracket(x.charAt(i), true);
                if(ch == 'x') return false;
                st.push(x.charAt(i));
                continue;
            }
            char c = st.peek();
            char ch = getRevBracket(x.charAt(i), false);

            if (c == ch) {
                st.pop();
                continue;
            }
            st.push(x.charAt(i));

        }
        if (st.empty())
            return true;
        return false;

    }

    private static char getRevBracket(char c, Boolean flag) {
        if(flag == false) {
            if (c == ')')
            return '(';
            if (c == '}')
                return '{';
            if (c == ']')
                return '[';
        }
        if(flag == true && (c== ')' || c=='}' || c==']')) {
            return 'x';
        }
        return 0;
    }

    public static void main(String[] args) {
        // ispar("()");
        String str = "()[]";
        System.out.println(ispar(str));
    }
}
