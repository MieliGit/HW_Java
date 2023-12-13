package OOP.HW_3;
import java.util.Comparator;
public class StreamComparator {
    @Override
    public int compare(Group o1, Group o2) {
        int resultOfComparing = o1.getQuanStudent().compareTo(o2.getQuanStudent());
        if (resultOfComparing == 0) {
            resultOfComparing = o1.getWellGroup().compareTo(o2.getWellGroup());
        } else {
            return resultOfComparing;
        }
    }
}
