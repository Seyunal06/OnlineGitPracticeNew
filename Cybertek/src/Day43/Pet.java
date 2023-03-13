package Day43;

public class Pet {

    private String type;
    private String name;

    public Pet(){
        this.type = "unknown";
        this.name = "no-name";
    }
    public Pet(String type, String name){
        this.type = type;
        this.name = name;
    }
    public  void speak(){
        switch (type){
            case "cat":
                System.out.println("meow");
                break;
            case "dog":
                System.out.println("woof");
                break;
            case "horse":
                System.out.println("neigh");
                break;
            case "cow":
                System.out.println("moo");
                break;
            default:
                System.out.println("Unknown Animal");
        }
    }
    public String toString() {
        return "Pet{" +
                "type='" + type + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
    public static void showGeneralPetInfo(){
        System.out.println("pet are friends of humans");
    }

    public String getType() { return type; }

    public void setType(String type) { this.type = type; }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }
}
