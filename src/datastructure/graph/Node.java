package datastructure.graph;

import java.util.ArrayList;
import java.util.List;

public class Node {
    String data;
    List<Edge> adj;

    Node(String nome) {
        this.data = nome;
        this.adj = new ArrayList<>();
    }

    void addAdj(Edge e) {
        adj.add(e);
    }
}
