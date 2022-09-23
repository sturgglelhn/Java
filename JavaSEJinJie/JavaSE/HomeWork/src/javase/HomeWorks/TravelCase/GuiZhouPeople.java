package javase.HomeWorks.TravelCase;

public class GuiZhouPeople extends People implements Sour,Chili{
    @Override
    public void chili() {
        System.out.println("贵州人喜欢吃辣！");
    }

    @Override
    public void sour() {
        System.out.println("贵州人喜欢吃酸！");
    }

    @Override
    public void travel(Travel travel) {
        travel.journey();
    }
}
