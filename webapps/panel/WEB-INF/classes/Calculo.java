import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Calculo extends HttpServlet {

    public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException  {
        doGet(req, res);
    }


    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException  {
        res.setContentType("text/html");
        PrintWriter toClient = res.getWriter();
        String filasStr = req.getParameter("filas");
        String columnasStr = req.getParameter("columnas");
        int filas = Integer.parseInt(filasStr);
        int columnas = Integer.parseInt(columnasStr);


        System.out.println("Filas: " + filas + " Columnas: " + columnas);
        PanelWeb panel = new PanelWeb(filas, columnas);

        int k = 0;
        for (int i = 0;i < filas ; i++) {
            for (int j = 0;j < columnas ; j++) {
                String valorStr = req.getParameter("celda" + k);
                if (!valorStr.equals("")) {
                    System.out.println("Dato en fila: " + i + " Columna: " + j + " = " + valorStr);
                    panel.setTemperatura(i, j, Integer.parseInt(valorStr));
                }
                k++;
            }
        }

//      panelTest.output();
        panel.crearEcuaciones();
        String salida = panel.outputHTML();

        toClient.println("<html>");
        toClient.println("<title>Resultado de temperaturas del panel</title>");
        toClient.println("<body>");
        toClient.println(salida);
        toClient.println("</body>");
        toClient.println("</html>");
        toClient.close();
    }
}