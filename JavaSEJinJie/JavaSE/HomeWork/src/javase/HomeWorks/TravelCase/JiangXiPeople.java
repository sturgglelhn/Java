package javase.HomeWorks.TravelCase;

public class JiangXiPeople extends People implements Chili{
    @Override
    public void chili() {
        System.out.println("江西人吃辣！");
    }

    @Override
    public void travel(Travel travel) {
        travel.journey();
    }
}
