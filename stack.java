
import java.util.Stack;

 public class Main {
     public static  void main(String[] args) {
 // we created declared the stack using the stack<string>
         Stack<String> stack = new Stack<String>();


        // with the ush item we can push the items
         // think of it as we are adding new clothes to the stack of the clothes
        stack.push("Battlefield");
         stack.push("Hitman 3");
         stack.push("resident evil");
      // here we use the pop method to remove  the item form our stack and the item that will be removed is
      // the item on the top or the most recent,
      // os it does mean that it stack the last in first out will be for removing and the first in last out.
       String favgame  = stack.pop();
         System.out.println(favgame);

            System.out.println(stack);

     }
}

// stacks have five unique items and charactiristics which are
// push item on the top of the stack
// we can pop item from top
// and we can peak from the top of the stack
