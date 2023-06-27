package DataStructures.queue;

import java.util.Arrays;

public class SimpleQueue <T> {
   private Object [] queue = new Object[5];
   private int size;
   private int front;
   private int rear;
    public void enQueue(T data){
        if(size == queue.length)
            doubleQueueSize();
        queue[rear++] = data;
        size++;

    }
    public T deQueue(){
        T data = (T) queue[front++];
        size--;
        return data;
    }
    private void doubleQueueSize(){
       queue =  Arrays.copyOf(queue ,queue.length*2);
    }
}
