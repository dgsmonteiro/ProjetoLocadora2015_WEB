package dao;

import java.util.List;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import com.mysql.fabric.xmlrpc.base.Data;

import model.Emprestimo;
public class EmprestimoDAO {
	
	
	
	
	
	public void salvar(Connection conn, String dataHora, String previsao, double tipoTarifa,String cpfCli,double valor,String placaAut) throws SQLException {
	int a=0;
		try{				
			
			String sqlSelect ="INSERT INTO emprestimo (dataHora, previsao,tipoTarifa,cpfCli,valor,placaAut, statusAut) values (?,?,?, ?, ?, ?,?);";
			
			PreparedStatement stm  = conn.prepareStatement(sqlSelect);
		
			
			stm.setString(1, dataHora);
			stm.setString(2, previsao);			
			stm.setDouble(3, tipoTarifa);
			stm.setString(4, cpfCli);
			stm.setDouble(5, valor);
			stm.setString(6, placaAut);
			stm.setInt(7, a);
						
			stm.executeUpdate();			
			stm.close();
				
		
		}	
		
		catch (Exception e){
			if(e instanceof com.mysql.jdbc.exceptions.jdbc4.MySQLIntegrityConstraintViolationException){  
				JOptionPane.showMessageDialog(null,"erro");
			}else{ 
				JOptionPane.showMessageDialog(null,"erro");
			}
			e.printStackTrace();
			try{
			conn.rollback();
			}
			catch (SQLException e1){
			System.out.print(e1.getStackTrace());
			}
		
		}
		
	
	}
	
	
	
	
	

}
