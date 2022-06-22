package exercise11;



public class LinkedStack {
    private Node topNode;



    public boolean isEmpty() {
        if(topNode == null) {
            return true;
        } else
        return false;
    }

    public void push(String data) {
        Node currentNode = new Node(data);

        if(isEmpty()){
            topNode = currentNode;
        } else {
            currentNode.setNextNode(topNode);
            topNode = currentNode;
        }




    }

    public String pop() {
        String data = "";
        if(isEmpty()){
            return "null";
        } else {
            Node currentNode=this.topNode.getNextNode();
            data = this.topNode.getData();
            this.topNode=currentNode;
            this.topNode.setNextNode(currentNode.getNextNode());
        }
        return data;
    }

    @Override
    public String toString() {
        return NodeUtils.createNodeTraversalString(topNode);
    }
}
