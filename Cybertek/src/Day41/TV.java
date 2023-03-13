package Day41;

public class TV {

    String name;
    boolean isOn;
    int currentChannel;


    /**
     * a method to return the value of current channel for the TV
     * @return the value of current channel for thr TV
     */
    public int getCurrentChannel(){
        return currentChannel;
    }
    public void setCurrentChannel(int newChannel){
        //if my channel is out of range I want to exit from method
        if (newChannel<0 || newChannel>50){
            System.out.println("INVALID CHANNEL");
            return; //early exit from method
        }
        if (isOn) {
            currentChannel = newChannel;
        }else{
            System.out.println("turn on the TV first");
        }
    }
    public void turnOn() {

        if (isOn == false) {
            System.out.println("turning on TV");
            isOn = true;
        }
    }
        public void turnOff(){

            if (isOn){
                System.out.println("turning off TV");
                isOn=false;
            }
        }
    public String toString() {
        return "TV{" +
                "name='" + name + '\'' +
                ", isOn=" + isOn +
                ", currentChannel=" + currentChannel +
                '}';
    }




}
