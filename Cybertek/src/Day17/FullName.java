package Day17;

public class FullName {
    public static void main(String[] args) {
        //                 0123456789
        String fullName = "sEyMa uNal";

        String firstN = fullName.substring(0,5);
        String lastN = fullName.substring(6);

        String firstFix = firstN.toUpperCase().substring(0,1) +
                firstN.toLowerCase().substring(1);

        System.out.println(firstFix);
        String lastFix = lastN.toUpperCase().substring(0,1)+
                lastN.toLowerCase().substring(1);
        System.out.println(lastFix);

        fullName = firstFix + " " + lastFix;
        System.out.println(fullName);
    }
}
