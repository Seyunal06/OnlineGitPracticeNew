package Day22;

public class AnotherArray {
    public static void main(String[] args) {

        int[] ages = new int[]{3, 5, 17, 34, 56, 45};

        int itemCount = ages.length;
        System.out.println("itemCount = " + itemCount);

        for (int x = 0; x < itemCount; x++) {
            System.out.println(ages[x]);
        }

        // this way has to be written on one line
        int[] areaCode = {308, 345, 412, 609};
    }
}
