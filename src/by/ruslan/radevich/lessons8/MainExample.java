package by.ruslan.radevich.lessons8;

public class MainExample {
    public static void main(String[] args) {
        Parent badParent = new Child();
        final int myInt = 5;//значение можно записать только 1 раз или просто константа
        badParent.setName("Tom");
        System.out.println(badParent.getName());

        BadParent superBadParent = new BadParent();
        Personable personable = new BadParent();
    }

    /**
     * this metod returns Child if i ask him
     * @param isParent - helps me to chose
     * @return - parametr of child
     */
    public static Parent getParent(boolean isParent){
        if (isParent) {
            return new Parent();
        }else {
            return new Child();
        }
    }
    public static int fib(int param){
        if (param==1||param==2) return 1;
        return fib(-1)+fib(-2);
    }

}
