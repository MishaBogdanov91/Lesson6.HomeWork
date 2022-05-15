package Lesson6.HomeWork.Lesson6.HomeWork.git;

public class Cat extends Animal {
    static int countOfCat;

    public Cat(String name) {
        super(name);
        this.countOfCat++;
    }


    public static int getCount() {
        return countOfCat;
    }

    @Override
    void run(int distance) {

        if (distance <= 200) {
            System.out.println("��� " + name + " �������� " + distance + "�.");

        } else {
            System.out.println("��� " + name + " �� ���� ������� ������");
        }
    }

    @Override
    void swim(int distance) {
        System.out.println("����� " + name + ": � �� ���� �������\n");
    }


}
