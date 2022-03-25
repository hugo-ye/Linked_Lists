package com.company;

public class Main {

    public static void main(String[] args) {
        example2();
    }

    public static void example2() {
        Node head = new Node(5);
        head.add(-15);
        head.add(4);

        remove(head, 4);
        head.print();
    }

    static boolean find(Node node, int value) {
        if (node.value == value) {
            return true;

        } else if (node.next == null) {
            return false;
        }

        return (find(node.next, value));

    }

    static Node remove(Node head, int v) {
        if (head.value == v) {
            if (head.next == null) {
                return null;
            } else {
                head = head.next;
                return head;
            }
        } else {
            Node current = head;
            while (current.next != null) {
                if (current.next.value == v) {
                    current.next = current.next.next;
                    break;

                }
                current = current.next;
            }
            return head;
        }
    }

    static boolean findIter(Node node, int value) {
        Node current = node;
        while (current != null) {
            if (current.value == value) {
                return true;
            } else {
                current = current.next;
            }
        }
        return false;


    }

}


class Node {
    Node(int v) {
        value = v;
        next = null;
    }

    void add(int v) {
        if (next == null) next = new Node(v);
        else next.add(v);
    }

    void print() {
        System.out.print(value + " ");
        if (next != null) next.print();
    }

    int value;
    Node next; // pointer (reference) to next node

}
