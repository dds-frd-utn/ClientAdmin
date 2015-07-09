package frd.dds.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import frd.dds.cache.ClientCache;

public class Index extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException, ServletException {
		
		req.setAttribute("clients", ClientCache.getAll());
		
    	req.getRequestDispatcher( "index.jsp" ).forward(req, resp);
	}

}
