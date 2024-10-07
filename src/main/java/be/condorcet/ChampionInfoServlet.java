package be.condorcet;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet("/ChampionInfoServlet")
public class ChampionInfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private String nomChampion;
	private String roleChampion;
	private String difficulteChampion;
	
	
    
    public ChampionInfoServlet() {
        super();
      
    }
    
    @Override
    public void init() throws ServletException  {
    	super.init();
    	ServletConfig config = getServletConfig();
    	nomChampion = config.getInitParameter("nomChampion");
    	roleChampion = config.getInitParameter("roleChampion");
    	difficulteChampion = config.getInitParameter("difficulteChampion");
    	
    	
   
    	
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");

        
        PrintWriter out = response.getWriter();

        
        out.println("<html>");
        out.println("<head><title>Informations sur le Champion</title></head>");
        out.println("<body>");
        out.println("<h1>Champion Information</h1>");
        out.println("<p><strong>Nom :</strong> " + nomChampion + "</p>");
        out.println("<p><strong>Rôle :</strong> " + roleChampion + "</p>");
        out.println("<p><strong>Difficulté :</strong> " + difficulteChampion + "</p>");
        out.println("</body>");
        out.println("</html>");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
