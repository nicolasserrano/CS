import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.Connection;

@SuppressWarnings("serial")
public class CategoryJSONList extends HttpServlet {
    Connection connection;

    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        connection = ConnectionUtils.getConnection(config);
    }

    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException  {
        res.setContentType("text/html");
        PrintWriter toClient = res.getWriter();
        String categoryId = req.getParameter("id");

        toClient.println(Utils.header("Categories (JSON)"));
        toClient.print("<div id='list'></div>");
        printCategoryJSON(toClient, connection);
        toClient.println("<script src='createCategoryTable.js'></script>");
        toClient.println(Utils.footer("Categories"));
        toClient.close();
    }

    public static void printCategoryJSON(PrintWriter toClient, Connection connection) {
        Vector<CategoryData> categoryList;
        categoryList = CategoryData.getCategoryList(connection);
        toClient.print("<script>data=[");
        for(int i=0; i< categoryList.size(); i++){
            if (i!=0) {
                toClient.print(",");
            }
            CategoryData category = categoryList.elementAt(i);
             toClient.print("{");
            toClient.print("\"categoryId\":\"" + category.categoryId + "\"");
            toClient.print(",\"categoryName\":\"" + category.categoryName + "\"");
            toClient.print(",\"description\":\"" + category.description + "\"");
            toClient.print("}");
        }
        toClient.println("]</script>");
    }
}
