import java.util.ArrayList;
public class first{
    public static void main(String[] args) {
        ArrayList<Integer>list = new ArrayList<>();
    // add an element to the list 
    list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);
    list.add(5);
    list.add(6);
    System.out.println("list :=: " + list);

    // remove an element from the list

    list.remove(1);
    list.remove(2);
    list.remove(3);
    System.out.println("after removing the element from the list " + list);

    // get an element from the list 

   int element =  list.get(0);
    int element1 = list.get(2);
   
System.out.print(element);    
System.out.print(element1);    

// set the value of the list 
        list.set(1, 10);
        list.set(2, 20);
        list.set(3, 30);
        System.out.println(list);

        // conatains element in the list

        System.out.println("list contains 10: " + list.contains(10));
        System.out.println("list contains 20: " + list.contains(200));
}
}