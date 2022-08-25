import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestQueue
{
    /**
     * This will test if the method is not empty for a String. Because three variables are loaded
     * in here, it should assert a False on it being empty
     */
    @Test
    void testQueueNotEmptyString()
    {
        Queue stringQue = new Queue();
        stringQue.enqueue("I");
        stringQue.enqueue("love");
        stringQue.enqueue("dogs");
        Assertions.assertFalse(stringQue.empty());
    }


    /**
     * This will test if the method is not empty for a String. Because three variables are loaded
     * in here, it should assert a False on it being empty
     */
    @Test
    void testReverseQueue()
    {
        Queue stringQue = new Queue();
        stringQue.enqueue("I");
        stringQue.enqueue("love");
        stringQue.enqueue("dogs");
        stringQue.reverseQueue();
        // should be dogs;love;i;
        String compString = stringQue.toString();
        Assertions.assertEquals(compString,"dogs;love;I;");
    }


    @Test
    void testReverseQueueException()
    {
        Queue stringQue = new Queue();
        stringQue.enqueue("I");
        stringQue.enqueue("love");
        stringQue.enqueue("dogs");
        Assertions.assertFalse(stringQue.empty());
        stringQue.reverseQueue();
        // should be dogs;love;i;
        String compString = stringQue.toString();
        Assertions.assertEquals(compString,"dogs;love;I;");
    }
}
