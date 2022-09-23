package javase.HomeWorks.TravelCase;

public class GuangdongPeople extends People implements Sour,Sweet{
    @Override
    public void sour() {
        System.out.println("广东人喜欢吃酸！");
    }

    @Override
    public void sweet() {
        System.out.println("广东人喜欢吃甜！");
    }

    @Override
    public void travel(Travel travel) {
        travel.journey();
    }
}
