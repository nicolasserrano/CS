import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.Connection;

@SuppressWarnings("serial")
public class UpdateSupplier extends HttpServlet {
    Connection connection;

    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        connection = ConnectionUtils.getConnection(config);
    }

    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException  {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        String id = req.getParameter("id");
        String city = req.getParameter("city");
        if (city != null) {
            System.out.println("city: " + city);
            if (city.equals("Other")) {
                city = req.getParameter("other");
            }
            SupplierDatabase supplier = new SupplierDatabase(
                        id,
                        req.getParameter("companyName"),
                        city,
                        req.getParameter("country"),
                        req.getParameter("postalCode")
                    );
            int n = SupplierDatabase.UpdateSupplier(connection, supplier);
            res.sendRedirect("SuppliersList");
        } else {
            System.out.println("id: " + id);
            int n = SupplierDatabase.UpdateSupplierName(connection, id, req.getParameter("companyName"));
            SupplierDatabase supplier = SupplierDatabase.getSupplier(connection, id);
            String jsonObject = "{\"id\":" + id + ",\"companyName\":\"" + supplier.companyName + "\"}";
            out.print(jsonObject);
        }
        //out.println(id);
    }
}