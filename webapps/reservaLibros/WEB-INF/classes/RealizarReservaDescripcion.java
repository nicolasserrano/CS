import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;

class Libro {
    String codigo;
    String titulo;
    String autor;
}

public class RealizarReservaDescripcion extends HttpServlet {
    public static final long serialVersionUID = 1L;

    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException  {

        Vector<Libro> listaLibros = new Vector<Libro>();
        HttpSession session = req.getSession(true);
        
        Vector<String> vec = (Vector<String>)session.getAttribute("lista");
        String user = (String)session.getAttribute("user");
    
        if (vec == null) { 
            vec = new Vector<String>();
        } 
        String[] valueArray = req.getParameterValues("libro");
        if (valueArray != null) {
            for (int i=0;i<valueArray.length;i++) {
                String value = valueArray[i];
                vec.addElement(value);
            }
        }
        session.setAttribute("lista", vec);

        //Leemos los libros del fichero

        File file = new File("lista.txt");
        Scanner scanner = new Scanner(file);
    //    BufferedReader input = new BufferedReader(new FileReader(file));
        String line = null;
        while (scanner.hasNext()) {
            line = scanner.nextLine();
            Scanner lineSc = new Scanner(line);
            lineSc.useDelimiter("\t");
            Libro libro = new Libro();
            try {
                libro.codigo = lineSc.next();
                libro.titulo = lineSc.next();
                libro.autor = lineSc.next();
                listaLibros.addElement(libro);
            } catch (NoSuchElementException ex) {
                System.out.println("Error en leer libros de fichero " + ex);
            }

        }


        //Leemos los codigos de los libros que haya seleccionado   

        res.setContentType("text/html");
        PrintWriter toClient = res.getWriter();
        
        toClient.println("<html>");
        toClient.println("<title>Reservas</title>");
        toClient.println("<body>");
        toClient.println("<H2>Reservas de " + (user == null ? session.getId() : user) + "</H2>");
        toClient.println("<table border=\"1\">");
        
        for (int i= 0; i < vec.size() ; i++ ) {
            toClient.println("<tr>");            
            toClient.println("<td>" + vec.elementAt(i) + "</td>");
            for (int j= 0; j < listaLibros.size() ; j++ ) {
                if (vec.elementAt(i).compareTo(listaLibros.elementAt(j).codigo) == 0) {
                    toClient.println("<td>" + listaLibros.elementAt(j).titulo + "</td>");
                    toClient.println("<td>" + listaLibros.elementAt(j).autor + "</td>");
                }
            }
            toClient.println("</tr>");
        }
        toClient.println("</table>");
        toClient.println("<BR><a href=\"menu.html\">Ir al menu</a>");
        toClient.println("</body>");
        toClient.println("</html>");
        toClient.close();
    }
}