import java.util.HashMap;

class LRUCache {
    class Node {
        int key;
        int val;
        Node next;
        Node prev;
        Node(int key, int val) {
            this.key = key;
            this.val = val;
            prev = next = null;
        }
    }
    Node head = new Node(-1, -1);
    Node tail = new Node(-1, -1);
    HashMap<Integer, Node> map = new HashMap<>();
    int limit;
    public void add(Node newnode) {
        Node oldnode = head.next;
        head.next = newnode;
        newnode.prev = head;
        newnode.next = oldnode;
        oldnode.prev = newnode;
    }
    public void delete(Node oldnode) {
        Node oldprev = oldnode.prev;
        Node oldnext = oldnode.next;
        oldprev.next = oldnext;
        oldnext.prev = oldprev;
    }
    public LRUCache(int capacity) {
        limit = capacity;
        head.next = tail;
        tail.prev = head;
    }
    public int get(int key) {
        if (map.get(key) == null) {
            return -1;
        }
        Node node = map.get(key);
        delete(node);
        add(node);
        return node.val;
    }
    public void put(int key, int value) {
        Node oldnode = map.get(key);
        if (oldnode != null) {
            oldnode.val = value;
            delete(oldnode);
            add(oldnode);
            return;
        }
        Node newnode = new Node(key, value);
        if (map.size() == limit) {
            Node lru = tail.prev;
            delete(lru);
            map.remove(lru.key);
        }
        add(newnode);
        map.put(key, newnode);
    }
}