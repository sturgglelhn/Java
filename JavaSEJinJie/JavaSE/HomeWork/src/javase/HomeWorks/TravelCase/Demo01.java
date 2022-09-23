package javase.HomeWorks.TravelCase;

public class Demo01 {
    public static void main(String[] args) {
        GuiZhouPeople guiZhouPeople = new GuiZhouPeople();
        guiZhouPeople.travel(new GuangDong());
        guiZhouPeople.chili();
        guiZhouPeople.sour();

        System.out.println("-------------------");

        JiangXiPeople jiangXiPeople = new JiangXiPeople();
        jiangXiPeople.travel(new GuiZhou());
        jiangXiPeople.chili();

        System.out.println("-------------------");

        GuangdongPeople guangdongPeople = new GuangdongPeople();
        guangdongPeople.travel(new JiangXi());
        guangdongPeople.sour();
        guangdongPeople.sweet();

    }
}
