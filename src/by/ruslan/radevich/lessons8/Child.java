package by.ruslan.radevich.lessons8;

public class Child extends Parent{
    public Child() {
        super();//всегода идет первои строчкои
        System.out.println("this is my child constructor");
        System.out.println(super.value);
        super.toString();
    }

    @Override
    public String getName() {
        System.out.println(super.getName());//просим имя у родителей
        System.out.println(getName());// свое имя
        return "this is cool child";



        //get назначет родителя
    }
}
