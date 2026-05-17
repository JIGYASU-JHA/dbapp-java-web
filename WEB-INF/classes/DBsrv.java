import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.*;
import java.sql.*;

public class DBsrv extends HttpServlet{

Connection con;
PreparedStatement ps;

public void init(){

try{

Class.forName("org.postgresql.Driver");

con = DriverManager.getConnection(
"jdbc:postgresql://localhost:5432/companydb",
"postgres",
"Vaishnavi@143");

ps = con.prepareStatement(
"select ename, job, sal from emp where empno=?");

}

catch(Exception e){
e.printStackTrace();
}

}

public void doGet(HttpServletRequest req, HttpServletResponse res)
throws ServletException, IOException{

res.setContentType("text/html");
PrintWriter pw = res.getWriter();

pw.println("Servlet is running...<br>");

int no = Integer.parseInt(req.getParameter("teno"));

try{

ps.setInt(1,no);

ResultSet rs = ps.executeQuery();

if(rs.next()){

pw.println("<table border='1' bgcolor='pink' align='center' style='margin-top:100px;'>");
pw.println("<tr><th>NAME</th><th>DESG</th><th>SALARY</th></tr>");
pw.println("<tr><td>"+rs.getString(1)+"</td><td>"+rs.getString(2)+"</td><td>"+rs.getInt(3)+"</td></tr>");
pw.println("</table>");

}
else{
pw.println("Employee not found");
}

rs.close();

}

catch(Exception e){
e.printStackTrace();
}

pw.close();

}

public void doPost(HttpServletRequest req,HttpServletResponse res)
throws ServletException,IOException{

doGet(req,res);

}

public void destroy(){

try{
if(ps!=null) ps.close();
if(con!=null) con.close();
}
catch(Exception e){
e.printStackTrace();
}

}

}