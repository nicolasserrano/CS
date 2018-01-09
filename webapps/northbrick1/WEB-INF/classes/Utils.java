        
        /*
        HttpSession session = Utils.loginSecurity(req);
        if (session != null) {
            resp.sendRedirect("bookList");
            return;
        }
        */
public class Utils {
    public static String header(String title) {
        StringBuilder str = new StringBuilder();
        str.append("<!DOCTYPE HTML>");
        str.append("<html>");
        str.append("<head><title>" + title + "</title>");
        str.append("<link rel='stylesheet' href='style.css'>");
        str.append("</head>");
        str.append("<body>");
        str.append("<div class='menu'>");
        str.append("<a href='ProductListMockup'>Home</a>");
        str.append("<a href='ProductList'>Products</a>");
        str.append("<a href='ProductEdit?id=4'>Last product</a>");
        str.append("<a href='#'>Orders</a>");
        str.append("<a href='OrderEdit?id=10273'>Last order</a>");
        str.append("</div>");
        str.append("<H2 align=\"center\">" + title + "</H2>");
        return str.toString();
    }

    public static String footer(String title) {
        StringBuilder str = new StringBuilder();
        str.append("</body>");
        str.append("</html>");
        return str.toString();
    }
}