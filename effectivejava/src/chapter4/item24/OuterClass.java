package chapter4.item24;

public class OuterClass {

    private int lowPriority;

    public OuterClass(int lowPriority){
        this.lowPriority=lowPriority;
    }
     class InnerClass {
        private int topPriority;

        public InnerClass(int topPriority) {
            this.topPriority=topPriority;
        }

        public void plus(OuterClass out){
            this.topPriority=out.lowPriority+this.topPriority;
        }
    }

    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass(5);
        OuterClass.InnerClass innerClass= outerClass.new InnerClass(5);

        innerClass.plus(outerClass);
        System.out.println("topPriority = " + innerClass.topPriority);
        System.out.println("lowPriority = " + outerClass.lowPriority);
    }
}
