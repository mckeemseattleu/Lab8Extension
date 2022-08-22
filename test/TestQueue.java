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
}
