package com.evry.healthcare.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Servlet implementation class AppointmentController
 */
public class AppointmentController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		Appointment appointment = new Appointment();
		appointment.setPid(Integer.parseInt(request.getParameter("pid")));
		appointment.setName(request.getParameter("name"));
		appointment.setAge(Integer.parseInt(request.getParameter("age")));
		appointment.setBlood_group(request.getParameter("bgroup"));
		appointment.setCheckup(request.getParameter("checkup"));
		appointment.setDoctor(request.getParameter("doctor"));
		appointment.setTests(request.getParameter("test"));
		session.save(appointment);
		tx.commit();
		System.out.println("Done");
		factory.close();
		session.close();

	}

/*	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}*/

}
