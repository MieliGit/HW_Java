package OOP.HW_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FlowService {
    private Flow groups;

    public FlowService(Flow groups) {
        this.groups = groups;
    }

    public Flow getGroups() {
        return groups;
    }

    public List<Group> getSortedGroup(){
        List<Group> groupList = new ArrayList<>(Flow.getGroups());
        Collections.sort(groupList);
        return groupList;
    }

    public List<Group> getSortedGroupByWell(){
        List<Group> grouptList = new ArrayList<>(Flow.getGroups());
        grouptList.sort(new GroupComparator());
        return groupList;
    }
}
