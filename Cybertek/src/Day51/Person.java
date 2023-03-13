package Day51;

//Person IS-A Comparable
//because it implements Comparable interface
//its a inheritance |IS-A| Super-Sub relationship
public class Person implements Comparable<Person>{


    String name;
    int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    //now this becomes a natural order for
    // comparing Pearson Object
    public int compareTo(Person someone){
//        if (this.age> someone.age){
//            return 1;
//        }else if (this.age < someone.age){
//            return -1;
//        }else{
//            return 0;
//        }
        //modify this method to make your natural order,
        // comparing by name (first character) then use it with sort method
//        if (this.name.charAt(0)> someone.name.charAt(0)){
//            return 1;
//        }else if (this.name.charAt(0) < someone.name.charAt(0)){
//            return -1;
//        }else{
//            return 0;
//        }
       return this.name.compareTo(someone.name);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }


}
