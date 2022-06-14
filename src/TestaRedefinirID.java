import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TestaRedefinirID {
	public static void main(String[] args) throws SQLException {
		int comecarDoId = 3;
		
		Connection con = ConnectionFactory.conexao();
		
		String sql = "alter table produto auto_increment = ?";		
		PreparedStatement pst = con.prepareStatement(sql);
		pst.setInt(1, comecarDoId);
		pst.executeUpdate();
		con.close();		
		System.out.println("Id redefinido com sucesso!");
	}
}
