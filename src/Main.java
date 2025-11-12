public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        Person person = new Person(25, "Ben");
        System.out.println(person.getAge());
        System.out.println(person.getName());

        Animal animal1 = new Animal("Dog", 6);
        System.out.println("My animal is" + animal1.getAnimalName());
        System.out.println("My dog age is" + animal1.getAge());

        Location location1 = new Location("Cardiff");
        System.out.println(location1.getLocation());
    }
}