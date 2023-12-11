package OOP.HW_3;

import java.util.Iterator;
import java.util.List;

public class FlowIterator implements Iterator<Group> {
    private final List<Group> groups;
    private int counter;

    public FlowIterator(Flow flows) {
        this.groups = flows.getGroups();
        this.counter = 0;
    }

    @Override
    public boolean hasNext() {
        return counter <= groups.size() - 1;
    }

    @Override
    public Group next() {
        if(hasNext()){
            return groups.get(counter++);
        }
        return null;
    }

}
