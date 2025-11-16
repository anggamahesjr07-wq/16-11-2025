public class LibraryItem {
     String title;
    String publisher;
    int year;

    void printInfo() {
        System.out.println("Title: " + title);
        System.out.println("Publisher: " + publisher);
        System.out.println("Year: " + year);
    }
}

class Book extends LibraryItem {
    String author;
    int pages;

    void displayBook() {
        printInfo();
        System.out.println("Author: " + author);
        System.out.println("Pages: " + pages);
    }
}

class Magazine extends LibraryItem {
    int issueNumber;
    String month;

    void printMagazine() {
        printInfo();
        System.out.println("Issue Number: " + issueNumber);
        System.out.println("Month: " + month);
    }
}

class DigitalMagazine extends Magazine {
    double fileSizeMB;
    String downloadLink;

    void printDigitalMagazine() {
        printMagazine();
        System.out.println("File Size (MB): " + fileSizeMB);
        System.out.println("Download Link: " + downloadLink);
    }
}


    

