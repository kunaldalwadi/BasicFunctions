import java.util.Stack;

public class ParenthesisCompare {

    public static void main(String[] args) {

    }

    public boolean isValid(String s) {

        if (s.length() == 0)
        {
            return true;
        }

        if (s.length() == 1)
        {
            return false;
        }

        if (s.length()%2 != 0)
        {
            return false;
        }

        if (s.charAt(0) == ')' || s.charAt(0) == '}' || s.charAt(0) == ']')
        {
            return false;
        }

        Stack<Character> characterStack = new Stack<>();

        for (int i=0; i<s.length(); i++)
        {
            char c = s.charAt(i);
            //if the opposite of the current charAt(i) exist in the top of stack remove it.
                //to check whether the opposite of the current exists or not
                //we need to have a map which can be made two ways which will tell us what is the opposite of what.
            // else add it.

            if(c == '}'|| c == ')' || c == ']')
            {
                if (characterStack.empty()) return false;
                if(c == '}' && characterStack.peek() != '{') return false;
                if(c == ')' && characterStack.peek() != '(') return false;
                if(c == ']' && characterStack.peek() != '[') return false;
                characterStack.pop();

            } else {
                characterStack.push(c);
            }
        }

        return characterStack.empty();
    }
}
