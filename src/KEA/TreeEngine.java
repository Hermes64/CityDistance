package KEA;

public class TreeEngine {

    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();

        binaryTree.addNode(129, "Aarhus");
        binaryTree.addNode(170, "aalborg");
        binaryTree.addNode(160, "Aabenrå");
        binaryTree.addNode(95, "Viborg");
        binaryTree.addNode(102, "Vejle");
        binaryTree.addNode(149, "Tønder");
        binaryTree.addNode(119, "Thisted");
        binaryTree.addNode(274, "Skagen");
        binaryTree.addNode(86, "Silkeborg");
        binaryTree.addNode(135, "Randers");
        binaryTree.addNode(340, "København");
        binaryTree.addNode(116, "Kolding");
        binaryTree.addNode(42, "Holstebro");
        binaryTree.addNode(239, "Hirtshals");
        binaryTree.addNode(46, "Herning");
        binaryTree.addNode(139, "Hanstholm");
        binaryTree.addNode(144, "Haderslev");
        binaryTree.addNode(190, "Grenaa");
        binaryTree.addNode(210, "Fynshav Ferry Habour");
        binaryTree.addNode(182, "Padborg, Border");
        binaryTree.addNode(234, "Frederikshavn");
        binaryTree.addNode(125, "Fredericia");
        binaryTree.addNode(81, "Esbjerg");
        binaryTree.addNode(181, "Ebeltoft Ferry Harbour");
        binaryTree.addNode(80, "Billund Airport");

        binaryTree.inOrderTraverseTree(binaryTree.root);
//        binaryTree.preorderTraverseTree(binaryTree.root);
//        binaryTree.postOrderTraverseTree(binaryTree.root);


    }
}
