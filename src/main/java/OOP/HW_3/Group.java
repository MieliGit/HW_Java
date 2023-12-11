package OOP.HW_3;
public class Group {
    private int groupId;
    private int quanStudent;

    private int wellGroup;

    public Group(int groupId, int quanStudent, int wellGroup) {
        this.groupId = groupId;
        this.quanStudent = quanStudent;
        this.wellGroup = wellGroup;
    }

    public int getGroupId() {
        return groupId;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }

    public int getQuanStudent() {
        return quanStudent;
    }

    public void setQuanStudent(int quanStudent) {
        this.quanStudent = quanStudent;
    }

    public int getWellGroup() {
        return wellGroup;
    }

    public void setWellGroup(int wellGroup) {
        this.wellGroup = wellGroup;
    }

    @Override
    public String toString() {
        return "Group{" +
                "groupId=" + groupId +
                ", quanStudent=" + quanStudent +
                ", wellGroup=" + wellGroup +
                '}';
    }
}