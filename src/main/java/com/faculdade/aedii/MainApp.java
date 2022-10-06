package com.faculdade.aedii;

import java.util.List;

public class MainApp {

    public static void main(String[] args) {

        Node<String> node0 = new Node<>("0");
        Node<String> node1 = new Node<>("1");
        Node<String> node2 = new Node<>("2");
        Node<String> node3 = new Node<>("3");
        Node<String> node4 = new Node<>("4");
        Node<String> node5 = new Node<>("5");
        Node<String> node6 = new Node<>("6");
        Node<String> node7 = new Node<>("7");
        Node<String> node8 = new Node<>("8");
        Node<String> node9 = new Node<>("9");
        Node<String> node10 = new Node<>("10");
        Node<String> node11 = new Node<>("11");
        Node<String> node12 = new Node<>("12");
        Node<String> node13 = new Node<>("13");
        Node<String> node14 = new Node<>("14");
        Node<String> node15 = new Node<>("15");
        Node<String> node16 = new Node<>("16");
        Node<String> node17 = new Node<>("17");
        Node<String> node18 = new Node<>("18");
        Node<String> node19 = new Node<>("19");
        Node<String> node20 = new Node<>("20");
        Node<String> node21 = new Node<>("21");
        Node<String> node22 = new Node<>("22");
        Node<String> node23 = new Node<>("23");
        Node<String> node24 = new Node<>("24");
        Node<String> node25 = new Node<>("25");
        Node<String> node26 = new Node<>("26");
        Node<String> node27 = new Node<>("27");
        Node<String> node29 = new Node<>("29");
        Node<String> node30 = new Node<>("30");
        Node<String> node31 = new Node<>("31");
        Node<String> node32 = new Node<>("32");
        Node<String> node33 = new Node<>("33");
        Node<String> node34= new Node<>("34");
        Node<String> node35 = new Node<>("35");
        Node<String> node36 = new Node<>("36");
        Node<String> node37 = new Node<>("37");
        Node<String> node38 = new Node<>("38");
        Node<String> node39 = new Node<>("39");
        Node<String> node40 = new Node<>("40");
        Node<String> node41 = new Node<>("41");
        Node<String> node42 = new Node<>("42");
        Node<String> node43 = new Node<>("43");
        Node<String> node44 = new Node<>("44");
        Node<String> node45 = new Node<>("45");
        Node<String> node46 = new Node<>("46");

        node0.addAdjacentNode(node1, 4);
        node0.addAdjacentNode(node5, 5);

        node1.addAdjacentNode(node0, 4);
        node1.addAdjacentNode(node6, 5);
        node1.addAdjacentNode(node2, 6);

        node2.addAdjacentNode(node1, 6);
        node2.addAdjacentNode(node7, 4);
        node2.addAdjacentNode(node18, 2);

        node3.addAdjacentNode(node18, 9);
        node3.addAdjacentNode(node10, 7);
        node3.addAdjacentNode(node4, 7);

        node4.addAdjacentNode(node3, 7);
        node4.addAdjacentNode(node11, 5);

        node5.addAdjacentNode(node0, 5);
        node5.addAdjacentNode(node6, 8);
        node5.addAdjacentNode(node12, 2);

        node6.addAdjacentNode(node1, 5);
        node6.addAdjacentNode(node5, 8);
        node6.addAdjacentNode(node8, 4);

        node7.addAdjacentNode(node2, 4);
        node7.addAdjacentNode(node15, 7);
        node7.addAdjacentNode(node8, 5);
        node7.addAdjacentNode(node45, 6);

        node8.addAdjacentNode(node6, 4);
        node8.addAdjacentNode(node14, 5);
        node8.addAdjacentNode(node7, 5);

        node9.addAdjacentNode(node45, 7);
        node9.addAdjacentNode(node18, 8);
        node9.addAdjacentNode(node10, 4);
        node9.addAdjacentNode(node19, 10);

        node10.addAdjacentNode(node3, 7);
        node10.addAdjacentNode(node9, 4);
        node10.addAdjacentNode(node19, 9);
        node10.addAdjacentNode(node11, 5);

        node11.addAdjacentNode(node4, 5);
        node11.addAdjacentNode(node10, 5);
        node11.addAdjacentNode(node20, 8);

        node12.addAdjacentNode(node5, 2);
        node12.addAdjacentNode(node13, 1);
        node12.addAdjacentNode(node21, 12);

        node13.addAdjacentNode(node12, 1);
        node13.addAdjacentNode(node14, 1);

        node14.addAdjacentNode(node8, 5);
        node14.addAdjacentNode(node15, 4);
        node14.addAdjacentNode(node13, 1);

        node15.addAdjacentNode(node7, 7);
        node15.addAdjacentNode(node14, 4);
        node15.addAdjacentNode(node16, 9);
        node15.addAdjacentNode(node22, 8);

        node16.addAdjacentNode(node15, 9);
        node16.addAdjacentNode(node46, 3);
        node16.addAdjacentNode(node24, 7);

        node17.addAdjacentNode(node46, 13);
        node17.addAdjacentNode(node19, 7);
        node17.addAdjacentNode(node33, 10);
        node17.addAdjacentNode(node24, 8);

        node18.addAdjacentNode(node2, 2);
        node18.addAdjacentNode(node3, 9);
        node18.addAdjacentNode(node9, 8);

        node19.addAdjacentNode(node20, 7);
        node19.addAdjacentNode(node34, 14);
        node19.addAdjacentNode(node10, 9);
        node19.addAdjacentNode(node9, 10);
        node19.addAdjacentNode(node17, 7);

        node20.addAdjacentNode(node11, 8);
        node20.addAdjacentNode(node19, 7);
        node20.addAdjacentNode(node34, 10);

        node21.addAdjacentNode(node25, 7);
        node21.addAdjacentNode(node12, 12);
        node21.addAdjacentNode(node22, 3);

        node22.addAdjacentNode(node21, 3);
        node22.addAdjacentNode(node15, 8);
        node22.addAdjacentNode(node23, 2);
        node22.addAdjacentNode(node25, 4);

        node23.addAdjacentNode(node22, 2);
        node23.addAdjacentNode(node24, 4);

        node24.addAdjacentNode(node16, 7);
        node24.addAdjacentNode(node23, 4);
        node24.addAdjacentNode(node26, 3);
        node24.addAdjacentNode(node17, 8);

        node25.addAdjacentNode(node21, 7);
        node25.addAdjacentNode(node38, 14);
        node25.addAdjacentNode(node22, 4);

        node26.addAdjacentNode(node24, 3);
        node26.addAdjacentNode(node31, 10);
        node26.addAdjacentNode(node27, 3);

        node27.addAdjacentNode(node26, 3);
        node27.addAdjacentNode(node29, 11);
        node27.addAdjacentNode(node41, 6);

        node29.addAdjacentNode(node32, 5);
        node29.addAdjacentNode(node30, 4);
        node29.addAdjacentNode(node43, 8);
        node29.addAdjacentNode(node27, 11);

        node30.addAdjacentNode(node37, 4);
        node30.addAdjacentNode(node42, 8);
        node30.addAdjacentNode(node29, 4);

        node31.addAdjacentNode(node33, 3);
        node31.addAdjacentNode(node32, 2);
        node31.addAdjacentNode(node26, 11);

        node32.addAdjacentNode(node31, 2);
        node32.addAdjacentNode(node29, 5);
        node32.addAdjacentNode(node37, 6);

        node33.addAdjacentNode(node31, 3);
        node33.addAdjacentNode(node17, 10);
        node33.addAdjacentNode(node36, 8);

        node34.addAdjacentNode(node20, 10);
        node34.addAdjacentNode(node35, 5);
        node34.addAdjacentNode(node36, 3);
        node34.addAdjacentNode(node19, 14);

        node35.addAdjacentNode(node44, 13);
        node35.addAdjacentNode(node37, 4);
        node35.addAdjacentNode(node34, 5);

        node36.addAdjacentNode(node34, 3);
        node36.addAdjacentNode(node35, 4);
        node36.addAdjacentNode(node37, 1);
        node36.addAdjacentNode(node33, 8);

        node37.addAdjacentNode(node36, 1);
        node37.addAdjacentNode(node30, 4);
        node37.addAdjacentNode(node32, 6);

        node38.addAdjacentNode(node25, 14);
        node38.addAdjacentNode(node39, 11);
        node38.addAdjacentNode(node41, 3);

        node39.addAdjacentNode(node38, 11);
        node39.addAdjacentNode(node40, 7);
        node39.addAdjacentNode(node42, 6);

        node40.addAdjacentNode(node39, 7);
        node40.addAdjacentNode(node44, 7);

        node41.addAdjacentNode(node43, 4);
        node41.addAdjacentNode(node38, 3);
        node41.addAdjacentNode(node27, 6);

        node42.addAdjacentNode(node43, 5);
        node42.addAdjacentNode(node39, 6);
        node42.addAdjacentNode(node44, 6);
        node42.addAdjacentNode(node30, 8);

        node43.addAdjacentNode(node42, 5);
        node43.addAdjacentNode(node29, 8);
        node43.addAdjacentNode(node41, 4);

        node44.addAdjacentNode(node40, 7);
        node44.addAdjacentNode(node42, 6);
        node44.addAdjacentNode(node35, 13);

        node45.addAdjacentNode(node7, 6);
        node45.addAdjacentNode(node9, 7);
        node45.addAdjacentNode(node46, 2);

        node46.addAdjacentNode(node45, 2);
        node46.addAdjacentNode(node17, 13);
        node46.addAdjacentNode(node16, 3);

        Dijkstra<String> dijkstra = new Dijkstra<>();
        dijkstra.calculateShortestPath(node12);
        dijkstra.printPaths(List.of(node20));

    }

}
