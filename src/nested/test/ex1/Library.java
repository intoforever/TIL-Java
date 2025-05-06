package nested.test.ex1;

public class Library {
    private Book[] books;
    private int bookCount; // 초기화 안해도 자동 0으로 초기화

    public Library(int size) {
        books = new Book[size];
        bookCount = 0;
    }

    public void addBook(String title, String author) {
        // 검증 로직을 우선 처리
        if (bookCount >= books.length) {
            System.out.println("도서관 저장 공간이 부족합니다.");
            return;
        }
        // 이후 정상 로직을 처리
        books[bookCount++] = new Book(title, author);
    }

    public void showBooks() {
        System.out.println("== 책 목록 출력 ==");
        // foreach 말고 for를 써서 bookCount까지만 출력되게 한다.
        for (int i = 0; i < bookCount; i++) {
            System.out.println("도서 제목: " + books[i].title + ", 저자: " + books[i].author); // 내부 클래스이기 때문에 private이어도 getter 별도로 없어도 가능
        }
    }

    // Library 인스턴스의 값을 사용하지 않으니 구분하여 static으로 만들자
    private static class Book {
        private String title;
        private String author;

        public Book(String title, String author) {
            this.title = title;
            this.author = author;
        }
    }
}
