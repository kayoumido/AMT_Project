package underflowers.stackunderflow.ui.web.login;

import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(name = "LoginServlet", urlPatterns = "/login")
public class LoginServlet extends javax.servlet.http.HttpServlet {

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        Object errors = request.getSession().getAttribute("errors");
        request.setAttribute("errors", errors);
        request.getSession().removeAttribute("errors");

        request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);
    }
}
