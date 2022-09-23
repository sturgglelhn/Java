package javase.HomeWorks.langtype;

public class Demo02 {
    public static void main(String[] args) {
        Chili abc = new Chili() {
            @Override
            public void chili() {
                System.out.println("湖南线椒~");
            }
        };

        Chili abc2 = new Chili() {
            @Override
            public void chili() {
                System.out.println("湖北辣椒~");
            }
        };

        abc.chili();
        abc2.chili();
    }
}
