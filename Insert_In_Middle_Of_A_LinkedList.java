import java.util.Scanner;

public class Main {
  static class Node {
    int data;
    Node next;

    Node() {
      // this.data = 100;
      // this.next = null;
    }

    Node(int x) {
      this.data = x;
      this.next = null;
    }
  }

  public static void check(Node temp) {
    if (temp == null)
      System.out.println("Empty");
    else
      System.out.println("Not Empty");
  }

  public static void showList(Node temp) {
    while (temp != null) {
      System.out.print(temp.data + "->");
      temp = temp.next;
    }
    System.out.println();
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Node temp = new Node(1);
    Node head = temp;
    int n = 2;
    while (n < 5) {
      Node x = new Node(n);
      temp.next = x;
      temp = temp.next;
      n++;
    }
    showList(head);
    int val = sc.nextInt();
    int pos = sc.nextInt();
    n = 0;
    temp = head;
    while (n < pos - 1) {
      temp = temp.next;
      n++;
    }
    Node nw = new Node(val);
    nw.next = temp.next;
    temp.next = nw;
    showList(head);
  }

}
