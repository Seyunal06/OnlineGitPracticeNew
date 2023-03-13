package Day48;

import Day47.GasCar;
//a class can implement more than one interface
public class Kangaroo implements Bouncible,Boxer{

    String name;
    int jumpDistance;


    //these two methods, we are overriding from Boxer
    @Override
    public void kickBox() {
        System.out.println("kangaroo with name " + name+"is kickBoxing");
    }
    @Override
    public void carryingChild() {
        System.out.println("kangaroo with name "+name +" carrying a child in pocket");
    }

    //this is the method we have override from bouncible interface
    @Override
    public void bounce() {
        System.out.println("This " + name + " can jump " + jumpDistance
                + " meters forward and it would be nice to have " + GRAVITY + " gravity");
    }



   public Kangaroo(String name, int jumpDistance){
       this.name = name;
       this.jumpDistance = jumpDistance;
   }

    @Override
    public String toString() {
        return "Kangaroo{" +
                "name='" + name + '\'' +
                ", jumpDistance=" + jumpDistance +
                '}';
    }



}
