//package com.ganesh.designpatterns.mvc;
//
///*
//import java.io.IOException;
//import javax.servlet.RequestDispatcher;
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
// */
//
//import java.io.IOException;
//
//@WebServlet("/greatestController")
//public class GreatestController extends HttpServlet{
//    private static final long serialVersionUID = 1L;
//
//    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        int number1 = Integer.parseInt(request.getParameter("number1"));
//        int number2 = Integer.parseInt(request.getParameter("number2"));
//        GreaterNumberModel greaterNumberModel = new GreaterNumberModel();
//        int findGreater = greaterNumberModel.findGreater(number1,number2);
//
//        request.setAttribute("greaterNumber",findGreater);
//        RequestDispatcher requestDispatcher= request.getRequestDispatcher("gereaterresult.jsp");
//        requestDispatcher.forward(request.response);
//    }
//}
//
//<%@ page language="java" contentType="text/html;
//        charset=ISO-8859-1"
//        pageEncoding="ISO-8859-1"%>
//<!DOCTYPE html>
//<html>
//<head>
//<meta charset="ISO-8859-1">
//<title>Greater Number</title>
//</head>
//<body>
//<%
//        int greater = (Integer)
//        request.getAttribute("greaterNumber");
//        out.println("Greater of two numbers is :" + greater);
//        %>
//</body>
//</html>
