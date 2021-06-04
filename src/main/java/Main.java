
public class Main {
    public static void main(String[] args) {
        Test t1 = new Test();
        Test t2 = new Test();
        Test t3 = new Test();

        StackCustom<Test> custom = new StackCustom<>(3);
        custom.addInTop(t1);
        custom.addInTop(t2);
        custom.addInTop(t3);


        for (Object q : custom) {
            System.out.println(q);
        }


    }
}
