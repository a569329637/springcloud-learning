package com.gsq.learning;

import java.util.*;

public class Main15 {
    public static void main(String[] args) {
        String s = "a1-a2,a5-a6,a2-a3";
        String a = "a5,a3";

        Set<String> allNode = new HashSet<>();

        List<Node> list = new ArrayList<>();
        String[] strs = s.split(",");
        for (int i = 0; i < strs.length; ++ i) {
            String[] split = strs[i].split("-");
            Node node = findNode(list, split[1]);
            if (node == null) {
                node = new Node(split[1]);
                list.add(node);
            }
            node.getDeps().add(split[0]);

            allNode.add(split[0]);
            allNode.add(split[1]);
        }

        String[] errors = a.split(",");
        List<String> dealing = new ArrayList<>();
        for (int i = 0; i < errors.length; ++ i) {
            dealing.add(errors[i]);
        }

        List<String> dealed = new ArrayList<>();
        for (int i = 0; i < dealing.size(); ++ i) {
            String name = dealing.get(i);
            dealed.add(name);

            Node node = findNode(list, name);
            if (node != null) {
                for (String string : node.getDeps()) {
                    if (!dealed.contains(string)) {
                        dealing.add(string);
                    }
                }
            }
        }

        for (String name : dealed) {
            allNode.remove(name);
        }

        allNode.forEach(System.out::println);

    }

    public static Node findNode(List<Node> list, String name) {
        for (Node node: list) {
            if (Objects.equals(node.getName(), name)) {
                return node;
            }
        }
        return null;
    }
}

class Node {
    // a1-a2
    //   a2
    // a1
    private String name;//a2
    private List<String> deps; //a1

    public Node(String name) {
        this.name = name;
        this.deps = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getDeps() {
        return deps;
    }

    public void setDeps(List<String> deps) {
        this.deps = deps;
    }
}
