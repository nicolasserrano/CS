import java.sql.*;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Calendar;

class JDBC_Date {
    public static void main(String args[]) throws ClassNotFoundException, SQLException {
        Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
        String file = "northbrick.mdb";
        String url=new String("jdbc:odbc:Driver={Microsoft Access Driver (*.mdb)};Dbq=" + file + "");
        Connection connection = DriverManager.getConnection(url);
        
        Statement stmt = connection.createStatement();
        String sql = "SELECT Orders.OrderDate as date1,"
                         + " Orders.OrderDate as date2, *";
            sql +=  " FROM Orders";
            sql +=  " WHERE (OrderDate>=#5/1/1997#"   // from May 1st
                  + "   AND  OrderDate<=#5/7/1997#)"; // to   May 7th
        System.out.println("SQL: " + sql);
        ResultSet rs = stmt.executeQuery(sql);
        String date1 = null;
        java.sql.Date date2 = null;
        while(rs.next()) {
            String orderId = rs.getString("orderId");
            date1 = rs.getString("date1");
            date2 = rs.getDate("date2");
            System.out.println(orderId + " " + date1 + " " + date2);
        }
        String pattern = "dd-MM-yyyy hh:mm:ss";  // european format
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        String date3 = simpleDateFormat.format(date2);
        System.out.println("date3: " + date3);
        
        java.util.Date date4 = null;
        try {
            date4 = new SimpleDateFormat("yyyy-MM-dd").parse(date1); 
            System.out.println("date4: " + date4);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        Calendar calendar = Calendar.getInstance(); // creates a Gregorian Calendar
        calendar.setTime(date2);
        calendar.add(Calendar.HOUR_OF_DAY, 8);  // add 8 hours
        calendar.add(Calendar.MINUTE, 28);      // and 28 minutes
        //System.out.println("Calendar: " + calendar);  // Calendar info
        java.util.Date date5 = calendar.getTime();
        System.out.println("date 5: " + date5);
        String date6 = simpleDateFormat.format(date5);
        System.out.println("date 6: " + date6);
    
        String pattern2 = "MM/dd/yyyy hh:mm:ss";  // Access format
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat(pattern2);
        String date7 = simpleDateFormat2.format(date5);
        System.out.println("date 7: " + date7);

        Statement stmt2 = connection.createStatement();
        String sql2 = "UPDATE Orders SET Orders.RequiredDate = "
            + "#" + date7 + "#"  // with other format works wrong with days > 12
            + " WHERE (((Orders.OrderID)=10249))";
        System.out.println("SQL2: " + sql2);
        int n = stmt2.executeUpdate(sql2);
        System.out.println("Updated: " + n);
        
        rs.close();
        stmt.close();
        connection.close();
    }
}