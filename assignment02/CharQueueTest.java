package assignment02;

public class CharQueueTest {
    public static void main(String[] args){
        StringBuilder bldr = new StringBuilder();
        CharQueue set = new CharQueueImpl(bldr);
        set.enQueue('a');
        set.enQueue('b');
        set.enQueue('c');
        set.enQueue('d');
        set.enQueue('b');
        System.out.println(set.deQueue());
        System.out.println(set.isempty()); 
        System.out.println(set.remove('b')); 
        System.out.println(set.deQueue()); 
        System.out.println(set.deQueue());
        System.out.println(set.deQueue()); 
        System.out.println(set.deQueue());  
        System.out.println(set.isempty());
    }
    
}
