public class Animal {

    private String animalName;
    private int age;

    Animal(String animalName, int age) {
        this.animalName = animalName;
        this.age = age;
    }

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
