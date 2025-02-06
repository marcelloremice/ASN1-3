public class Pet {
    private String petName;
    private int age;
    private String petSound;
    private String petType;
    private String petPersonality;
    private String petFood;

    public Pet(String type, String name, int age1, String food, String personality, String sound) {
        this.petName = name;
        this.age = age1;
        this.petType = type;
        this.petFood = food;
        this.petPersonality = personality;
        this.petSound = sound;
    }
    public Pet() {
        this.petName =" Pet Name";
        this.age = 1;
        this.petType = "Animal";
        this.petSound = "Yowl";
        this.petFood = "Fish";
        this.petPersonality = "Jolly";

    }
    public String getpetName(){
        return petName;
    }
    public int getAge(){
        return age;
    }
    public String getpetSound(){
        return petSound;
    }
    public String getpetType(){
        return petType;
    }
    public String getpetFood(){
        return petFood;
    }
    public void setpetName(String name) {
        this.petName = name;
    }
    public void setpetFood(String food){
        this.petFood = food;
    }
    public String getpetPersonality(){
        return petPersonality;
    }
    public void setType(String type){
        this.petType = type;
    }
    public void setName(String name){
        this.petName = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setPetSound(String sound) {
        this.petSound = sound;
    }
    public void setpetPersonality(String personality){
        this.petPersonality = personality;

    }
    public String toString(){

        return "Pet information:\nType: " + this.petType +"\nName: " + this.petName +"\nSound: " + this.petSound +"\nAge: " +this.age +"\nfood: " + this.petFood +"\nPersonality: " + this.petPersonality +"\n";
    }
}