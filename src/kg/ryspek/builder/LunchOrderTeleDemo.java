package kg.ryspek.builder;

public class LunchOrderTeleDemo {

    public static void main(String[] args) {
        LunchOrderTele lunchOrderTele = new LunchOrderTele("Wheat", "Lettuce", "Mustard", "Ham");

        // lunchOrderBean.setBread("Wheat");
        // lunchOrderBean.setCondiments("Lettuce");
        // lunchOrderBean.setDressing("Mustard");
        // lunchOrderBean.setMeat("Ham");

        System.out.println(lunchOrderTele.getBread());
        System.out.println(lunchOrderTele.getCondiments());
        System.out.println(lunchOrderTele.getDressing());
        System.out.println(lunchOrderTele.getMeat());
    }

}
