package Day16;

public class MoreString {
    public static void main(String[] args) {

        String keywordSearch = "Java";
        String tabTittle = keywordSearch + " - Google Search";

        if(tabTittle.startsWith(keywordSearch) && tabTittle.endsWith(" - Google Search")){
            System.out.println("Test passed");
        }else{
            System.out.println("Test failed");
        }
    }
}
