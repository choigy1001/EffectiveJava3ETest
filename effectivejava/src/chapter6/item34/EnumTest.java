package chapter6.item34;

public class EnumTest {

    public static void enum_test(Apple type){
        System.out.println("type = " + type+ " success");
    }

    public static void main(String[] args) {
        enum_test(Apple.FUJI);
//      컴파일 오류 발생
//      enum_test(Orange.BLOOD);

        //타입이 다르면 같은 상수도 가능!
        System.out.println(Apple.CH);
        System.out.println(Orange.CH);

        System.out.println(DayTime.AFTERNOON);
        System.out.println(DayTime.AFTERNOON.toString());
    }
}
