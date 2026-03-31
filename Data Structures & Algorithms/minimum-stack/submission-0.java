class MinStack {
    
    Stack<Integer>mainStack;
    Stack<Integer>minStack;
   
    public MinStack() {
       mainStack=new Stack<>();
       minStack=new Stack<>();
    }
    
    public void push(int val) {
        mainStack.push(val);
       if(minStack.isEmpty() || val<=minStack.peek()){
            minStack.push(val);
       }
    }
    
    public void pop() {
        if(mainStack.peek().equals(minStack.peek())){
            minStack.pop();
        }
        mainStack.pop();
        
    }
    
    public int top() {
        int nums=mainStack.peek();
        return nums;
    }
    
    public int getMin() {
        int mini=minStack.peek();
        return mini;
    }
}
