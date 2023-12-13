package OOP.HW_3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Group group1 = new Group(1, 30, 1);
        Group group2 = new Group(2, 28, 1);
        Group group3 = new Group(3, 29, 1);
        Group group4 = new Group(4, 25, 1);

        List<Group> groups = new ArrayList<>();
        groups.add(group1);
        groups.add(group2);
        groups.add(group3);
        groups.add(group4);
        Flow flow = new Flow(groups);
        for (Group group: flow) {
            System.out.println(group);
        }
//        FlowIterator flowIterator = new FlowIterator(flow);
//
//        while (flowIterator.hasNext()){
//            System.out.println(flowIterator.next());
//        }
    }
}