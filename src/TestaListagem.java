import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TestaListagem {
	public static void main(String[] args) throws SQLException {
//		Criando a conex�o com o BD
		Connection con = ConnectionFactory.conexao();

//		Preparando a declara��o
		String sql = "select id, nome, descricao from produto;";
		PreparedStatement pst = con.prepareStatement(sql);
//		Criando nosso ResultSet para receber o resultado da nossa query.
		ResultSet rs = pst.executeQuery();
//		Percorrendo todas as linhas do nosso BD para capturar os valores dos campos e add aos par�metros id, nome e descricao.
		while (rs.next()) {
			Integer id = rs.getInt("id");
			String nome = rs.getString("nome");
			String descricao = rs.getString("descricao");
			System.out.println(id + ", " +  nome + ", " +  descricao);
		}	
//		Fechando a conex�o
		con.close();
	}
}
