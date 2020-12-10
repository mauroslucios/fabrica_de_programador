package br.com.fabricadeprogramador;

import br.com.fabricadeprogramador.entity.Usuario;
import br.com.fabricadeprogramador.persistence.UsuarioDao;


public class TestUsuarioDao {

	public static void main(String[] args) {
		testExcluir();		
	}
	
	public static void testCadastrar() {
		//Criando usuário
		Usuario usu = new Usuario();
		usu.setNome("user teste");
		usu.setLogin("teste");
		usu.setSenha("123");
		
		UsuarioDao usuDao = new UsuarioDao();
		usuDao.cadastrar(usu);
		
		System.out.println("Cadastrado com sucesso");
	}
	
	public static void testAlterar() {
		//Criando usuário
		Usuario usu = new Usuario();
		usu.setId(3);
		usu.setNome("user teste alterado");
		usu.setLogin("testeAlterado");
		usu.setSenha("123456");
		
		UsuarioDao usuDao = new UsuarioDao();
		usuDao.alterar(usu);
		
		System.out.println("Alterado com sucesso");
	}
	
	public static void testExcluir() {
		//Criando usuário
		Usuario usu = new Usuario();
		usu.setId(3);
		//Excluindo do banco de dados 
		UsuarioDao usuDao = new UsuarioDao();
		usuDao.excluir(usu);
		
		System.out.println("Excluido com sucesso");
	}

}
