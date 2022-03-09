import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class RegistroLibro extends HttpServlet {
    public static final long serialVersionUID = 2L;
    String fileName;
         
    // Este método se ejecuta una única vez (al ser inicializado el servlet)
    // Se suelen inicializar variables y realizar operaciones costosas en 
    // tiempo de ejecución (abrir ficheros, bases de datos, etc) 
    public void init(ServletConfig config) throws ServletException {
        // Llamada al método init() de la superclase (GenericServlet)
        // Así se asegura una correcta inicialización del servlet
        super.init(config);
        System.out.println("Iniciando RegistroLibro...");
        fileName = config.getServletContext().getRealPath("lista.txt");
    } // fin del método init()
                
    // Este método es llamado por el servidor web al "apagarse" (al hacer shutdown). 
    // Sirve para proporcionar una correcta desconexión de una base de datos, cerrar ficheros abiertos, etc.
    public void destroy() {
        System.out.println("No hay nada que hacer...");
    } // fin del método destroy()
                    
    // Método llamado mediante un HTTP POST. Este método se llama automáticamente al ejecutar un formulario HTML
    public void doGet (HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // Adquisición de los valores del formulario a través del objeto req
        String strCodigo = req.getParameter("codigo");
        String strAutor = req.getParameter("autor");
        String strTitulo = req.getParameter("titulo");
                                 
        FileWriter fileWriter = new FileWriter(fileName, true);
        PrintWriter toFile = new PrintWriter(fileWriter);
        toFile.println(strCodigo + "\t" + strTitulo + "\t" + strAutor);
        fileWriter.close();
        // Devolver al usuario una página HTML con los valores adquiridos
        devolverPaginaHTML(resp, strCodigo, strTitulo, strAutor);
    } // fin del método doPost()
        
    public void devolverPaginaHTML(HttpServletResponse resp,
        String codigo, String titulo, String autor) {
        // Se establece el tipo de contenido MIME de la respuesta
        resp.setContentType("text/html");

        // Se obtiene un PrintWriter donde escribir (sólo para mandar texto)
        PrintWriter out = null;
        try {
            out=resp.getWriter();
        } catch (IOException io) {
            System.out.println("Se ha producido una excepcion");        
        }
                
        // Se genera el contenido de la página HTML
        out.println("<HTML>");
        out.println("<HEAD>");
        out.println("<TITLE>Valores recogidos en el formulario</TITLE>");
        out.println("</HEAD>");
        out.println("<BODY>");
        out.println("<B><FONT size=+2>Valores recogidos del formulario: </FONT></B>");
        out.println("<P><FONT size=+1><B>Codigo: </B>" + codigo + "</FONT>");
        out.println("<BR><FONT size=+1><B>Autor: </B>" + autor + "</FONT>");
        out.println("<P><FONT size=+1> <B>T&iacute;tulo: </B><I>" + titulo + "</I></FONT>");
        out.println("</BODY>");
        out.println("<BR><a href=\"menu.html\">Ir al menu</a>");

        out.println("</HTML>");

        // Se fuerza la descarga del buffer y se cierra el PrintWriter, liberando recursos de esta forma. IMPORTANTE
        out.flush();
        out.close();
    } // fin de devolverPaginaHTML()
         
    // Función que permite al servidor web obtener una descripción del servlet:
    public String getServletInfo() {
        return "Este servlet lee los datos de un formulario y los muestra en pantalla";
    } // fin del método getServletInfo()
}
