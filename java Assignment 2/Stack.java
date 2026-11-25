public class Stack {
    private Node top; 
    private int size;   

    
    public static final int EMPTY = Integer.MIN_VALUE;

    public Stack() {
        top = null;
        size = 0;
    }

    /** Insert an element at the top. O(1) */
    public void push(int data) {
        Node newNode = new Node(data);
        newNode.next = top;   
        top = newNode;        
        size++;
        System.out.println(data + " inserted");
    }

    /** Remove and return the top element. O(1) */
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return EMPTY;
        }
        int value = top.data;
        top = top.next;       
        size--;
        System.out.println(value + " removed");
        return value;
    }

    /** Return the top element without removing it. O(1) */
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return EMPTY;
        }
        return top.data;
    }

    /** Check whether the stack is empty. O(1) */
    public boolean isEmpty() {
        return top == null;
    }

    /** Number of elements in the stack. O(1) */
    public int size() {
        return size;
    }

    /** Print elements from top to bottom. O(n) */
    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }
        Node temp = top;
        while (temp != null) {
            System.out.print(temp.data);
            if (temp.next != null) System.out.print(" -> ");
            temp = temp.next;
        }
        System.out.println();
    }

    /**
     Challenge 4
     */
    public int middle() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return EMPTY;
        }
        Node slow = top, fast = top;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;         
            fast = fast.next.next;    
        }
        return slow.data;
    }
}