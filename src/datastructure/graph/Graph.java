package datastructure.graph;

import java.util.ArrayList;
import java.util.List;

public class Graph {
    private List<Node> nodes;
    private List<Edge> edges;

    public Graph() {
        nodes = new ArrayList<>();
        edges = new ArrayList<>();
    }

    public Node addNode(String data) {
        Node node = new Node(data);
        nodes.add(node);
        return node;
    }

    public Edge addEdge(Node origin, Node destination) {
        Edge e = new Edge(origin, destination);
        origin.addAdj(e);
        edges.add(e);
        return e;
    }

    public String toString() {
        String r = "";
        for (Node n : nodes) {
            r += n.data + " -> ";
            for (Edge e : n.adj) {
                Node v = e.destination;
                r += v.data + ", ";
            }
            r += "\n";
        }
        return r;
    }

    public static void main(String[] args) {
        Graph g = new Graph();
        Node s = g.addNode("s");
        Node t = g.addNode("t");
        Node y = g.addNode("y");
        Edge st = g.addEdge(s, t);
        Edge sy = g.addEdge(s, y);
        Edge ty = g.addEdge(t, y);
        Edge yt = g.addEdge(y, t);
        System.out.println(g);
    }

}

