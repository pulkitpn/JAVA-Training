package com.genpact.day14;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;

/**
 * Servlet Filter implementation class MyFilter
 */
@WebFilter("/MyFilter")
public class MyFilter extends HttpFilter implements Filter {
       
	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public void init(FilterConfig fc) throws ServletException {}
	    
	    public void doFilter(ServletRequest request, ServletResponse response,
	            FilterChain chain) throws IOException, ServletException {
	    	
	        PrintWriter out = response.getWriter();
	        String pass = request.getParameter("pass");
	        
	        if(pass.equals("1234"))
	        {
	            chain.doFilter(request, response);  
	        }
	        else
	        {
	            out.println("You have enter a wrong password");
	            RequestDispatcher rs = request.getRequestDispatcher("index.html");
	            
	            rs.include(request, response);
	            
	        }
	    }
	   public void destroy() { }

}
