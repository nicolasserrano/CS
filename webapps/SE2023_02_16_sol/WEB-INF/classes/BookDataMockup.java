import java.util.Vector;

public class BookDataMockup {
    int    bookId;
    String title;
    String author;
    int    year;
    String imageCode;
    float  unitPrice;
    
    BookDataMockup (int bookId, String title, String author, int year, String imageCode) {
        this.bookId = bookId;
        this.title  = title;
        this.author = author;
        this.year   = year;
        this.imageCode = imageCode;
    }
    public static Vector<BookDataMockup> getBookList() {
        Vector<BookDataMockup> vec = new Vector<BookDataMockup>();
        vec.addElement(new BookDataMockup(1, "Java Servlet Programming: Help for Server Side Java Developers", "Jason Hunter", 2001, "dsU4Lk-Gwk0C"));
        vec.addElement(new BookDataMockup(2, "Java for the Web with Servlets, JSP, and EJB", "Budi Kurniawan", 2002, "ZFplJ5Sjo2oC"));
        vec.addElement(new BookDataMockup(3, "Using Java Server Pages and Servlets", "Mark Wutka", 2000, "REQ2Kw0UZv4C"));
        vec.addElement(new BookDataMockup(4, "Java Servlet & JSP Cookbook: Practical Solutions to Real ...", "Bruce W. Perry", 2004, "j8wSW13lHh4C"));
        vec.addElement(new BookDataMockup(5, "Java Servlets", "Karl Moss", 1999, "ToBGAAAAYAAJ"));
        vec.addElement(new BookDataMockup(6, "Java Servlets Developer's Guide", "Karl Moss", 2002, "eNnYAQAACAAJ"));
        vec.addElement(new BookDataMockup(7, "Java Servlet Programming", "Jason Hunter", 2001, "u9WbAgAAQBAJ"));
        vec.addElement(new BookDataMockup(8, "Java Servlets by Example", "Alan R. Williamson", 1999, "9RIEAAAACAAJ"));
        vec.addElement(new BookDataMockup(9, "Understanding SIP Servlets 1.1", "Chris Boulton", 2009, "6XJEscQGcSwC"));
        vec.addElement(new BookDataMockup(10, "Grid Computing: Techniques and Applications", "Barry Wilkinson", 2009, "vf6h3nbE3owC"));
        vec.addElement(new BookDataMockup(11, "Sun Java 2 Enterprise Edition (J2EE) Web Component Developer ...", "Alain Trottier", 2002, "mTbNYFg9QrwC"));
        vec.addElement(new BookDataMockup(12, "Java Servlets", "Karl Moss", 1998, "aFUPAQAAMAAJ"));
        vec.addElement(new BookDataMockup(13, "Sams Teach Yourself CGI in 24 Hours", "Rafe Colburn", 2003, "GkdEn-VewaQC"));
        vec.addElement(new BookDataMockup(14, "Head First Java", "Kathy Sierra", 2003, "nzhxR1spWEYC"));
        vec.addElement(new BookDataMockup(15, "Enterprise Java Servlets", "Jeff M. Genender", 2002, "MbhQAAAAMAAJ"));
        vec.addElement(new BookDataMockup(16, "Programming with Java", "Khurana Rohit", 2014, "8qFDDAAAQBAJ"));
        vec.addElement(new BookDataMockup(17, "Java Programming with CORBA: Advanced Techniques for ...", "Andreas Vogel", 2001, "Vk3REMF9lIAC"));
        vec.addElement(new BookDataMockup(18, "Instant Java Servlets", "Phil Hanna", 2000, "aYFGAAAAYAAJ"));
        vec.addElement(new BookDataMockup(19, "Jython for Java Programmers", "Robert W. Bill", 2002, "-7MMHfZ8bc8C"));
        vec.addElement(new BookDataMockup(20, "Java 2 Enterprise Edition (J2EE) Web Component Developer Exam", "Alain Trottier", 2002, "wq5E1eVcAE8C"));

        return vec;
    }
    public static BookDataMockup getBook(int i) {
        return getBookList().elementAt(i - 1);
    }
    
}
