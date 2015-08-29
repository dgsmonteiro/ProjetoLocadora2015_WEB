package dao;

import java.awt.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import model.Automovel;
import model.Modelo;

public class AutomovelDAO {

	public boolean automovelInexistente = false;
	
	ModeloDAO modDao = new ModeloDAO();
	
	/*public void incluir(Connection conn, String agencia, String ano, String chassi, 
			String estado, double km, String placa, String status) throws SQLException {
	
		try{				
			
			String sqlSelect ="insert INTO automovel (agencia, ano,chassi, estado, km,placa, statusAut, modelo) values (?,?,?,?,?,?,?);";
			
			PreparedStatement stm  = conn.prepareStatement(sqlSelect);
		
			stm.setString(1, agencia);
			stm.setString(2, ano);
			stm.setString(3, chassi);			
			stm.setString(4, estado);
			stm.setDouble(5, km);
			stm.setString(6, placa);
			stm.setString(7,status);
	
						
			stm.executeUpdate();			
			stm.close();
			JOptionPane.showMessageDialog(null, "Cadastro realizado");	
		
		}	
		catch (Exception e){
			if(e instanceof com.mysql.jdbc.exceptions.jdbc4.MySQLIntegrityConstraintViolationException){  
				JOptionPane.showMessageDialog(null,"Automóvel já cadastrado");
			}else{ 
				JOptionPane.showMessageDialog(null,"Não foi possivel cadastrar");
			}
			e.printStackTrace();
			try{
			conn.rollback();
			}
			catch (SQLException e1){
			System.out.print(e1.getStackTrace());
			}
		
		}
		
	
	}*/
	public Automovel carregar(Connection conn, String placa) {
		
		  Automovel automovel = new Automovel();
	      String sqlSelect = "SELECT * from automovel where placa= ? ;";
	      PreparedStatement stm = null;
	      ResultSet rs = null;
	      try
	      {
	         stm = conn.prepareStatement(sqlSelect);
	         stm.setString(1, placa);
	         rs = stm.executeQuery();
	       
	         if (rs.next())
	         {	
	        	
	        	
	        	automovel.setAgencia(rs.getString(1));
	        	automovel.setAno(rs.getString(2));
	        	automovel.setChassi(rs.getString(3));
	        	automovel.setEstado(rs.getString(4));
	        	automovel.setKm(rs.getDouble(5));
	        	automovel.setPlaca(rs.getString(6));
	        
	            
	         }else {
	            JOptionPane.showMessageDialog(null,"Automóvel não existe!");
	            automovelInexistente = true;   
	         }
	         
	            
  }
  
  catch (Exception e)
  {
     e.printStackTrace();
     try
     {
        conn.rollback();
     }
     catch (SQLException e1)
     {
        System.out.print(e1.getStackTrace());
     }
  }
  finally
  {
     if (stm != null)
     {
        try
        {
           stm.close();
        }
        catch (SQLException e1)
        {
           System.out.print(e1.getStackTrace());
        }
     }
  }
	      	return automovel;
	}
	
	
	
	public void excluir(Connection conn,String placa) {
	      

        String sqlDelete = "DELETE FROM automovel WHERE placa = ?";
        PreparedStatement stm = null;
        try
        {
           stm = conn.prepareStatement(sqlDelete);
           stm.setString(1,placa);
           stm.execute();
           JOptionPane.showMessageDialog(null, "Exclusão realizada");
        }
        catch (Exception e)
        {  JOptionPane.showMessageDialog(null, "ERRO AO EXCLUIR");
           e.printStackTrace();
           try
           {
              conn.rollback();
           }
           catch (SQLException e1)
           {
              System.out.print(e1.getStackTrace());
              JOptionPane.showMessageDialog(null, "ERRO AO EXCLUIR");
           }
        }
        finally
        {
           if (stm != null)
           {
              try
              {
           	   
                 stm.close();
              }
              catch (SQLException e1)
              {
                 System.out.print(e1.getStackTrace());
              }
           }
        }
     
     

}

	
	public void alterar(Connection conn,String agencia, String ano, String chassi, 
			String estado, double km, String placa) throws SQLException{
		  
		dao.AcessoBD bd = new dao.AcessoBD();
		

	
		try
	      {
		  String sqlSelect = "UPDATE AUTOMOVEL SET  agencia=?, ano=?, chassi=?,estado=?,km=? where placa=?";
		  	


		  PreparedStatement  stm = conn.prepareStatement(sqlSelect);
		  	 
		     stm.setString(1, agencia);
	         stm.setString(2, ano);
	         stm.setString(3, chassi);
	         stm.setString(4, estado);
	         stm.setDouble(5, km);
	         stm.setString(6, placa);	          
	
	  
	

	         if (stm.executeUpdate() > 0) { 
					JOptionPane.showMessageDialog(null, "Alterado com sucesso!");
				} else { 
					
				} 
				
			}catch (Exception e){
				e.printStackTrace();
				try{
				conn.rollback();
				}
				catch (SQLException e1){
				System.out.print(e1.getStackTrace());
				}
			
			}	   
		}	

	
	
	
	public void incluir(Connection conn, String placa, String agencia, String ano, String chassi, String estado, double km, int modaut) throws SQLException {
		int s=1;
		try{				
			
			String sqlSelect ="insert INTO automovel  (placa,agencia,ano,chassi,estado,km, codmod, statusAut) values  (?,?,?,?,?,?,?,"
					+ "/);"; 
			PreparedStatement stm  = conn.prepareStatement(sqlSelect);
			

			
			stm.setString(1, placa);
			stm.setString(2, agencia);
			stm.setString(3, ano);			
			stm.setString(4, chassi);
			stm.setString(5, estado);
			stm.setDouble(6, km);
			stm.setInt(7, modaut); 
			stm.setInt(9, s);
			
			
						
			stm.executeUpdate();			
			stm.close();
			JOptionPane.showMessageDialog(null, "Cadastro realizado");			
		
		}	
		catch (Exception e){
			if(e instanceof com.mysql.jdbc.exceptions.jdbc4.MySQLIntegrityConstraintViolationException){  
				JOptionPane.showMessageDialog(null,"Automóvel já cadastrado");
			}else{ 
				JOptionPane.showMessageDialog(null,"Não foi possivel cadastrar");
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

	
	
	
	
	
	
	public Automovel aleatorio(Connection conn, int codmod) {
		
		  Automovel automovel = new Automovel();
	      String sqlSelect = "SELECT * from automovel where statusAut=1 and codmod=? limit 1;";
	      PreparedStatement stm = null;
	      ResultSet rs = null;
	      try
	      {
	         stm = conn.prepareStatement(sqlSelect);
	         stm.setInt(1, codmod);
	         rs = stm.executeQuery();
	         System.out.print(codmod);
	         if (rs.next())
	         {	
	        	
	        	
	        	automovel.setPlaca(rs.getString(1));
	        	System.out.print(automovel.getPlaca());
	        
	            
	         }
	         
	            
}

catch (Exception e)
{
   e.printStackTrace();
   try
   {
      conn.rollback();
   }
   catch (SQLException e1)
   {
      System.out.print(e1.getStackTrace());
   }
}
finally
{
   if (stm != null)
   {
      try
      {
         stm.close();
      }
      catch (SQLException e1)
      {
         System.out.print(e1.getStackTrace());
      }
   }
}
	      	return automovel;
	}
	
	
	
	
	
	
	
	
	
	
}
