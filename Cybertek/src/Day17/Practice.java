package Day17;

public class Practice {
    public static void main(String[] args) {

        String name = "sEyMa";

//        String nameFix = (name.charAt(0)+"").toUpperCase();
//        nameFix = nameFix + name.substring(1).toLowerCase();

        String nameFix = name.toUpperCase().substring(0,1);
        nameFix += name.substring(1).toLowerCase();

        System.out.println("nameFix = " + nameFix);

    }
}
