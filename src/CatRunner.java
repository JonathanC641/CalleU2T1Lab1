public class CatRunner {
    public static void main(String[] agrs) {
        Cat cat1 = new Cat("Simon", 2, 50 );
        cat1.introduce();
        cat1.printCatInfo();
        Cat cat2 = new Cat("Josh", 9, 1);
        cat2.introduce();
        cat2.printCatInfo();
    }
}
