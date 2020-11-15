package com.dxc.library.ui;
import java.util.Scanner;
import com.dxc.library.dto.Book;
import com.dxc.library.dao.BookDAO;
import com.dxc.library.dao.BookStatusDAO;
import com.dxc.library.dto.BookStatus;
public class BookUI 
{
	 static BookDAO bdao = new BookDAO();
	 static BookStatusDAO bsDao = new BookStatusDAO();
     public static String addBookDetails(Scanner sc)
     {
    	 Book b = new Book();
    	 BookStatus bs = new BookStatus();
    	 System.out.print("Enter Book Id :- ");
    	 b.setBookId(sc.nextInt());
    	 sc.nextLine();
    	 System.out.print("Enter Book Title :- ");
    	 b.setBookTitle(sc.nextLine());
    	 System.out.print("Enter Book Author :- ");
    	 b.setAuthor(sc.nextLine());
    	 System.out.print("Enter Book Publisher :- ");
    	 b.setPublisher(sc.nextLine());
    	 System.out.print("Enter Book Price :- ");
    	 b.setPrice(sc.nextDouble());
    	 sc.nextLine();
    	 System.out.print("Enter Number of Copies ");
    	 bs.setAvailableCopies(sc.nextInt());
    	 sc.nextLine();
    	 System.out.println();
    	 bs.setBookId(b.getBookId());
    	 bs.setTotalCopies(bs.getAvailableCopies());
    	 bsDao.insertBookStatus(bs);
    	 return bdao.insertBookDetails(b) ? "Book Added Successfully" : "Book Cannot be Added";
     }
     public static String deleteBook(Scanner sc)
     {
    	 System.out.print("Enter Book Id to Delete :- ");
    	 int bookId = sc.nextInt();
    	 sc.nextLine();
    	 return bdao.deleteBook(bookId) ? "Book Deleted Successfully" : "Book Deletion Failed";
     }
     public static String modifyBook(Scanner sc)
     {
    	 Book b = new Book();
    	 System.out.print("Enter Bookid to Modify :- ");
    	 b.setBookId(sc.nextInt());
    	 sc.nextLine();
    	 System.out.print("Enter Book new Publisher  :- ");
    	 b.setPublisher(sc.nextLine());
    	 System.out.print("Enter Book new Price :- ");
    	 b.setPrice(sc.nextDouble());
    	 sc.nextLine();
    	 System.out.println();
    	 return bdao.modifyBook(b) ? "Book Details Modified Successfully":"Book Modification Failed";
     }
     public static void showBookDetails(Scanner sc)
     {
    	 System.out.print("Enter Book Id to get Details :- ");
    	 int bookId = sc.nextInt();
    	 sc.nextLine();
    	 Book b = bdao.getBookDetails(bookId);
    	 if(b!=null)
    		 System.out.println(b);
    	 else
    		 System.out.println("Book with Id "+bookId+"Does not Exist");
     }
     public static void showAllBooks()
     {
    	 for(Book b : bdao.getAllBooksDetails())
    		 System.out.println(b);
     }
}
