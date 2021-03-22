package pl.javastart.test;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

@WebServlet("")

public class testButtonController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws  IOException {
        String text = "some text";

        response.setContentType("text/plain");  // Set content type of the response so that jQuery knows what it can expect.
        response.setCharacterEncoding("UTF-8"); // You want world domination, huh?
        response.getWriter().write(text);       // Write response body.
        //ustaw najpierw contex, a potem go odeslij

        response.sendRedirect(request.getContextPath());

    }
    private String createExampleText(){
        ServletContext context = (ServletContext) getServletContext();
        String exampleText= "testtesttest";
        context.setAttribute("exampleText", exampleText);
        return exampleText;
    }
}
