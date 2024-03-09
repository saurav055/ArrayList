import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Array List Implementation and working");

        // create an Array List
        ArrayList<String> vehicle= new ArrayList<>();

        //to add an element in ArrayList
        vehicle.add("volvo");
        vehicle.add("toyota");

        //to check size of an arraylist
        System.out.println( vehicle.size());

        //to print ArrayList
            System.out.println(vehicle);

//to clear the element in an array list
        vehicle.remove("toyota");
        vehicle.add("mercedes");
        try {


            vehicle.remove(10);
        }
        catch(Exception e)
        {
            e.toString();

        }
        System.out.println(vehicle);
    }
}