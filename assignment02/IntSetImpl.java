package assignment02;
import java.util.ArrayList;
import java.util.List;
public class IntSetImpl extends ArrayList<Integer> implements IntSet {
    private static final long serialVersionUID = 5465283085896313084L;
    private  List<Integer> list = new ArrayList<>();
    @Override
    public boolean addToSet(int e) {
        if (!list.contains(e)) {
            list.add(e);
            return true;
        }
        return false;
    } 
    @Override
    public boolean deleteFromSet(int e) {
        return list.remove(Integer.valueOf(e));
    } 
    @Override
    public boolean setContains(int e) {
        return list.contains(e);
    }
    @Override
    public int sizeOfSet() {
        return list.size();
    }
}
