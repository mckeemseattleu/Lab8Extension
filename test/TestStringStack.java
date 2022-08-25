import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestStringStack
{
    @Test
    void testCopy()
    {
        StringStack testStack = new StringStack();
        testStack.push("I");
        testStack.push("love");
        testStack.push("dogs");
        StringStack newStack = testStack.copy();
        Assertions.assertTrue(!testStack.empty());
        System.out.println(testStack);
        System.out.println(newStack);
    }

    @Test
    void testReverseStack()
    {
        StringStack testStack = new StringStack();
        testStack.push("I");
        testStack.push("love");
        testStack.push("dogs");
        StringStack newStack = testStack.reverseStack();
        Assertions.assertTrue(!testStack.empty());
        System.out.println(testStack);
        System.out.println(newStack);
    }


}
