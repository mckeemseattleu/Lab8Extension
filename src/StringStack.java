public class StringStack
{

    private Node head;

    /**
     * The Node class is used to implement the linked list.
     * @author Mike McKee
     */
    private static class Node {
        /**
         * Holds user input of operand as a double.
         */
        public String data;

        /**
         * Points to next node in linked list.
         */
        public Node next;

        /**
         * The Node constructor initializes each instance of the Node class.
         * @param data  The double that is stored in Node
         * @param next  A pointer to the succeeding Node
         */
        public Node(String data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    /**
     * The Stack constructor initializes new instances of Stack objects.
     */
    public StringStack () {
        head = null;
    }

    /**
     * The push method adds an item to the top of the stack.
     * @param data The item that is to be added to top of stack
     */
    public void push(String data) {
        head  = new Node(data, head);
    }

    /**
     * The peek method returns the item currently at top of stack but does not
     * remove item from stack. peek throws an exception if it is called when
     * the stack is empty.
     * @return item at top of stack
     */
    public String peek() {
        if (empty())
            throw new IllegalArgumentException("Error: The stack is empty!");
        else
            return head.data;
    }

    /**
     * The pop method removes and returns the item at top of stack. If the
     * stack is empty, pop throws an exception.
     * @return item at top of stack
     */
    public String pop() {
        String data;    //holds item on top of stack

        data = peek();
        head = head.next;
        return data;
    }

    /**
     * The empty method returns true if stack is empty and false otherwise.
     * @return true if stack is empty and false otherwise
     */
    public boolean empty() {
        return head == null;
    }


    // I left on vacation , please code these

    public StringStack copy()
    {


        StringStack newStack = new StringStack();
        //
        newStack = reverseStack();
        newStack = newStack.reverseStack();

        return newStack;
    }

    public StringStack reverseStack()
    {
        StringStack newStack = new StringStack();
        //
        for (Node i = head; i != null; i = i.next)
            newStack.push(i.data);

        return newStack;
    }

    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        for (Node i = head; i != null; i = i.next) {
            sb.append(i.data);
            sb.append(";");
        }
        return sb.toString();
    }

}
