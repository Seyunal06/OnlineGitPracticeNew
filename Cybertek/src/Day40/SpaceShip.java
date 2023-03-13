package Day40;

public class SpaceShip {


    String name;
    String currentDirection;
    int x;
    int y;

    /**
     * provide initial position of a spaceship
     * @param newX
     * @param newY
     */
    public void setInitialPosition(int newX, int newY){
        x= newX;
        y= newY;
    }

    /**
     * accept 1 String parameter to set the direction to either up, down, right, left
     * @param newDirection
     */
    public void setDirection(String newDirection){

        if (newDirection.equalsIgnoreCase("up")||
                newDirection.equalsIgnoreCase("down")||
                newDirection.equalsIgnoreCase("right")||
                newDirection.equalsIgnoreCase("left")){
            currentDirection = newDirection;
        }else {
            System.out.println("Invalid Direction");
            currentDirection = "";//we set it to empty value so we dont get error
        }
    }
    public void move1Block(){

        switch (currentDirection){
            case "right" :
                x+=1;
                break;
            case "left" :
                x-=1;
                break;
            case "up" :
                y+=1;
                break;
            case "down" :
                y-=1;
                break;

        }
    }
    //Add a functionality to move1Block with direction provided in one shot

    /**
     * This will take a direction and move spaceship object 1 block
     * @param newDirection
     */
    public void move1Block(String newDirection){
        //we are using the functionality that we already have to set the direction
        setDirection(newDirection);
        //we are using the functionality that we already have to move1Block
        move1Block();
    }


    //right click, generate, toString and enter
    // only for toString
    public String toString() {
        return "SpaceShip{" +
                "name='" + name + '\'' +
                ", currentDirection='" + currentDirection + '\'' +
                ", x=" + x +
                ", y=" + y +
                '}';
    }


}
