package exercise11;

public class Node {
    final String data;
    Node nextNode;

    public Node(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }

    public Node getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }
}