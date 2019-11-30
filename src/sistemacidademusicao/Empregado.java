package sistemacidademusicao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Empregado {

    void insereEmpregado(int ID, String Nome, double salario){
        connectDB con = new connectDB();
        try{
            Connection conexao = DriverManager.getConnection(con.url, con.usuario, con.senha);
            Statement stmt = conexao.createStatement();
            String sql1 = "INSERT INTO EMPREGADO VALUES("+ID+", '"+Nome+"', "+salario+");";
            stmt.executeUpdate(sql1);
            stmt.close();
            conexao.close();
            
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    void removeEmpregado(int ID){
        connectDB con = new connectDB();
        try{
            Connection conexao = DriverManager.getConnection(con.url, con.usuario, con.senha);
            Statement stmt = conexao.createStatement();
            String sql1 = "DELETE FROM EMPREGADO WHERE ID = "+ID+";";
            stmt.executeUpdate(sql1);
            stmt.close();
            conexao.close();
            JOptionPane.showMessageDialog(null, "Dados removidos com sucesso");
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Nao foi possivel deletar dados");
        }
    }
    
    
}
