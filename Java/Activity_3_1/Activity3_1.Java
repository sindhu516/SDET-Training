package JavaActivity3_1;

import java.util.ArrayList;

public class Activity3_1 {
	  public static void main(String[] args) {
	    ArrayList<String> names = new ArrayList<String>();
	    names.add("satya");
	    names.add("sindhu");
	    names.add("bhanu");
	    names.add("sanjy");
	    names.add("srini");
	    System.out.println(names);
	    System.out.println("3rd name is: " + names.get(2));
	    boolean sin = names.contains("bhanu");
	    if (sin) {
            System.out.println("The list contains 'Bhanu'");
	    }
        else {
            System.out.println("The list does not contains 'bhanu'");
        }
	    System.out.println("No of items in the list: " + names.size());
	    names.remove(2);
	    System.out.println("No of items in the list after removal: " + names.size());
	  }
}