class Dog {
    private String name;
    private int age;
    private String sound;

    public Dog(String name, int age, String sound) {
        this.name = name;
        this.age = age;
        this.sound = sound != null ? sound : "Woof!";
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void bark() {
        System.out.println(name + " says: " + this.sound);
    }
}

public class DogTestDrive {
    public static void main(String[] args) {
        Dog myDog = new Dog("Buddy", 3, null);
        System.out.println("Dog's name: " + myDog.getName());
        System.out.println("Dog's age: " + myDog.getAge());
        myDog.bark();
    }

}
