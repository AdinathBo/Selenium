package practice;

	import java.util.ArrayList;
	import java.util.Scanner;

	class Book {
	    String title;
	    String author;
	    String ISBN;

	    public Book(String title, String author, String ISBN) {
	        this.title = title;
	        this.author = author;
	        this.ISBN = ISBN;
	    }
	}

	class Borrower {
	    String name;
	    String contact;

	    public Borrower(String name, String contact) {
	        this.name = name;
	        this.contact = contact;
	    }
	}

	class Transaction {
	    Book book;
	    Borrower borrower;
	    String dueDate;

	    public Transaction(Book book, Borrower borrower, String dueDate) {
	        this.book = book;
	        this.borrower = borrower;
	        this.dueDate = dueDate;
	    }
	}

	class Library {
	    ArrayList<Book> books = new ArrayList<>();
	    ArrayList<Borrower> borrowers = new ArrayList<>();
	    ArrayList<Transaction> transactions = new ArrayList<>();

	    public void addBook(Book book) {
	        books.add(book);
	    }

	    public void addBorrower(Borrower borrower) {
	        borrowers.add(borrower);
	    }

	    public void borrowBook(Book book, Borrower borrower, String dueDate) {
	        Transaction transaction = new Transaction(book, borrower, dueDate);
	        transactions.add(transaction);
	    }

	    public void displayBooks() {
	        System.out.println("Books in the library:");
	        for (Book book : books) {
	            System.out.println("Title: " + book.title + ", Author: " + book.author + ", ISBN: " + book.ISBN);
	        }
	    }

	    public void displayBorrowers() {
	        System.out.println("Borrowers in the library:");
	        for (Borrower borrower : borrowers) {
	            System.out.println("Name: " + borrower.name + ", Contact: " + borrower.contact);
	        }
	    }

	    public void displayTransactions() {
	        System.out.println("Transactions in the library:");
	        for (Transaction transaction : transactions) {
	            System.out.println("Borrower: " + transaction.borrower.name +
	                    ", Book: " + transaction.book.title +
	                    ", Due Date: " + transaction.dueDate);
	        }
	    }
	}

	public class LibraryManagementSystem {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        Library library = new Library();

	        // Adding some sample data
	        library.addBook(new Book("Java Programming", "John Doe", "123456789"));
	        library.addBook(new Book("Data Structures", "Jane Smith", "987654321"));

	        library.addBorrower(new Borrower("Alice Johnson", "123-456-7890"));
	        library.addBorrower(new Borrower("Bob Williams", "987-654-3210"));

	        // Simulating a book being borrowed
	        library.borrowBook(library.books.get(0), library.borrowers.get(0), "2024-02-29");

	        // Displaying information
	        library.displayBooks();
	        library.displayBorrowers();
	        library.displayTransactions();
	    }
	}


	


