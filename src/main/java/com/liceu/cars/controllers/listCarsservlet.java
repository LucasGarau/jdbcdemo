package com.liceu.cars.controllers;

import com.liceu.cars.daos.CarDAO;
import com.liceu.cars.daos.cardDAOOBJECTimplm;
import com.liceu.cars.model.Car;
import com.liceu.cars.model.Carservice;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(value ="/liscars")
public class listCarsservlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Carservice cs = new Carservice();
        req.setAttribute("cars",cs.getAll());
        RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/jsp/List Cars.jsp");
        dispatcher.forward(req,resp);
    }
}
