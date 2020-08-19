import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLExceptiontion;
public class Conexao {
	
	public String status = "nao conectado";
	Connection conn = null
	String user = "root";
	String pwd = ""; //neste caso, sem senha
	String driverName = "com.mysql.jdbc.Driver"; //string de conexao do BD mysql
	String server = "localhost"; // ou IP do BD
	String bdName = "hospitalFX"
	String url = "jdbc:mysql://" + localhost + "3306/" + dbHospital.sql;
	
	//atrib p devolver a conexao
	public Connection getConnection() {
	try {
		class.forName(this.driverName);
		this.conn = DriverManager.getConnnection(url, user, pwd);
		
		if(conn !=null) {
			this.Status = "status conectado com sucesso!";
		}else {
			this.Status = "status nao conectado!";
		}
		}
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
	
	}catch (SQLException e) {
		e.printStackTrace();
	
	public String getStatus*() {
		return this.status;
		
	}
	//fechar conexao
	public boolean closeConnection();
	this.conn.close();
	return false;
	}
	public void resetConnection(); {
		try {
			this.closeConnection();
		}catch (SQLException e) {
			e.printStackTrace();
		}
	
	this.getConnection();
	}

	