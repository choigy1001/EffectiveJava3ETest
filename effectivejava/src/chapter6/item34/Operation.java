package chapter6.item34;

public enum Operation {
    PLUS("+") {
        public double apply(double x, double y) { return x + y; }
    },
    MINUS("-") {
        public double apply(double x, double y) { return x - y; }
    },
    TIMES("*") {
        public double apply(double x, double y) { return x * y; }
    },
    DIVIDE("/") {
        public double apply(double x, double y) { return x / y; }
    };

    private final String symbol;

    Operation(String symbol) { this.symbol = symbol; }

    @Override public String toString() { return symbol; }

    public abstract double apply(double x, double y);

    public static void main(String[] args) {
        System.out.println("PLUS.symbol = " + PLUS);
        Operation[] values = Operation.values();
        System.out.println("values = " + values[1]);
        double x = Double.parseDouble("3");
        double y = Double.parseDouble("4");
        for (Operation op : Operation.values()) //정적 메서드
            System.out.printf("%f %s %f = %f%n",
                    x, op, y, op.apply(x, y));
    }
}
