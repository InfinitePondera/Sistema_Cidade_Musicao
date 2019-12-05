package sistemacidademusicao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Cliente {

	private String Nome;

	private int CPF;

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public int getCPF() {
        return CPF;
    }

    public void setCPF(int CPF) {
        this.CPF = CPF;
    }
    
    public Cliente buscaCliente(int CPF){
        connectDB con = new connectDB();
        Cliente cli = new Cliente();
        try{
            Connection conexao = DriverManager.getConnection(con.url, con.usuario, con.senha);
            Statement stmt = conexao.createStatement();
            String sql = "SELECT NOME, CPF FROM CLIENTE WHERE CPF = "+CPF;
            stmt.executeQuery(sql);
            ResultSet res = stmt.getResultSet();
            while(res.next()){
                cli.setCPF(res.getInt("cpf"));
                cli.setNome(res.getString("nome"));
            }
            stmt.close();
            conexao.close();
            return cli;
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
            return cli;
        }
    }
    
    void insereCliente(int CPF, String Nome, int CEP, String Rua, int Numero){
        connectDB con = new connectDB();
        try{
            Connection conexao = DriverManager.getConnection(con.url, con.usuario, con.senha);
            Statement stmt = conexao.createStatement();
            String sql1 = "INSERT INTO CLIENTE VALUES("+CPF+", '"+Nome+"');";
            String sql2 = "INSERT INTO ENDERECO VALUES("+CEP+", '"+Rua+"', "+Numero+");";
            stmt.executeUpdate(sql1);
            stmt.executeUpdate(sql2);
            stmt.close();
            conexao.close();
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    void removeCliente(int CPF){
        connectDB con = new connectDB();
        try{
            Connection conexao = DriverManager.getConnection(con.url, con.usuario, con.senha);
            Statement stmt = conexao.createStatement();
            String sql1 = "DELETE FROM CLIENTE WHERE CPF = "+CPF+";";
            String sql2 = "DELETE FROM ENDERECO WHERE CPF = "+CPF+";";
            stmt.executeUpdate(sql2);
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
