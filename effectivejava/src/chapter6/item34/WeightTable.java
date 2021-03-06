package chapter6.item34;

public class WeightTable {
    public static void main(String[] args) {
        String testWeight="5";
        double earthWeight = Double.parseDouble(testWeight);
        double mass = earthWeight / Planet.EARTH.surfaceGravity();
        for (Planet p : Planet.values())
            System.out.printf("%s에서의 무게는 %f이다.%n",
                    p, p.surfaceWeight(mass));
    }
}