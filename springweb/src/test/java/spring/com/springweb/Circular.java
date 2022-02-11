package spring.com.springweb;

public class Circular {

    public static void main(String[] args) {
        CircularList cl = new CircularList();

        int index = 0;
        cl.addNode(new Node(6, 5, index++));
        cl.addNode(new Node(4, 6, index++));
        cl.addNode(new Node(4, 5, index++));
        cl.addNode(new Node(7, 3, index++));

        cl.traverseList();
        System.out.println(String.format("Head (%s, %s)", cl.head.petrolUnits, cl.head.distanceToNext));
        System.out.println(String.format("Tail (%s, %s)", cl.tail.petrolUnits, cl.tail.distanceToNext));

        int feasiblePathStartIndex = -1;

        do {
            feasiblePathStartIndex = findPath(cl);
            if (feasiblePathStartIndex != -1) {
                break;
            } else {
                System.out.println("No path from current Head to Tail");
                cl.tail = cl.head;
                cl.head = cl.head.nextNode;
                System.out.println("**************");
                System.out.println(String.format("new Head (%s, %s)", cl.head.petrolUnits, cl.head.distanceToNext));
                System.out.println(String.format("new Tail (%s, %s)", cl.tail.petrolUnits, cl.tail.distanceToNext));

                index--;
            }
        } while (index > 0);

        System.out.println(feasiblePathStartIndex);
        if (feasiblePathStartIndex != -1) {
            System.out.println("feasible path ->");
            cl.traverseList();
        }

    }

    private static int findPath(CircularList cl) {
        int petrolRemaining = 0;
        int distanceRemaining = 0;

        Node currentNode = cl.head;

        do {
            petrolRemaining += currentNode.petrolUnits;
            distanceRemaining += currentNode.distanceToNext;

            if (petrolRemaining < distanceRemaining) {
                // this starting point will not work.
                return -1;
            }

            petrolRemaining -= currentNode.distanceToNext;
            distanceRemaining -= currentNode.distanceToNext;

            currentNode = currentNode.nextNode;
        } while (currentNode != cl.head);
        return cl.head.index;
    }
}

class CircularList {
    Node head = null;
    Node tail = null;

    public void addNode(Node n) {

        if (head == null) {
            head = n;
        } else {
            tail.nextNode = n;
        }

        tail = n;
        tail.nextNode = head;
    }

    public void traverseList() {
        Node currentNode = head;

        if (head != null) {
            do {
                System.out.println(String.format("Node (%s, %s)", currentNode.petrolUnits, currentNode.distanceToNext));
                currentNode = currentNode.nextNode;
            } while (currentNode != head);
        }
    }
}

class Node {
    int petrolUnits;
    int distanceToNext;
    int index;

    Node nextNode;

    public Node(int petrolUnits, int distanceToNext, int index) {
        this.petrolUnits = petrolUnits;
        this.distanceToNext = distanceToNext;
        this.index = index;
    }
}