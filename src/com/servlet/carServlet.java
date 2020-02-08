package com.servlet;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.entity.Car;

/**
 * Servlet implementation class carServlet
 */
@WebServlet("/carServlet")
public class carServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public carServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession(true);
		
	ArrayList<Car> cars = (ArrayList <Car>) session.getAttribute("cars");
	if(cars == null) {
		cars = new ArrayList<Car>();
	}
	
	Car car = new Car();
	car.setMake(request.getParameter("make"));
	car.setMileage(request.getParameter("mileage"));
	car.setPrice(request.getParameter("price"));
	car.setYear(request.getParameter("year"));
	
	
	cars.add(car);
	
	try {
		File file = new File("C:/Users/Computer/Documents/CarSales");
		FileWriter fw = new FileWriter(file);
		BufferedWriter bw = new BufferedWriter(fw);
		
		bw.write(cars.toString());
		bw.close();
		
	}catch (IOException e) {
		e.printStackTrace();
	}
	session.setAttribute("car", car);

	
	 RequestDispatcher rs =request.getRequestDispatcher("Carsales.jsp");
	    rs.forward(request, response);
	
	
	}
	
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
