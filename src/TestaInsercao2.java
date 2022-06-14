import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TestaInsercao2 {
	public static void main(String[] args) throws SQLException {
//		Dados a inserir no nosso BD
		String nome = "Teclado Mecânico";
		String descricao = "Switch Azul";
		
//		Criando a conexão com o BD
		Connection con = ConnectionFactory.conexao();
		
//		Preparando a declaração
		String sql = "insert into produto (nome, descricao) values (?, ?)";
		PreparedStatement pst = con.prepareStatement(sql);
		
		adicionarVariavel("SmartTV", "50 Polegadas", pst);
		adicionarVariavel("Rádio", "Rádio com bateria", pst);
		
//		Fechando a conexão
		con.close();
	}

	private static void adicionarVariavel(String nome, String descricao, PreparedStatement pst) throws SQLException {
		pst.setString(1, nome);
		pst.setString(2, descricao);
		
//		Executando e atualizando a declaração
		pst.executeUpdate();
		System.out.println("Produto adicionado!!");
	}
}
