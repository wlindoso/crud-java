

import java.sql.Connection;
import java.sql.SQLException;

public class TestaConexao {
	public static void main(String[] args) throws SQLException {
		Connection con = ConnectionFactory.conexao();
		System.out.println("Fechando conexão!!");
		con.close();
	}
}
