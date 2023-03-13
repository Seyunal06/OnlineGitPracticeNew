package Day44.Sub;

import Day44.SlackUser;

public class SlackAdminUser extends SlackUser {

    int adminId;

    //constructor
    public SlackAdminUser(String name, String status, int adminId){
        this.adminId = adminId;
        this.name = name;
        this.status = status;
    }
    public static void main(String[] args){
        SlackAdminUser user1 = new SlackAdminUser("Seyma", "Hello",101);
        //---inherited methods we are calling
        user1.sendMessage();
        user1.callSomeone();
        user1.addEmoji();
        //---our own methods we are calling
        
    }
    public String toString() {
        return "SlackAdminUser{" +
                "adminId=" + adminId +
                ", name='" + name + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
