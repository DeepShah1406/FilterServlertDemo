/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Filter.java to edit this template
 */

import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.HttpServletResponse;

/**
 *
 * @author 2student100
 */
public class LogInFilter implements Filter
{
    
    
    public void doFilter(ServletRequest request, ServletResponse response,
            FilterChain chain)
            throws IOException, ServletException
    {
        String userid = request.getParameter("userid");
        String password = request.getParameter("password");
        
        if (userid.equals("admin") && password.equals("admin"))
            {
                chain.doFilter(request,response);
            }
        else
        {
            ((HttpServletResponse)response).sendRedirect("index.html");
        }
    }
}
