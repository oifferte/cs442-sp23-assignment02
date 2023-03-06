package assignment02;

public class CharSetTest {
    public static void main(String[] args){
        StringBuilder bldr = new StringBuilder();
        CharSet set = new CharSetImpl(bldr);
        System.out.println(set.addToSet('a')); 
        System.out.println(set.addToSet('b')); 
        System.out.println(set.addToSet('b')); 
        System.out.println(set.addToSet('c')); 
        System.out.println(set.sizeOfSet()); 
        System.out.println(set.setContains('a')); 
        System.out.println(set.deleteFromSet('b')); 
        System.out.println(set.setContains('b')); 
        System.out.println(set.deleteFromSet('t')); 
        System.out.println(set.sizeOfSet());
    }
    
}