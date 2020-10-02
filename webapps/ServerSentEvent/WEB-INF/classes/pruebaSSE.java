import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class pruebaSSE extends HttpServlet {
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{		
	
		// Set response content type
        response.setContentType("text/event-stream");
		response.setCharacterEncoding("UTF-8");

        PrintWriter out = null;
		
        try {
            out = response.getWriter();
        } catch (IOException io) {
            System.out.println("Exception creating PrintWriter");
        }
		
		int val = 0;
		System.out.println("Msg: Ha entrado en el doGet");
		
		// Create new event data every 3 seconds
		while(true){
			System.out.println("Msg: Ha entrado en el bucle");
			val++;
			String next = "data: " + String.valueOf(val) + "\n\n";
			System.out.println(next);
			out.write(next);
			out.flush();
			try{
				Thread.sleep(3000);
			}
			catch(InterruptedException ex)
			{
				Thread.currentThread().interrupt();
			}
		}

	}
		
		
		
}