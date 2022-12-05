package recap;

public class Animal {

    public Animal(String name, int age, double height, double weight, String diet) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.diet = diet;
    }

    public Animal(String name, int age, double height, double weight, String diet, boolean isAlive, boolean isExtinct){
        this(name, age, height, weight, diet);
        this.isAlive = isAlive;
        this.isExtinct = isExtinct;
    }

    public String name;
    public int age;
    public double height;
    public double weight;
    public String diet; // carnivore, omnivore, herbivore
    public boolean isAlive;
    public boolean isExtinct;
    private String gender;

    public String getGender(String password) {
        switch (password){
            case "12345":
                return gender;
        }
        return "Your password is wrong";
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void eat(String food){
        switch (food){
            case "meat":
            case "animal":
            case "human":
                diet = "carnivore";
                System.out.println(name + " is a carnivore now!");
                break;
            case "lettuce":
            case "grass":
            case "plant":
            case "leaves":
                diet = "herbivore";
                System.out.println(name + " is a herbivore now!");
                break;
            default:
                System.out.println("We don't have diet type for this food!");
        }
        System.out.println(name + " is eating " + food);
    }

    public void breathe(String type){
        if (!isAlive || isExtinct){
            System.out.println(name + " cannot breathe!");
        } else {
            switch (type){
                case "Gills":
                    System.out.println(name + " is water breathing");
                    break;
                case "Lungs":
                    System.out.println(name + " is air breathing");
                    break;
                default:
                    System.out.println(name + " is breathing with a unique way");
            }
        }
    }

    public double attack(){
        double damage = height * weight;
        System.out.println(name + " is attacking. It damaged \"" + damage + "\".");
        return damage;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "{" + //"this.getClass().getSimpleName() will dynamically give you the name of the class
                "name='" + name + '\'' +
                (isAlive ? ", age=" + age : "") +
                ", height=" + height +
                ", weight=" + weight +
                ", diet='" + diet + '\'' +
                ", isAlive=" + isAlive +
                ", isExtinct=" + isExtinct +
                '}';
    }


    public static void main(String[] args) {
//        Animal animal = new Animal();
//        System.out.println("Not alive = " + animal);
//        animal.isAlive = true;
//        System.out.println("Alive = " + animal);

        Animal animal = new Animal("T-Rex", 5, 7.4, 400.2, "carnivore", false, true);
        System.out.println(animal);

//        animal.eat("leaves");
//
//        animal.isAlive = true;
//        animal.isExtinct = false;
//        animal.breathe("Lungs");

//        animal.attack();

        animal.setGender("Male");
        System.out.println(animal.getGender("12345asdasd"));
    }
}