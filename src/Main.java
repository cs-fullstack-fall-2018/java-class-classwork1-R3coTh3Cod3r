import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
     Person name1 = new Person();
     Person name2 = new Person();
     Person name3 = new Person();

     name1.setHeight(6);
     name1.setWeight(126);
     System.out.println(name1.bodyMassIndex());
     name2.setHeight(5);
     name2.setWeight(150);
    System.out.println(name2.bodyMassIndex());
     name3.setHeight(3);
     name3.setWeight(300);
    System.out.println(name3.bodyMassIndex());


        ArrayList<Person> personArray=new ArrayList<Person>();
        personArray.add(name1);
        personArray.add(name2);
        personArray.add(name3);
//First way
        name2.printPerson();
//Second way
       System.out.println(); personArray.get(1).printPerson();
       System.out.println(); personArray.get(0).bodyMassIndex();

    }



}
