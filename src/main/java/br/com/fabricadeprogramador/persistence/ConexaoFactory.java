package br.com.fabricadeprogramador.persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoFactory {

	public static Connection getConnection() {
		
		try {
			return DriverManager.getConnection("jdbc:postgresql://172.19.0.2:5432/fabricaweb", "postgres", "Postgres2019!");
		}catch(SQLException e) {
			//relançando a exceção
			throw new RuntimeException(e);
		}
		
	}

}
