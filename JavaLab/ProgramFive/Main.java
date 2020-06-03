package ProgramFive;

interface Animal {
    void eat();
    void sound();
}
interface TiredAnimal extends Animal{
    void tired();
}
class snake implements TiredAnimal{
    public void eat() {
        System.out.println("Snake:: I am carnivorous!");
    }
    public void tired() {
        System.out.println("Snake:: I am never lazy!");
    }
    public void sound() {
        System.out.println("Snake:: I hissss!");
    }
}
class lion implements TiredAnimal{
    public void tired() {
        System.out.println("Lion:: I am always lazy!");
    }
    public void eat() {
        System.out.println("Lion:: I am carnivorous!");
    }
    public void sound() {
        System.out.println("Lion:: I roar!");
    }
}
public class Main {
    public static void main(String[] args) {
        snake s = new snake();
        lion l = new lion();
        s.eat();
        s.sound();
        s.tired();
        l.eat();
        l.sound();
        l.tired();

    }
}
