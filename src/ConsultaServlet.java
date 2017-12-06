

import java.io.IOException;
import java.io.PrintWriter;
import java.util.StringTokenizer;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;

import DataAcessObjects.BebidaDAO;
import DataAcessObjects.PizzaDAO;
import DataAcessObjects.SobremesaDAO;
import DataAcessObjects.UsuarioDAO;
import Entidades.Bebida;
import Entidades.Pizza;
import Entidades.Sobremesa;
import Entidades.Usuario;

/**
 * Servlet implementation class ConsultaServlet
 */
@WebServlet("/ConsultaServlet")
public class ConsultaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ConsultaServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {		
		PrintWriter out = response.getWriter();
		//out.write("<%@ page language=\"java\" contentType=\"text/html; charset=ISO-8859-1\"");
		//out.write("    pageEncoding=\"ISO-8859-1\"%>");
		//out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">");
		out.write("<html>");
		out.write("<head>");
		out.write("<style>@import \"estilo.css\"; </style>");
		out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">");
		out.write("<title>Resultado da Busca</title>");
		out.write("</head>");
		out.write("<body>");
		
		String query = request.getParameter("usuario");
		String tipo = request.getParameter("submit");
		
		StringTokenizer st = new StringTokenizer(tipo);
		st.nextToken();
		String resposta = st.nextToken();
		
		if(resposta.equals("Usuario")){
			UsuarioDAO udao = UsuarioDAO.getInstance();
			Usuario u = (Usuario)udao.consultaEntidade(Integer.parseInt(query));
			
			if(u != null){
				
				System.out.println(u.toString());
				
				out.write("Nome = " + u.getNome() + "<br/>");
				out.write("Sobrenome = " + u.getSobrenome() + "<br/>");
				out.write("Usuario = " + u.getUsuario() + "<br/>");
				out.write("Senha = " + u.getSenha() + "<br/>");
			} else {
				out.write("Busca não retornou nenhum resultado.");
			}
			
		}else if(resposta.equals("Pizza")){
			PizzaDAO udao = PizzaDAO.getInstance();
			Pizza p = (Pizza)udao.consultaEntidade(Integer.parseInt(query));
			
			if(p != null){
				System.out.println(p.toString());			
				
				out.write("Sabor = " + p.getSabor() + "<br/>");
				out.write("Tamanho = " + p.getTamanho() + "<br/>");
				out.write("Preço = " + p.getPreco() + "<br/>");
			} else {
				out.write("Busca não retornou nenhum resultado.");
			}
			
		}else if(resposta.equals("Sobremesa")){
			SobremesaDAO udao = SobremesaDAO.getInstance();
			Sobremesa u = (Sobremesa)udao.consultaEntidade(Integer.parseInt(query));
			
			if(u != null){
				System.out.println(u.toString());
				
				out.write("Sabor = " + u.getSabor() + "<br/>");
				out.write("Tipo = " + u.getTipo() + "<br/>");
				out.write("Preço = " + u.getPreco() + "<br/>");
			} else {
				out.write("Busca não retornou nenhum resultado.");
			}
			
		}else if(resposta.equals("Bebida")){
			BebidaDAO udao = BebidaDAO.getInstance();
			Bebida u = (Bebida)udao.consultaEntidade(Integer.parseInt(query));
			
			if(u != null){
				System.out.println(u.toString());
				
				out.write("Nome = " + u.getNome() + "<br/>");
				out.write("Tipo = " + u.getTipo() + "<br/>");
				out.write("Tamanho = " + u.getTamanho() + "<br/>");
				out.write("Preço = " + u.getPreco() + "<br/>");
			} else {
				out.write("Busca não retornou nenhum resultado.");
			}
			
		}else if(resposta.equals("Pedido")){
			/*UsuarioDAO udao = UsuarioDAO.getInstance();
			Usuario u = (Usuario)udao.consultaEntidade(Integer.parseInt(query));
			System.out.println(u.toString());*/				
		}
		
		out.write("</body>");
		out.write("</html>");
		
		//response.sendRedirect("index.jsp");
		
		
	}

}
