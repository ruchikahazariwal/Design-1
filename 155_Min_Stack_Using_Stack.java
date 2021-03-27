class MinStack {

    /** initialize your data structure here. */
    Stack<Integer> s;
    Stack<Integer> minStack;
    public MinStack() {
        s = new Stack<>();
        minStack = new Stack<>();
        minStack.push(Integer.MAX_VALUE);
    }
    
    public void push(int val) {
        s.push(val);
        minStack.push(Math.min(minStack.peek(), val));
    }
    
    public void pop() {
        s.pop();
        minStack.pop();
    }
    
    public int top() {
        return s.peek();
    }
    
    public int getMin() {
        return minStack.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */

/* 
TC => 
Push = O(1)
Pop = O(1)
Peek = O(1)
GetMin = O(1)
*/
