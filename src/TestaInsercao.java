import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TestaInsercao {
	public static void main(String[] args) throws SQLException {
//		Dados a inserir no nosso BD
		String nome = "Teclado Mecânico";
		String descricao = "Switch Azul";
		
//		Criando a conexão com o BD
		Connection con = ConnectionFactory.conexao();
		
//		Preparando a declaração
		String sql = "insert into produto (nome, descricao) values (?, ?)";
		PreparedStatement pst = con.prepareStatement(sql);
		pst.setString(1, nome);
		pst.setString(2, descricao);
		
//		Executando e atualizando a declaração
		pst.executeUpdate();
		System.out.println("Produto adicionado!!");
		
//		Fechando a conexão
		con.close();
	}
}
