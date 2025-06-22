package collection.compare.test.result;

/**
 * extends ENUM이 생략되어 있다.
 * ENUM 타입은 compareTo가 열거형의 순서인 ordinal로 구현되어 있다.
 * 그리고 ENUM의 compareTo() 메서드는 final 선언되어 있어서 재정의 할 수 없다.
 */
public enum Suit {
    // 적은 순서대로 정렬됨
    SPADE("♠"), // 스페이드(♠)
    HEART("♥"), // 하트(♥)
    DIAMOND("♦"), // 다이아몬드(♦)
    CLUB("♣"); // 클로버(♣)

    private String icon;

    Suit(String icon) {
        this.icon = icon;
    }

    public String getIcon() {
        return icon;
    }
}
