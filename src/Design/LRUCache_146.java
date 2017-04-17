package Design;

import java.util.HashMap;

/**
 * @Author RenXintao
 * @Date 4/6/17
 */
class LRUCache {
    private class Node {
        Node prev;
        Node next;
        int key;
        int value;

        public Node(int key, int value) {
            this.key = key;
            this.value = value;
            this.prev = null;
            this.next = null;
        }
    }

    private int capacity;
    private HashMap<Integer, Node> hsMap = new HashMap<Integer, Node>();
    private Node head = new Node(-1, -1);
    private Node tail = new Node(-1, -1);

    public LRUCache(int capacity) {
        this.capacity = capacity;
        head.next = tail;
        tail.prev = head;
    }

    public int get(int key) {
        if (!hsMap.containsKey(key)) {
            return -1;
        }

        // remove current
        Node current = hsMap.get(key);
        current.prev.next = current.next;
        current.next.prev = current.prev;

        // move current to tail
        move_to_tail(current);
        return current.value;
    }

    public void put(int key, int value) {
        if (get(key) != -1) {
            hsMap.get(key).value = value;
            return;
        }

        if (hsMap.size() == capacity) {
            hsMap.remove(head.next.key);
            head.next = head.next.next;
            head.next.prev = head;
        }

        Node insert = new Node(key, value);
        hsMap.put(key, insert);
        move_to_tail(insert);
    }

    private void move_to_tail(Node current) {
        current.prev = tail.prev;
        current.next = tail;
        tail.prev = current;
        current.prev.next = current;
    }
}
public class LRUCache_146 {
    public static void main(String[] args) {
        LRUCache obj = new LRUCache(3);
        obj.put(1,1);
        obj.put(2,2);

        int param_1 = obj.get(1);
    }

}
