package com.learning.hello;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.WebContext;
import org.thymeleaf.templatemode.TemplateMode;
import org.thymeleaf.templateresolver.WebApplicationTemplateResolver;
import org.thymeleaf.web.IWebExchange;
import org.thymeleaf.web.servlet.IServletWebExchange;
import org.thymeleaf.web.servlet.JakartaServletWebApplication;


import com.learning.hello.contoller.TennisController;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/tennis1") //
public class TennisServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	private TennisController tc;
	private JakartaServletWebApplication application;
	private TemplateEngine templateEngine;

	@Override
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		application = JakartaServletWebApplication.buildApplication(getServletContext());
		final WebApplicationTemplateResolver templateResolver = new WebApplicationTemplateResolver(application);
		templateResolver.setTemplateMode(TemplateMode.HTML);
		templateResolver.setPrefix("/WEB-INF/templates/");
		templateResolver.setSuffix(".html");
		templateEngine = new TemplateEngine();
		templateEngine.setTemplateResolver(templateResolver);
		tc = new TennisController();
		
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        final IServletWebExchange webExchange = this.application.buildExchange(req, resp);
        final WebContext ctx = new WebContext(webExchange);

        String buttonId = req.getParameter("btn");
        if (buttonId != null) {

            String player_id = req.getParameter("player_id");
            String player_name = req.getParameter("player_name");

            try {
                tc.savePlayer(player_id, player_name);
            } catch (SQLException e) {
                e.printStackTrace();
            }

            ResultSet rs = tc.getPlayers();
            try {
                while (rs.next()) {
                    //System.out.println("Here");
                    ctx.setVariable("Id" , rs.getString("palyer_id"));
                    ctx.setVariable("Content" , rs.getString("player_name"));

                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            var out = resp.getWriter();

            templateEngine.process("tennis1", ctx, out);
    }

    }
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		final IWebExchange webExchange = this.application.buildExchange(req, resp);
		final WebContext ctx = new WebContext(webExchange);
        templateEngine.process("tennis1", ctx, resp.getWriter());
        resp.sendRedirect("tennis2.html");
	}

}

