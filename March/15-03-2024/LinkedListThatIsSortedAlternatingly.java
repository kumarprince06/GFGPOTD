import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedListThatIsSortedAlternatingly {
    static void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        Node head = new Node(sc.nextInt());
        Node tail = head;

        for (int i = 1; i < n; i++) {
            tail.next = new Node(sc.nextInt());
            tail = tail.next;
        }
        Solution obj = new Solution();
        head = obj.sort(head);
        printList(head);

    }
}




/*
class Node {
    int data;
    Node next;
    
    public Node (int data){
        this.data = data;
        this.next = null;
    }
}
*/

class Solution {
    
    public Node sort(Node head){
         //your code here, return the head of the sorted list
         ArrayList<Integer> list = new ArrayList<>();
         for(Node temp = head; temp != null; temp = temp.next){
             list.add(temp.data);
         }
         Collections.sort(list);
         Node temp = head;
         for(int n : list){
             temp.data = n;
             temp = temp.next;
         }
         return head;
    }
 
 
 }