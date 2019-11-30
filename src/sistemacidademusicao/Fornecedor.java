package sistemacidademusicao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Fornecedor {

    private int idforn;
    private String nome;
    private int cnpj;

    public int getIdforn() {
        return idforn;
    }

    public void setIdforn(int idforn) {
        this.idforn = idforn;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCnpj() {
        return cnpj;
    }

    public void setCnpj(int cnpj) {
        this.cnpj = cnpj;
    }
    
    
    
    void insereFornecedor(int IDForn, String Nome, int CNPJ){
        connectDB con = new connectDB();
        try{
            Connection conexao = DriverManager.getConnection(con.url, con.usuario, con.senha);
            Statement stmt = conexao.createStatement();
            String sql1 = "INSERT INTO FORNECEDOR(idforn,nome,cnpj) VALUES("+IDForn+", '"+Nome+"', "+CNPJ+");";
            stmt.executeUpdate(sql1);
            stmt.close();
            conexao.close();
            JOptionPane.showMessageDialog(null, "Dados inseridos com sucesso");
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    void removeFornecedor(int IDForn){
        connectDB con = new connectDB();
        try{
            Connection conexao = DriverManager.getConnection(con.url, con.usuario, con.senha);
            Statement stmt = conexao.createStatement();
            String sql1 = "DELETE FROM FORNECEDOR WHERE IDForn = "+IDForn+";";
            stmt.executeUpdate(sql1);
            stmt.close();
            conexao.close();
            JOptionPane.showMessageDialog(null, "Dados removidos com sucesso");
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Nao foi possivel deletar dados");
        }
    }
    
    List<Fornecedor> consultaFornecedor(){
        connectDB con = new connectDB();
        List<Fornecedor> forne = new ArrayList();
        try{
            Connection conexao = DriverManager.getConnection(con.url, con.usuario, con.senha);
            Statement stmt = conexao.createStatement();
            String sql = "SELECT * FROM FORNECEDOR";
            stmt.executeUpdate(sql);
            ResultSet res = stmt.getResultSet();
            while(res.next()){
                Fornecedor forn = new Fornecedor();
                forn.setIdforn(res.getInt("idforn"));
                forn.setNome(res.getString("nome"));
                forn.setCnpj(res.getInt("cnpj"));
                forne.add(forn);
            }
            stmt.close();
            conexao.close();
            return forne;
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
            return forne;
        }
    }
    List<Fornecedor> consultaFornecedor(String Nome){
        connectDB con = new connectDB();
        List<Fornecedor> forne = new ArrayList();
        
        try{
            Connection conexao = DriverManager.getConnection(con.url, con.usuario, con.senha);
            Statement stmt = conexao.createStatement();
            String sql = "SELECT * FROM FORNECEDOR WHERE NOME LIKE '"+Nome+"'";
            stmt.executeQuery(sql);
            ResultSet res = stmt.getResultSet();
            while(res.next()){
                Fornecedor forn = new Fornecedor();
                forn.setIdforn(res.getInt("idforn"));
                forn.setNome(res.getString("nome"));
                forn.setCnpj(res.getInt("cnpj"));
                forne.add(forn);
            }
            stmt.close();
            conexao.close();
            return forne;
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
            throw new RuntimeException();
        }
    }

}
