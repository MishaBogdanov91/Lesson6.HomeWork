package Lesson6.HomeWork.Lesson6.HomeWork.git;

public class Test {
    public static void main(String[] args) {


        System.out.println();
        Cat cat1 = new Cat("������");

        Dog dog1 = new Dog("������");

        System.out.println("����� �������� " + Animal.getCount());
        System.out.println("����� ����� "+Dog.getCount());
        System.out.println("����� ����� "+ Cat.getCount());

        cat1.run(100);
        cat1.swim(500);
        dog1.run(100);
        dog1.swim(200);
    }
}
