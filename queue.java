import java.util.Queue;
import java.util.LinkedList;

// in this part of the lesson we are going to learn the queue //
 // by the other words it means first serve first out like the way we do it with FIFO

// unlike the stack which we are using it for first in last out, it is directly the opposite of it

public class queue {a

    public static void main(String[]args){

 // Adds an element to the queue; throws an exception if full
//        add(E e);

 // Adds an element to the queue; returns false if full
//        offer(E e);

// Removes and returns the head; throws an exception if empty
//        remove();

// Removes and returns the head; returns null if empty
//        poll();

     // Retrieves the head without removing; throws an exception if empty
//        element();

     
     // Retrieves the head without removing; returns null if empty
//        peek();

// Returns the number of elements in the queue
//        size();


// Checks if the queue is empty

     // Removes all elements from the queue
//        clear();

     // Checks if the queue contains a specific element
//        contains(Object o);
//```
//        isEmpty();

  Queue<String> queue = new LinkedList<>();
        // but over here we cannot inniate a new Queue like we did in the Stack cause
        // queue is not a class rather an interface so we class that implements queue and
        // that will be linked lists

     
        queue.offer("a");
        queue.offer("b");
        queue.offer("c");

      System.out.println(queue);


        // we can ususally use the queues for like the buffer statements which are
        // as fast we write it will show the typed words like the first in and first out

    }
}

     
 
