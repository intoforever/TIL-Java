package generic.test.ex3;

public class UnitPrinter {

    public static <T extends Shuttle> void printV1(T t) {
        t.showInfo();
    }

    public static void printV2(Shuttle<?> unit) {
        unit.showInfo();
    }
}
