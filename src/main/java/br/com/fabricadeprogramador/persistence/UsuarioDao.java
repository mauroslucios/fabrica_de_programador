package br.com.fabricadeprogramador.persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.fabricadeprogramador.entity.Usuario;

public class UsuarioDao {
	Connection con = ConexaoFactory.getConnection();
	
	public void cadastrar(Usuario usu) {
		String sql = "insert into usuario(nome, login, senha) values(?,?,?)";
		
		//criando um Statement e fechando
		try(PreparedStatement stm = con.prepareStatement(sql)){
			stm.setString(1, usu.getNome());
			stm.setString(2, usu.getLogin());
			stm.setString(3, usu.getSenha());
			//Executando o comando SQL no banco
			stm.execute();
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void alterar(Usuario usu) {
		String sql = "update usuario set nome=?, login=?, senha=? where id=?";
		
		//criando um Statement e fechando
		try (PreparedStatement stm = con.prepareStatement(sql)){
			stm.setString(1, usu.getNome());
			stm.setString(2,usu.getLogin());
			stm.setString(3, usu.getSenha());
			stm.setInt(4, usu.getId());
			//Executando o comando SQL no banco
			stm.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void excluir(Usuario usu) {
		String sql = "delete from usuario where id=?";
		
		//criando um Statement e fechando
		try(PreparedStatement stm = con.prepareStatement(sql)){
		 stm.setInt(1, usu.getId());
		 //Executando o comando SQL no banco
		 stm.execute();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
	}

}
