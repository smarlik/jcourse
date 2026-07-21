package day11;

import java.util.HashMap;
import java.util.Map;

public class LibraryCatalogue {

    Map<String, Book> bookCollection = new HashMap<String, Book>();
    int currentDay = 0;
    int lengthOfCheckoutPeriod = 7;
    double initialLateFee = 0.50;
    double feePerLateDay = 1.00;

    public LibraryCatalogue(Map<String, Book> collection) {
        this.bookCollection = collection;
    }

    public LibraryCatalogue(Map<String, Book> collection, int lengthOfCheckoutPeriod,
            double initialLateFee, double feePerLateDay) {
        this.bookCollection = collection;
        this.lengthOfCheckoutPeriod = lengthOfCheckoutPeriod;
        this.initialLateFee = initialLateFee;
        this.feePerLateDay = feePerLateDay;
    }

    public int getCurrentDay() {
        return this.currentDay;
    }

    public Map<String, Book> getBookCollection() {
        return this.bookCollection;
    }

    public Book getBook(String bookTitle) {
        return getBookCollection().get(bookTitle);
    }

    public int getLengthOfCheckoutPeriod() {
        return this.lengthOfCheckoutPeriod;
    }

    public double getInitialLateFee() {
        return this.initialLateFee;
    }

    public double getFeePerLateDay() {
        return this.feePerLateDay;
    }

    public void nextDay() {
        currentDay++;
    }

    public void setDay(int day) {
        currentDay = day;
    }

    public void checkOut(String title) {
        Book book = getBook(title);
        if(book.getIsCheckedOut()) {
            sorryBookAlreadyCheckedOut(book);
        } else {
            book.setIsCheckedOut(true, currentDay);
            System.out.println("just checked out " + title + " its due on day "
            + (getCurrentDay()+ getLengthOfCheckoutPeriod())+".");
        }
    }

    public void returnBook(String title) {
        Book book = getBook(title);
        int daysLate = currentDay - (book.getDayCheckedOut() + getLengthOfCheckoutPeriod());
        if (daysLate > 0) {
            System.out.println("you owe $" + (getInitialLateFee() + daysLate * getFeePerLateDay()) + 
            " because your book is "+ daysLate+ " days late.");
        } else {
            System.out.println("book returned. thanks.");
        }
        book.setIsCheckedOut(false, -1);
    }

    public void sorryBookAlreadyCheckedOut(Book book) {
        System.out.println("sorry, "+book.getTitle() + " is checked out."
        + " it should be back on day " + (book.getDayCheckedOut()+getLengthOfCheckoutPeriod())+".");
    }

    public static void main(String[] args) {
        Map<String, Book> bookCollection = new HashMap<String,Book>();
        Book hobbit = new Book("The Hobbit", 300, 11111111);
        bookCollection.put("The Hobbit", hobbit);
        LibraryCatalogue lib = new LibraryCatalogue(bookCollection);
        lib.checkOut("The Hobbit");
        lib.nextDay();
        lib.nextDay();
        lib.checkOut("The Hobbit");
        lib.setDay(17);
        lib.returnBook("The Hobbit");
        lib.checkOut("The Hobbit");
    }
}