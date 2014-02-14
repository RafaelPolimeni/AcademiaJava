package sef.module8.activity;
//Needs to be completed
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//The following program throws a checked exception. 
public class SQLExceptionActivity {


	public static void main(String[] args) throws SQLException {

			String url = "jdbc:mysql://localhost/activity1"; 
			String user = "root";
			String pass = "abcd1234";
			
			//The following code would not compile unless it's put inside a try catch
			//1 - put it in a try block and handle ClassNotFoundException
			Connection cn = null;
			
			try {
				
				Class.forName("com.mysql.jdbc.Driver");
				cn = DriverManager.getConnection(url, user, pass);
				System.out.println("Connection successfully established! \n");
				
			} catch (SQLException e) {
				System.out.println("Nao foi possivel se conectar ao Banco de Dados!");
			}
			catch(ClassNotFoundException e){
				System.out.println("Classe nao localizada");
				
			} catch (Exception e2) {
				
				System.err.println("ERRO!");
				// TODO: handle exception
			}
				
		

				e.printStackTrace();

			 finally {
				
				cn.close();
			}
			
			
			//2 - You also need to catch SQLException for it to compile
			
	
	}

}
