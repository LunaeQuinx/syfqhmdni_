import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        // Example: Check if credentials are valid (replace with your authentication logic)
        if (isValidCredentials(username, password)) {
            // Valid credentials, redirect to main page or do further processing
            response.sendRedirect("mainpage.html");
        } else {
           response.sendRedirect("index.html?error=1");
        }
    }

    private boolean isValidCredentials(String username, String password) {
        // Perform your authentication logic here
        // For demonstration purposes, hardcoding valid credentials
        return username.equals("SyfqHmdni") && password.equals("1234");
    }
}
