import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TestaAtualizacao {

	public static void main(String[] args) throws SQLException {
//		Dados a inserir no nosso BD
		int id = 3;
		String nome = "Teclado Mec�nico";
		String descricao = "Switch Vermelho";		
		
//		Criando a conex�o com o BD
		Connection con = ConnectionFactory.conexao();
		
//		Preparando a declara��o
		String sql = "update produto set nome=?, descricao=? where id=?";
		PreparedStatement pst = con.prepareStatement(sql);
		pst.setString(1, nome);
		pst.setString(2, descricao);
		pst.setInt(3, id);
		
//		Executando e atualizando a declara��o
		pst.executeUpdate();
		System.out.println("Produto alterado!!");
		
//		Fechando a conex�o
		con.close();
	}

}
