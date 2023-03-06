package assignment02;

public class CharSetImpl implements CharSet {
    private StringBuilder bldr;
    public CharSetImpl(StringBuilder builderIn){
        bldr = builderIn;
    }
    @Override
    public boolean addToSet(char e) {
        if(bldr.indexOf(Character.toString(e)) == -1){
            bldr.append(e);
            return true;
        }
        return false;
    }
    @Override
    public boolean deleteFromSet(char e) {
        int pos = bldr.indexOf(Character.toString(e));
        if(pos >= 0){
            bldr.deleteCharAt(pos);
            return true;
        }
        return false;
    }
    @Override
    public boolean setContains(char e) {
        if(bldr.indexOf(Character.toString(e)) == -1){
            return false;
        }
        return true;
    }
    @Override
    public int sizeOfSet() {
        return bldr.length();
    }
}
