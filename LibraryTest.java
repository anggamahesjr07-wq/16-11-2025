 public class LibraryTest {
     public static void main(String[] args) {
        System.out.println("=== Book Info ===");
        Book b1 = new Book();
        b1.title = "Pemrograman Java Dasar";
        b1.publisher = "Informatika Press";
        b1.year = 2024;
        b1.author = "Fikri Maulana";
        b1.pages = 250;
        b1.displayBook();

        System.out.println("=== Digital Magazine Info ===");
        DigitalMagazine dm1 = new DigitalMagazine();
        dm1.title = "TechWorld";
        dm1.publisher = "Digital Media";
        dm1.year = 2025;
        dm1.issueNumber = 12;
        dm1.month = "Oktober";
        dm1.fileSizeMB = 45.8;
        dm1.downloadLink = "www.techworld.com/download";
        dm1.printDigitalMagazine();
    }
}


    
