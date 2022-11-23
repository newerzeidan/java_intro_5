package oopPractice;

public class Sword {
    // Default Constructor
    public Sword(){}

    // Modified Constructor (1 Argument)
    public Sword(String material){
        this.material = material;
    }

    // Modified constructor (all non-static arguments)
    public Sword(double weight, double length, String name, String material){
        this(material);
        this.weight = weight; // assigning the LOCAL to the INSTANCE variable
        this.length = length;
        this.name = name;
    }
    // 2. Instance variables

    // static ones -> belongs to the class, What does every sword have?
    public static boolean isSharp;
    public static final boolean hasHandle = true;

    // non-static -> belongs to the object, What is changing sword by sword?
    public double weight;
    public double length;
    public String name;
    public String material;


    // 3. Methods -> What does a sword do, What does every sword do?
    public static void slash(){
        System.out.println("Sword is slashing");
    }

    // non-static ones -> belongs to the object, What does every sword do differently?
    // weight * length = 2 pounds * 10 inches = 20 points
    // weight * length = 2 pounds * 15 inches = 150 points
    public void harms(){
        System.out.println("Sword damages = " + (weight * length) + " points. ");
    }
    // running only ONCE before EVERYTHING
   static{
        System.out.println("Starting the sword making furnace");
    }

    // running everytime when you create an object before everything after static code block
    {
        System.out.println("Heating up the furnace");

    }

    //toString() method
    @Override
    public String toString() {
        return "Sword{" +
                "weight=" + weight +
                ", length=" + length +
                ", name='" + name + '\'' +
                ", material='" + material + '\'' +
                '}';
    }


}
