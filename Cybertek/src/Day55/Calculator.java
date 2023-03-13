package Day55;

public class Calculator {

    private int result;

    public Calculator minusNum(int num){
        this.result -= num;
        return this;
    }
    public void displayFinalResult(){
        System.out.println("Final result "+result);
    }

    public Calculator addNum(int num){
        this.result += num;
        return this;

//        Calculator c = new Calculator();
//        return c;


    }

}
