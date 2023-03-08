

package controlador;

import datos.Ciudad;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import datos.Conexion;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
@WebServlet(name="ServletController", urlPatterns={"/ServletController"})
public class ServletController extends HttpServlet {
   

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
    //    processRequest(request, response);

            String nombre = request.getParameter("name");
            String sqlStr="select * from city where countrycode = " + "'" + nombre + "'";

            Connection conn = null;
            PreparedStatement stmt = null;
            ResultSet rs = null;
            Ciudad ciudad= null;
            List<Ciudad> ciudades=new ArrayList<>();
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(sqlStr);
            rs = stmt.executeQuery(sqlStr);
            while (rs.next()) {
				Ciudad c=new Ciudad();
				c.setId(rs.getInt("id"));
				c.setName(rs.getString("name"));
				c.setCountrycode(rs.getString("countrycode"));
				c.setPopulation(rs.getInt("population"));
				c.setDistrict(rs.getString("district"));
				ciudades.add(c);
            }
            System.out.println("ciudades: " + ciudades);

	    request.setAttribute("ciudades",ciudades);
	    request.getRequestDispatcher("vistafinal.jsp").forward(request, response);
                 
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            Conexion.close(rs);
            Conexion.close(stmt);
            Conexion.close(conn);
        }
}

}
