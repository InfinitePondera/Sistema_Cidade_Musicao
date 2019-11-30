package sistemacidademusicao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class connectDB {
    ResultSet res = null;
    Connection conexao = null;
    Statement stmt = null;
    static String url = "jdbc:postgresql://localhost:5432/postgres";
    static String usuario  = "postgres";
    static String senha = "lightmyfire";
    
    void connection_test(){
        try{
            conexao = DriverManager.getConnection(url, usuario, senha);
            conexao.close();
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Conexao invalida");
        }
    }
    
    void insereConservado(int Codigo, double Preco, String Nome, int quant){
        try{
            conexao = DriverManager.getConnection(url, usuario, senha);
            stmt = conexao.createStatement();
            String sql1 = "INSERT INTO PRODUTO VALUES("+Codigo+", "+Preco+", '"+Nome+"', "+quant+");";
            String sql2 = "INSERT INTO CONSERVADOS VALUES("+Codigo+");";
            stmt.execute(sql1);
            stmt.execute(sql2);
            stmt.close();
            conexao.close();
            JOptionPane.showMessageDialog(null, "Dados inseridos com sucesso");
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.getSQLState());
        }
    }
    void removeConservado(int Codigo){
        try{
            conexao = DriverManager.getConnection(url, usuario, senha);
            stmt = conexao.createStatement();
            String sql1 = "DELETE FROM PRODUTO WHERE CODIGO = "+Codigo+";";
            String sql2 = "DELETE FROM CONSERVADOS WHERE CODIGO = "+Codigo+";";
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
    
    void insereFrio(int Codigo, double Preco, String Nome, int quant){
        try{
            conexao = DriverManager.getConnection(url, usuario, senha);
            stmt = conexao.createStatement();
            String sql1 = "INSERT INTO PRODUTO VALUES("+Codigo+", "+Preco+", '"+Nome+"', "+quant+");";
            String sql2 = "INSERT INTO FRIOS VALUES("+Codigo+");";
            stmt.executeUpdate(sql1);
            stmt.executeUpdate(sql2);
            stmt.close();
            conexao.close();
            JOptionPane.showMessageDialog(null, "Dados inseridos com sucesso");
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Nao foi possivel inserir dados");
        }
    }
    void removeFrio(int Codigo){
        try{
            conexao = DriverManager.getConnection(url, usuario, senha);
            stmt = conexao.createStatement();
            String sql1 = "DELETE FROM PRODUTO WHERE CODIGO = "+Codigo+";";
            String sql2 = "DELETE FROM FRIOS WHERE CODIGO = "+Codigo+";";
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
    
    void inserePadaria(int Codigo, double Preco, String Nome, int quant){
        try{
            conexao = DriverManager.getConnection(url, usuario, senha);
            stmt = conexao.createStatement();
            String sql1 = "INSERT INTO PRODUTO VALUES("+Codigo+", "+Preco+", '"+Nome+"', "+quant+");";
            String sql2 = "INSERT INTO PADARIA VALUES("+Codigo+");";
            stmt.executeUpdate(sql1);
            stmt.executeUpdate(sql2);
            stmt.close();
            conexao.close();
            JOptionPane.showMessageDialog(null, "Dados inseridos com sucesso");
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Nao foi possivel inserir dados");
        }
    }
    void removePadaria(int Codigo){
        try{
            conexao = DriverManager.getConnection(url, usuario, senha);
            stmt = conexao.createStatement();
            String sql1 = "DELETE FROM PRODUTO WHERE CODIGO = "+Codigo+";";
            String sql2 = "DELETE FROM PADARIA WHERE CODIGO = "+Codigo+";";
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
    
    void insereBebidas(int Codigo, double Preco, String Nome, int quant){
        try{
            conexao = DriverManager.getConnection(url, usuario, senha);
            stmt = conexao.createStatement();
            String sql1 = "INSERT INTO PRODUTO VALUES("+Codigo+", "+Preco+", '"+Nome+"', "+quant+");";
            String sql2 = "INSERT INTO BEBIDAS VALUES("+Codigo+");";
            stmt.executeUpdate(sql1);
            stmt.executeUpdate(sql2);
            stmt.close();
            conexao.close();
            JOptionPane.showMessageDialog(null, "Dados inseridos com sucesso");
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Nao foi possivel inserir dados");
        }
    }
    void removeBebidas(int Codigo){
        try{
            conexao = DriverManager.getConnection(url, usuario, senha);
            stmt = conexao.createStatement();
            String sql1 = "DELETE FROM PRODUTO WHERE CODIGO = "+Codigo+";";
            String sql2 = "DELETE FROM BEBIDAS WHERE CODIGO = "+Codigo+";";
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
    
    void insereLimpeza(int Codigo, double Preco, String Nome, int quant){
        try{
            conexao = DriverManager.getConnection(url, usuario, senha);
            stmt = conexao.createStatement();
            String sql1 = "INSERT INTO PRODUTO VALUES("+Codigo+", "+Preco+", '"+Nome+"', "+quant+");";
            String sql2 = "INSERT INTO LIMPEZA VALUES("+Codigo+");";
            stmt.executeUpdate(sql1);
            stmt.executeUpdate(sql2);
            stmt.close();
            conexao.close();
            JOptionPane.showMessageDialog(null, "Dados inseridos com sucesso");
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Nao foi possivel inserir dados");
        }
    }
    void removeLimpeza(int Codigo){
        try{
            conexao = DriverManager.getConnection(url, usuario, senha);
            stmt = conexao.createStatement();
            String sql1 = "DELETE FROM PRODUTO WHERE CODIGO = "+Codigo+";";
            String sql2 = "DELETE FROM LIMPEZA WHERE CODIGO = "+Codigo+";";
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
    
    void insereVerde(int Codigo, double Preco, String Nome, int quant){
        try{
            conexao = DriverManager.getConnection(url, usuario, senha);
            stmt = conexao.createStatement();
            String sql1 = "INSERT INTO PRODUTO VALUES("+Codigo+", "+Preco+", '"+Nome+"', "+quant+");";
            String sql2 = "INSERT INTO VERDES VALUES("+Codigo+");";
            stmt.executeUpdate(sql1);
            stmt.executeUpdate(sql2);
            stmt.close();
            conexao.close();
            JOptionPane.showMessageDialog(null, "Dados inseridos com sucesso");
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Nao foi possivel inserir dados");
        }
    }
    void removeVerde(int Codigo){
        try{
            conexao = DriverManager.getConnection(url, usuario, senha);
            stmt = conexao.createStatement();
            String sql1 = "DELETE FROM PRODUTO WHERE CODIGO = "+Codigo+";";
            String sql2 = "DELETE FROM VERDES WHERE CODIGO = "+Codigo+";";
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
    
    void insereRefrigerado(int Codigo, double Preco, String Nome, int quant){
        try{
            conexao = DriverManager.getConnection(url, usuario, senha);
            stmt = conexao.createStatement();
            String sql1 = "INSERT INTO PRODUTO VALUES("+Codigo+", "+Preco+", '"+Nome+"', "+quant+");";
            String sql2 = "INSERT INTO REFRIGERADOS VALUES("+Codigo+");";
            stmt.executeUpdate(sql1);
            stmt.executeUpdate(sql2);
            stmt.close();
            conexao.close();
            JOptionPane.showMessageDialog(null, "Dados inseridos com sucesso");
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Nao foi possivel inserir dados");
        }
    }
    void removeRefrigerado(int Codigo){
        try{
            conexao = DriverManager.getConnection(url, usuario, senha);
            stmt = conexao.createStatement();
            String sql1 = "DELETE FROM PRODUTO WHERE CODIGO = "+Codigo+";";
            String sql2 = "DELETE FROM REFRIGERADOS WHERE CODIGO = "+Codigo+";";
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
    
    void inserePerfumaria(int Codigo, double Preco, String Nome, int quant){
        try{
            conexao = DriverManager.getConnection(url, usuario, senha);
            stmt = conexao.createStatement();
            String sql1 = "INSERT INTO PRODUTO VALUES("+Codigo+", "+Preco+", '"+Nome+"', "+quant+");";
            String sql2 = "INSERT INTO PERFUMARIA VALUES("+Codigo+");";
            stmt.executeUpdate(sql1);
            stmt.executeUpdate(sql2);
            stmt.close();
            conexao.close();
            JOptionPane.showMessageDialog(null, "Dados inseridos com sucesso");
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Nao foi possivel inserir dados");
        }
    }
    void removePerfumaria(int Codigo){
        try{
            conexao = DriverManager.getConnection(url, usuario, senha);
            stmt = conexao.createStatement();
            String sql1 = "DELETE FROM PRODUTO WHERE CODIGO = "+Codigo+";";
            String sql2 = "DELETE FROM PERFUMARIA WHERE CODIGO = "+Codigo+";";
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
    
    void inserePets(int Codigo, double Preco, String Nome, int quant){
        try{
            conexao = DriverManager.getConnection(url, usuario, senha);
            stmt = conexao.createStatement();
            String sql1 = "INSERT INTO PRODUTO VALUES("+Codigo+", "+Preco+", '"+Nome+"', "+quant+");";
            String sql2 = "INSERT INTO PETS VALUES("+Codigo+");";
            stmt.executeUpdate(sql1);
            stmt.executeUpdate(sql2);
            stmt.close();
            conexao.close();
            JOptionPane.showMessageDialog(null, "Dados inseridos com sucesso");
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Nao foi possivel inserir dados");
        }
    }
    void removePets(int Codigo){
        try{
            conexao = DriverManager.getConnection(url, usuario, senha);
            stmt = conexao.createStatement();
            String sql1 = "DELETE FROM PRODUTO WHERE CODIGO = "+Codigo+";";
            String sql2 = "DELETE FROM PETS WHERE CODIGO = "+Codigo+";";
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
