package Lesson6.HomeWork.Lesson6.HomeWork.git;

public class Dog extends Animal {
    static int countOfDog;


    public Dog(String name) {
        super(name);
        this.countOfDog++;

    }
    public static int getCount(){
        return countOfDog;
    }

    @Override
    void run(int distance) {
        if (distance>0 && distance <= 500) {
            System.out.println("������ " + name + " �������� " + distance + "�.");

        } else {
            System.out.println("������ " + name + " �� ���� ������� ������");
        }
    }

    @Override
    void swim(int distance) {
        if (distance <= 10 && distance >0){
            System.out.println("������ " + name + " ������� " + distance + "�.");
        }
        else{
            System.out.println("������ " + name + " �� ���� ������� ��������");
        }
    }

}
