package Day53;

public class FruitShopUtility {

    public static void main(String[] args) {


    Fruit f1 = new Apple("crispy but tasteless","hot red","gala");
    Fruit f2 = new Orange("sour","orange",12);

        System.out.println("DISPLAY FRUIT ========================");
    displayFruit(f1);
    displayFruit(f2);
    //can we directly pass any object Is-A Fruit rather than saving it into a variable
        displayFruit(new Apple("tasteless","red","golden"));

        System.out.println("DIGEST BETTER ========================");
    digestBetter(f2);
    digestBetter(new Orange("sweet","yellowish",1));

    Fruit x = getMyFavFruit();
    x.getDigested();
    //directly print out
        System.out.println("MY FAV "+ getMyFavFruit());

        System.out.println("getFavByType(1) = " + getFavByType(1));
        System.out.println("getFavByType(2) = " + getFavByType(2));
        System.out.println("getFavByType(3) = " + getFavByType(3));

    }
    public static Fruit getFavByType(int type){
        if(type == 1){
            return new Apple("sweet","blue","ginger");
        }else if (type == 2){
            return new Orange("crispy","green",100);
        }else {
            //we can return null for any method that can return reference type
            //bc null can be assigned to a reference type variable
            return null;
        }
    }

    public static void digestBetter (Fruit anyFruit){
        anyFruit.getDigested();
        anyFruit.getDigested();
        anyFruit.getDigested();
        anyFruit.getDigested();
        System.out.println("anyFruit "+anyFruit);
    }
    public static Fruit getMyFavFruit(){
        return new Orange("crispy","green",100);
    }
    //displayFruit
    public static void displayFruit(Fruit anyFruit){
        System.out.println("Displaying fruit \n" + anyFruit.toString());
    }

    //sellFruit



    //buyFruit




}
