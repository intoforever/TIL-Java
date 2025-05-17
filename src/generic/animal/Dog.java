package generic.animal;

public class Dog extends Animal {
    public Dog(String name, int size) {
        super(name, size);
    }

    // Ctrl + O를 누르면 오버라이딩 메소드 확인 가능
    @Override
    public void sound() {
        System.out.println("멍멍");
    }
}
