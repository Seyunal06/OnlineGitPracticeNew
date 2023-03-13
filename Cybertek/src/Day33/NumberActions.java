package Day33;

public class NumberActions {
    public static void main(String[] args) {

        //1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10 = 55
        System.out.println(getSum1ToX(10));

        System.out.println(getEmail("Seyma","Unal"));

        String fullName = "Seyma Unal";

//        String part1= fullName.split("")[0];
//        String part2 = fullName.split("")[1];
//        String herEmail = getEmail(part1,part2);
//        System.out.println(herEmail);

        String[] fullNameSplit = fullName.split(" ");
        String herEmail = getEmail(fullNameSplit[0],fullNameSplit[1]);

        System.out.println(herEmail);

    }
    public static String getEmail (String firstName, String lastName){
        String email = firstName.charAt(0)+ lastName+ "@NightWatch.com";
        return email;
    }
    /**
     *getSum1ToX
     * this second line is the parameter
     * @param  x final number to be added
     * @return the sum of number from 1 to x as int
     */
    public static int getSum1ToX(int x){
        int sum= 0;
        //TODO: YOUR CODE GOES HERE
        for(int i=1; i<=x;i++){
            sum += i;
        }

        return sum;
    }



}
