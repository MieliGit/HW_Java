package OOP.HW_3;

import org.jetbrains.annotations.NotNull;

import java.util.Iterator;
import java.util.List;

public class Flow implements Iterable<Group> {
    private List<Group> groups;

    public Flow(List<Group> groups) {
        this.groups = groups;
    }

    public List<Group> getGroups() {
        return groups;
    }

    public void addGroup(Group group){
        groups.add(group);

    }

    @NotNull
    @Override
    public Iterator<Group> iterator() {
        return new FlowIterator(this);
    }
}
