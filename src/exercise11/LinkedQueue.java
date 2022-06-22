package exercise11;

public class LinkedQueue {
    private Node frontNode;
    private Node backNode;

    public boolean isEmpty() {
        if (frontNode == null) {
            return true;
        } else {
            return false;
        }

    }

    public void offer(String data) {
        Node currentNode = new Node(data);

        if (isEmpty()){
            frontNode = backNode = currentNode;
        } else{
            backNode.setNextNode(currentNode);
            backNode = currentNode;
        }
    }

    public String poll() {
        String data = "";
        if (isEmpty()){
            return null;
        } else{
            data = frontNode.getData();
            frontNode = frontNode.getNextNode();
        }
        return data;
    }

    @Override
    public String toString() {
        return NodeUtils.createNodeTraversalString(frontNode);
    }
}
