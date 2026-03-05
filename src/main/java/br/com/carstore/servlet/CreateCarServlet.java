package br.com.carstore.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet ("/create-car")
public class CreateCarServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        // Captura o nome do carro vindo do formulário
        String carName = request.getParameter("car-name");

        // Configura o cabeçalho para JSON
        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");

        // Monta a string no formato JSON
        String jsonResponse = "{\"message\": \"Carro recebido com sucesso!\", \"carName\": \"" + carName + "\"}";

        // Envia a resposta de volta
        response.getWriter().write(jsonResponse);
    }
}
