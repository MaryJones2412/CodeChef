public class Main {
    private static final int maxSize = 101;
    private static int[] a = new int[maxSize];
    private static int front = 0; // Index of the front element
    private static int rear = -1;  // Index of the rear element
    private static int currentSize;

    private static boolean isEmpty() {
        if(currentSize == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    private static boolean isFull() {
        if(currentSize == maxSize)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
     private static int size() {
        return maxSize;
    }
