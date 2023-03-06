package assignment02;
public class CharQueueImpl implements CharQueue {
    private StringBuilder bldr;
    public CharQueueImpl(StringBuilder builderIn){
        bldr = builderIn;
    }
    @Override
    public char deQueue(){
        if(bldr.length() == 0){
            return (char)0;
        }
        char c = bldr.charAt(0);
        bldr.deleteCharAt(0);
        return c;
        
    }
    @Override
    public void enQueue(char c){
        bldr.append(c);
    }
    @Override
    public boolean isempty(){
        if(bldr.length() == 0){
            return true;
        }
        return false;
    }
    @Override
    public boolean remove(char c){
        int pos = bldr.indexOf(Character.toString(c));
        if(pos >= 0){
            bldr.deleteCharAt(pos);
            return true;
        }
        return false;
    }
}
