
import java.util.LinkedList;

////////////////////////////////////////////////////

// in this part we will be studying the linked lists which are different that arrays so lets deep dive into the
// easy comparison between a normal array list and the linked lists
//  1-  in array list we can change the element by shifting so it will be very hard if we wanted the element one with
// the element 1 million.
// 2- but in this case linked lists are more beneficiary cause the linked lists have their own specific nodes connected
// with the element.


public class linked_lists {
    public static void main(String[]args){

    LinkedList<String> lik_ist = new LinkedList<String>();
//add: Add a new node (start, end, or specific position).

     lik_ist.add("Hello");
    lik_ist.add("World");
    lik_ist.add("Java");
    lik_ist.add("Python");
    lik_ist.add("C");

         LinkedList<String> new_lik = lik_ist;
    System.out.println(new_lik);

//Delete: Remove a node (start, end, or specific position).

    //Delete: Remove a node (start, end, or specific position).

     lik_ist.removeFirst();
        lik_ist.removeLast();
lik_ist.remove(1);

//Search: Find a node with a specific value.
 lik_ist.lastIndexOf("no where to go");
//        Traverse: Visit each node in the list sequentially.
        //                Reverse: Change the order of nodes in the list.

        
     System.out.println(lik_ist);
        System.out.println(lik_ist.indexOf("C"));
        System.out.println(lik_ist.peekFirst());
        System.out.println(lik_ist.peekLast());
        lik_ist.addFirst("e");
        lik_ist.addLast("d");

    }
}

// in this part of the applcaition that we will be using the wat the way, so like for example if i wanna do somehing really 


        

