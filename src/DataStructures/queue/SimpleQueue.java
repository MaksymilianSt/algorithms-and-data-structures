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
        if(size <= 0)
            throw new IndexOutOfBoundsException("there are no more elements ");
        T data = (T) queue[front++];
        size--;
        return data;
    }
    public void info(){
        for (int i = front; i <rear ; i++) {
            System.out.print(queue[i] + " , ");
        }
    }
    private void doubleQueueSize(){
       queue =  Arrays.copyOf(queue ,queue.length*2);
    }
}
