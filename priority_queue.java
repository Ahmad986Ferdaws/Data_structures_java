import java.util.*;

public static void main(String[] args) {

  Queue<Double> queue = new PriorityQueue<>();
aaaa
   queue.add(1.0);
     queue.add(2.0);
        queue.add(3.0);
        queue.add(4.0);

 while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }
}
