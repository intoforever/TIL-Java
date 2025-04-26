package nested.inner.ex1;

public class Car {
    private String model;
    private int chargeLevel;
    private Engine engine;

    public Car(String model, int chargeLevel) {
        this.model = model;
        this.chargeLevel = chargeLevel;
        this.engine = new Engine(this);
    }

    // Engine에서만 사용하는 메서드이지만 외부에 오픈을 해야함 (Engine이 쓸 수 있게 하기 위해)
    public String getModel() {
        return model;
    }

    // Engine에서만 사용하는 메서드이지만 외부에 오픈을 해야함 (Engine이 쓸 수 있게 하기 위해)
    public int getChargeLevel() {
        return chargeLevel;
    }

    public void start() {
        engine.start();
        System.out.println(model + " 시작 완료");
    }
}
