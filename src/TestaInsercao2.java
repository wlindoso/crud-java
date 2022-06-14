import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TestaInsercao2 {
	public static void main(String[] args) throws SQLException {
//		Dados a inserir no nosso BD
		String nome = "Teclado Mec�nico";
		String descricao = "Switch Azul";
		
//		Criando a conex�o com o BD
		Connection con = ConnectionFactory.conexao();
		
//		Preparando a declara��o
		String sql = "insert into produto (nome, descricao) values (?, ?)";
		PreparedStatement pst = con.prepareStatement(sql);
		
		adicionarVariavel("SmartTV", "50 Polegadas", pst);
		adicionarVariavel("R�dio", "R�dio com bateria", pst);
		
//		Fechando a conex�o
		con.close();
	}

	private static void adicionarVariavel(String nome, String descricao, PreparedStatement pst) throws SQLException {
		pst.setString(1, nome);
		pst.setString(2, descricao);
		
//		Executando e atualizando a declara��o
		pst.executeUpdate();
		System.out.println("Produto adicionado!!");
	}
}
