package collection;

import java.util.ArrayList;

public class quiz03 {

	public static void main(String[] args) {

		ArrayList<Book> bookList = new ArrayList<Book>();

		Book book1 = new Book(1, "냉정과열정사이");

		// 방법은 두 가지.
		bookList.add(book1);
		bookList.add(new Book(2, "나무"));
		bookList.add(new Book(3, "풀꽃"));

		System.out.println(bookList.get(0));
		System.out.println(bookList.get(1));
		System.out.println(bookList.get(2));

		System.out.println();

		for (int i = 0; i < bookList.size(); i++) {
			Book book = bookList.get(i); // 리스트에서 꺼내와서 새로운 변수에 담아서 출력
			System.out.println(book);
		}
		
		System.out.println();

		for (Book book : bookList) {
			System.out.println(book);
		}
		bookList.remove(0);
		bookList.remove(0);
		bookList.remove(0);
		System.out.println(bookList);
	}

}

class Book {

	int bookNo;
	String title;

	public Book(int bookNo, String title) {
		super();
		this.bookNo = bookNo;
		this.title = title;
	}

	@Override
	public String toString() {
		return "Book [bookNo=" + bookNo + ", title=" + title + "]";
	}

}