package lesson_22.animals;

public class Cat extends Animal {

    // Уникольный функционал кота
    public void eat() {
        System.out.println("Cat eat");
    }

    //Переопредиление родительского метода voice()
    /*
    Динамический полиморфизм (времени выполнения): реализуется с помощью переопределения методов.
    Время выполнения (JVM) определяет, какой метод вызывать на основе фактического объекта, на котором вызывается метод.
     */
    @Override //@ аннатация!!!
    public void voice() {
        System.out.println("Cat say MEOW!!");

    }

    @Override
    public String toString() {
        return "Cat toString";
    }

    //
    public void voice(String str) {
        System.out.println("Cat say " + str);
    }


}
