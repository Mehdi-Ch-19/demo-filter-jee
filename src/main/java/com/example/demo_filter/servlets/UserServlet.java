package com.example.demo_filter.servlets;

import com.example.demo_filter.model.User;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.util.List;
import java.util.Objects;

@WebServlet(name = "UserServlet", value = "/UserServlet")
public class UserServlet extends HttpServlet {
    List<User> list = List.of(new User("mehdi","chiheb"),new User("mohamed","bobkir"));
    public User getUserByUsernameAndPassword(String un,String pw){
        User user = null;
        for(User u : list){
            if (Objects.equals(u.getUsername(), un) && Objects.equals(u.getPassword(), pw)){
                user.setPassword(pw);
                user.setUsername(un);
                break;
            }

        }
        return user;
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username =  request.getParameter("un");
        String password =  request.getParameter("pw");

        System.out.println((String) request.getParameter("un") );
        if (Objects.equals(username, "mehdi") && Objects.equals(password, "chiheb")){
            HttpSession session = request.getSession();
            session.setAttribute("username",request.getParameter("un"));
            response.sendRedirect("pageprotected.jsp");
        }
        else {
            response.sendRedirect("userautj.jsp");
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request,response);
    }
}
