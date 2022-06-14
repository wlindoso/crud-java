import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TestaRemocao {
	public static void main(String[] args) throws SQLException {
//		Valor do id que desejamos excluir do BD.
		int id = 3;
		
//		Criando a conex�o com o BD
		Connection con = ConnectionFactory.conexao();
		
//		Preparando a declara��o
		String sql = "delete from produto where id = (?);";
		PreparedStatement pst = con.prepareStatement(sql);
		pst.setInt(1, id);
		
//		Executando e atualizando a declara��o
		pst.executeUpdate();
		System.out.println("Quantidade de linha modificadas: " + pst.getUpdateCount());
		
//		Fechando a conex�o
		con.close();
	}
}
