package KEA;

public class Node {

    int distance;
    String city;

    Node leftChild;
    Node rightChild;

    public Node(int distance, String city) {
        this.distance = distance;
        this.city = city;
            }

            public String toString(){

        return city + " has a distance of " + distance + " kilometers from Ringkøbing.";
            }
}
