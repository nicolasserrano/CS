import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class MostrarLibrosCheck extends HttpServlet {
    public static final long serialVersionUID = 3L;
    String fileName;
         
    // Este m�todo se ejecuta una �nica vez (al ser inicializado el servlet)
    // Se suelen inicializar variables y realizar operaciones costosas en 
    // tiempo de ejecuci�n (abrir ficheros, bases de datos, etc) 
    public void init(ServletConfig config) throws ServletException {
        // Llamada al m�todo init() de la superclase (GenericServlet)
        // As� se asegura una correcta inicializaci�n del servlet
        super.init(config);
        System.out.println("Iniciando MostrarLibrosCheck...");
        fileName = config.getServletContext().getRealPath("lista.txt");
    } // fin del m�todo init()
                
    // Este m�todo es llamado por el servidor web al "apagarse" (al hacer shutdown). 
    // Sirve para proporcionar una correcta desconexi�n de una base de datos, cerrar ficheros abiertos, etc.
    public void destroy() {
        System.out.println("No hay nada que hacer...");
    } // fin del m�todo destroy()
                    
    // M�todo llamado mediante un HTTP GET. Este m�todo se llama autom�ticamente al ejecutar un formulario HTML
    public void doGet (HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // Adquisici�n de los valores del formulario a trav�s del objeto req
        // Devolver al usuario una p�gina HTML con los valores adquiridos
        devolverPaginaHTML(resp);
    } // fin del m�todo doPost()
        
    public void devolverPaginaHTML(HttpServletResponse resp) 
            throws IOException {
        // Se establece el tipo de contenido MIME de la respuesta
        resp.setContentType("text/html");

        // Se obtiene un PrintWriter donde escribir (s�lo para mandar texto)
        PrintWriter out = null;
        try {
            out=resp.getWriter();
        } catch (IOException io) {
            System.out.println("Se ha producido una excepcion");        
        }
                
        // Se genera el contenido de la p�gina HTML
        out.println("<HTML>");
        out.println("<HEAD>");
        out.println("<TITLE>Valores recogidos en el formulario</TITLE>");
        out.println("</HEAD>");
        out.println("<BODY>");
        out.println("<B><FONT size=+2>Valores recogidos del formulario: </FONT></B>");

        File file = new File(fileName);
        Scanner scanner = new Scanner(file);
//        BufferedReader input = new BufferedReader(new FileReader(file));
        String line = null;
        String strout = "";
        strout += "<form action=\"RealizarReserva\" method=GET>";
        strout += "<TABLE border=1>";
        strout += "<TR>";
        strout += "<TH>";
        strout += "&nbsp;";
        strout += "</TH>";
        strout += "<TH>";
        strout += "Codigo";
        strout += "</TH>";
        strout += "<TH>";
        strout += "Titulo";
        strout += "</TH>";
        strout += "<TH>";
        strout += "Autor";
        strout += "</TH>";
        strout += "</TR>";
        while (scanner.hasNext()) {
                line = scanner.nextLine();
                Scanner lineSc = new Scanner(line);
                lineSc.useDelimiter("\t");
                String codigo = lineSc.next();
                String titulo = lineSc.next();
                String autor = lineSc.next();
                strout += "<TR>";
                strout += "<td><input TYPE=\"checkbox\" NAME=\"libro\" VALUE=\"" + codigo + "\"></td>";
                strout += "<TD>";
                strout += codigo;
                strout += "</TD>";
                strout += "<TD>";
                strout += titulo;
                strout += "</TD>";
                strout += "<TD>";
                strout += autor;
                strout += "</TD>";
                strout += "</TR>";
        }
        strout += "</TABLE>";
        strout += "<input type=submit>";
        strout += "</FORM>";
        out.println(strout);
        out.println("<BR><a href=\"menu.html\">Ir al menu</a>");
        out.println("</BODY>");
        out.println("</HTML>");

        // Se fuerza la descarga del buffer y se cierra el PrintWriter, liberando recursos de esta forma. IMPORTANTE
        out.flush();
        out.close();
    } // fin de devolverPaginaHTML()
         
    // Funci�n que permite al servidor web obtener una descripci�n del servlet:
    public String getServletInfo() {
        return "Este servlet lee los datos de un formulario y los muestra en pantalla";
    } // fin del m�todo getServletInfo()
}
