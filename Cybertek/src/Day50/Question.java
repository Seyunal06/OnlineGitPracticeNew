package Day50;

public abstract class Question {

    int num1;
    int num2;
    String operator;
    int answer;
    boolean calculated;
    String questionType = "Unknown";//setting default value to unknown directly here t avoid null

    public abstract void calculate();

    public Question(String questionType,String operator) {
        this.questionType= questionType;
        this.operator = operator;
    }

    @Override
    public String toString() {
        return "The question type is " + questionType;
    }
}
