import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TestaInsercao {
	public static void main(String[] args) throws SQLException {
//		Dados a inserir no nosso BD
		String nome = "Teclado Mec�nico";
		String descricao = "Switch Azul";
		
//		Criando a conex�o com o BD
		Connection con = ConnectionFactory.conexao();
		
//		Preparando a declara��o
		String sql = "insert into produto (nome, descricao) values (?, ?)";
		PreparedStatement pst = con.prepareStatement(sql);
		pst.setString(1, nome);
		pst.setString(2, descricao);
		
//		Executando e atualizando a declara��o
		pst.executeUpdate();
		System.out.println("Produto adicionado!!");
		
//		Fechando a conex�o
		con.close();
	}
}
