package Day33;

public class WarmUp {
    public static void main(String[] args) {

        String getName = spellName("Seyma");
        System.out.println(getName);

        System.out.println(spellName("Marcos"));

        System.out.println(spellName2("Unal"));


    }public static String spellName2(String name){
        String result = "";

        for (int i= 0; i<name.length()-1;i++)

            //this loop adds a dash until the last one
            result+= name.charAt(i)+"-";

        //code goes here
        return result + name.charAt(name.length()-1);
    }

    public static String spellName(String name){
        String result = "";
        for (int x=0; x<name.length(); x++){

            result += name.charAt(x);

            if (x !=name.length()-1){
                result+= "-";

            }
        }


        return result;
    }


}
