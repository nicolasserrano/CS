import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class ShoppingCart extends HttpServlet {
	
  public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	  
    res.setContentType("text/html");
    PrintWriter out = res.getWriter();
    
    out.println("<HEAD><TITLE>Current Shopping Cart Items</TITLE></HEAD>");
    out.println("<BODY>");
    
    // Cart items are passed in as the item parameter.
    String[] items = req.getParameterValues("item");
    
    // Print the current cart items.
    out.println("Actualmente tiene los siguientes artículos en su compra:<BR>");
    if (items == null) {
      out.println("<B>None</B>");
    }
    else {
      out.println("<UL>");
      for (int i = 0; i < items.length; i++) {
        out.println("<LI>" + items[i]);
      }
      out.println("</UL>");
    }
    
    // Ask if the user wants to add more items or check out.
    // Include the current items as hidden fields so they'll be passed on.
    out.println("<FORM ACTION=\"ShoppingCart\" METHOD=GET>");
    if (items != null) {
      for (int i = 0; i < items.length; i++) {
        out.println("<INPUT TYPE=HIDDEN NAME=\"item\" VALUE=\"" +
          items[i] + "\">");
      }
    }
    out.println("Añada un nuevo artículo:<BR>");
    out.println("<INPUT NAME=\"item\" ><BR>");
    out.println("<INPUT TYPE=SUBMIT VALUE=\" Añadir \">");
    out.println("</FORM>");
    out.println("</BODY></HTML>");
  }
}
