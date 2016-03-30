/**
 * Created by Magdalena Polak on 22.03.2016.
 */
public class Main
{
    public static void main (String [] args) {


        DynamicTableStack d = new DynamicTableStack(10);
        d.printStack();
        d.push(10);
        d.printStack();
        d.push(100);
        d.printStack();
        d.push(101);
        d.printStack();
        d.push(1011);
        d.printStack();
        d.push(1111);
        d.printStack();
        System.out.println("Po dodaniu elementu: 1111");
        d.printStackClear();
        System.out.println("Zdejmuje element:: " +d.pop());
        System.out.println("Element na szczycie obecnie: " + d.peek());
        d.pop();
        //d.printStackClear();



        Student s  = new Student("Anna ", "Kowalska", 712, 9);
        Student s1 = new Student ("Piotr", "Nowak", 171, 8);
        Student s2 = new Student ("Brian", "Jaczynski", 173, 7);
        Student s3 = new Student ("Mariola", "Wojcik", 174, 6);
        Student s4 = new Student ("Tomasz", "Nikt", 175, 56);
        SinglyLinkedListStack ls = new SinglyLinkedListStack();
        ls.push(s);
        System.out.println(ls.peek());
        ls.push(s1);
        System.out.println(ls.peek());
        ls.push(s2);
        System.out.println(ls.peek());
        ls.push(s3);
        System.out.println(ls.peek());
        ls.push(s4);

        System.out.println(ls.peek());
        System.out.println("Zdjety: " + ls.pop());
        System.out.println(ls.peek());
       // ls.clear();




    }

}
