package com.example.demo_filter.filters;

import com.example.demo_filter.model.User;
import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.util.List;
import java.util.Objects;

@WebFilter(filterName = "AuthFilter",value = "/pageprotected.jsp")
public class AuthFilter implements Filter {



    public void init(FilterConfig config) throws ServletException {
    }

    public void destroy() {
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws ServletException, IOException {
        HttpServletRequest re = (HttpServletRequest) request;
        HttpServletResponse rs = (HttpServletResponse)response;
        HttpSession session = re.getSession(false);
        if(session == null ) {
            rs.sendRedirect("userautj.jsp");
        }else {
            chain.doFilter(request, response);

        }
    }
}
