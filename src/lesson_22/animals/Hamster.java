package lesson_22.animals;

public class Hamster extends Animal {

    //Переопредиление родительского метода


    @Override
    public void voice() {
        System.out.println("Hamster say Hrum-hrum");
    }
}
