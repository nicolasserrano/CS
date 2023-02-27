import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class BookList extends HttpServlet {

    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException  {
        res.setContentType("text/html");
        PrintWriter toClient = res.getWriter();
        toClient.println(Utils.header("Books"));
        toClient.println("<table border='1'>");
        Vector<BookDataMockup> bookList = BookDataMockup.getBookList();
        for(int i=0; i< bookList.size(); i++){
        	BookDataMockup book = bookList.elementAt(i);
            toClient.println("<tr>");
            toClient.println("<td><img src='https://books.google.com/books/content?printsec=frontcover&img=1&zoom=1&id=" + book.imageCode + "' />");
            toClient.println("<div>&nbsp</div></td>");
            //toClient.println("<div><a  href='https://books.google.com/books/content?printsec=frontcover&img=1&zoom=3&id=" + book.imageCode + "' target='_blank'>Zoom</a></div></td>");
            toClient.println("<td><h3>" + book.title + " </h3>");
            toClient.println("<div>" + book.author + " </div>");
            toClient.println("<div>" + book.year + " </div></td>");
            toClient.println("</tr>");
        }


        toClient.println("</table>");
        toClient.println(Utils.footer("Books"));
        toClient.close();
    }
}
