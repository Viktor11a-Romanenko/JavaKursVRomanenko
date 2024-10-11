package lesson_22.animals;

public class Dog extends Animal {

    @Override
    public void voice() {
        // super ->
        super.voice();
    }

    @Override
    public String toString() {
        //super ->
        return super.toString() + "| дополнение реализации родительского метода";
    }


}
