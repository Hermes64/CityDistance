package KEA;

public class TreeEngine {

    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();

        binaryTree.addNode(118, "aalborg");
        binaryTree.addNode(154, "Aabenrå");
        binaryTree.addNode(61, "Viborg");
        binaryTree.addNode(71, "Vejle");
        binaryTree.addNode(178, "Tønder");
        binaryTree.addNode(148, "Thisted");
        binaryTree.addNode(222, "Skagen");
        binaryTree.addNode(43, "Silkeborg");
        binaryTree.addNode(129, "Ringkøbing");
        binaryTree.addNode(39, "Randers");
        binaryTree.addNode(308, "København");
        binaryTree.addNode(98, "Kolding");
        binaryTree.addNode(109, "Holstebro");
        binaryTree.addNode(187, "Hirtshals");
        binaryTree.addNode(83, "Herning");
        binaryTree.addNode(175, "Hanstholm");
        binaryTree.addNode(129, "Haderslev");
        binaryTree.addNode(64, "Grenaa");
        binaryTree.addNode(204, "Fynshav Ferry Habour");
        binaryTree.addNode(180, "Padborg, Border");
        binaryTree.addNode(182, "Frederikshavn");
        binaryTree.addNode(93, "Fredericia");
        binaryTree.addNode(167, "Esbjerg");
        binaryTree.addNode(54, "Ebeltoft Ferry Harbour");
        binaryTree.addNode(101, "Billund Airport");

        binaryTree.inOrderTraverseTree(binaryTree.root);


    }
}
