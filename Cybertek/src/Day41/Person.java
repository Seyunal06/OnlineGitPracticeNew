package Day41;

public class Person {

    //private makes it only accessible in the same class
    private String name;
    private int age;
    private long ssn;

    //what if I only want to get the name
    public String getName(){
        return name;
    }
    //what if I only want to change the name
    public void setName(String newName){
        name = newName;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int newAge){
        age = newAge;
    }
    public long getSsn(){
        return ssn;
    }
    public void setSsn(long newSsn){
        ssn = newSsn;
    }

    //write a method to give a value to the field
    public void setAll(String newName, int newAge, long newSsn){

        name = newName;
        age = newAge;
        ssn = newSsn;
    }
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", ssn=" + ssn +
                '}';
    }
}
