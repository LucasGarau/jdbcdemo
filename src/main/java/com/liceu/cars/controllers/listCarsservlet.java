package com.liceu.cars.controllers;

import com.liceu.cars.daos.CarDAO;

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
CarDAO cd=new cardDAOOBJECTimplm();
List<Car> cars = cd.getAll();
        RequestDispatcher dispatcher = req.getRequestDispatcher("//");
        dispatcher.forward(req,resp);
    }
}
