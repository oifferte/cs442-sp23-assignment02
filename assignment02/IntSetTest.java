package assignment02;

public class IntSetTest {
    public static void main(String[] args){
        IntSet set = new IntSetImpl();
        System.out.println(set.addToSet(1)); 
        System.out.println(set.addToSet(2)); 
        System.out.println(set.addToSet(2)); 
        System.out.println(set.addToSet(3)); 
        System.out.println(set.sizeOfSet()); 
        System.out.println(set.setContains(2)); 
        System.out.println(set.deleteFromSet(2)); 
        System.out.println(set.setContains(2)); 
        System.out.println(set.deleteFromSet(2)); 
        System.out.println(set.sizeOfSet());
    }
    
}
