package nested.test.ex1;

public class Library {
    int quant; // 초기화 안해도 자동 0으로 초기화
    Book[] arr;

    class Book {
        String title;
        String author;

        public Book(String title, String author) {
            this.title = title;
            this.author = author;
        }

        @Override
        public String toString() {
            return "도서 제목: " + title + ", 저자: " + author;
        }
    }

    public Library(int size) {
        arr = new Book[size];
    }

    public void addBook(String title, String author) {
        if (quant == arr.length) {
            System.out.println("도서관 저장 공간이 부족합니다.");
            return;
        }
        arr[quant++] = new Book(title, author);
    }

    public void showBooks() {
        System.out.println("== 책 목록 출력 ==");
        for (Book book : arr) {
            System.out.println(book.toString());
        }
    }
}
