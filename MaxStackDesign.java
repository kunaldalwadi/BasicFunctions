import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class MaxStackDesign {

    private Stack<Integer> stack;
    private Stack<Integer> maxStack;

    public MaxStackDesign() {
        stack = new Stack<>();
        maxStack = new Stack<>();
    }


    public void push(int val) {
        if (maxStack.isEmpty()) {
            maxStack.push(val);
            stack.push(val);
        }
        else {
            stack.push(val);
            maxStack.push(Math.max(maxStack.peek(), val));
        }
    }

    public int pop() {
        maxStack.pop();
        return stack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int peekMax() {
        return maxStack.peek();
    }

    public int popMax() {

        int tempMax = peekMax();

        List<Integer> list = new ArrayList<Integer>();

        while(top() != tempMax)
        {
            list.add(pop());
        }

        int foundMax = pop();

        if(list.size() > 0)
        {

            for (int i = list.size() - 1; i >= 0; i--) {
                push(list.get(i));
            }
        }

        return foundMax;
    }

    public static void main(String[] args) {

    }
}
