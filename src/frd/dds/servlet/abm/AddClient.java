package frd.dds.servlet.abm;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import frd.dds.cache.ClientCache;
import frd.dds.db.ClientManager;

public class AddClient extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException, ServletException {
		
		ClientManager.createClient(req.getParameter("name"), req.getParameter("address"));
		req.setAttribute("clients", ClientCache.getAll());

    	req.getRequestDispatcher( "index.jsp" ).forward(req, resp);
	}

	public void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws IOException, ServletException {
		
		doGet(req, resp);
	}

}
