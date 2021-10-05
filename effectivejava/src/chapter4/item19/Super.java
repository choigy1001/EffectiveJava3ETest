package chapter4.item19;

public class Super {
    public Super() {
        overrideMe();
//        helpMethod();
    }

    public void overrideMe() {
        System.out.println("super method");
    }

    //도우미 메소드
    private void helpMethod(){
        System.out.println("super method");
    }
}


