package sistemacidademusicao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Produto {

    private int codigo;

    private String nome;

    private double preco;
        
    private int quantidade;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
    public void inserirProduto(String categoria, int codigo, double preco, String nome, int quantidade){
        connectDB con = new connectDB();
        if(categoria.toLowerCase().trim().equals("conservados")){
            con.insereConservado(codigo, preco, nome, quantidade);
        }
        else if(categoria.toLowerCase().trim().equals("frios")){
            con.insereFrio(codigo, preco, nome, quantidade);
        }
        else if(categoria.toLowerCase().trim().equals("cadaria")){
            con.inserePadaria(codigo, preco, nome, quantidade);
        }
        else if(categoria.toLowerCase().trim().equals("bebidas")){
            con.insereBebidas(codigo, preco, nome, quantidade);
        }
        else if(categoria.toLowerCase().trim().equals("limpeza")){
            con.insereLimpeza(codigo, preco, nome, quantidade);
        }
        else if(categoria.toLowerCase().trim().equals("verdes")){
            con.insereVerde(codigo, preco, nome, quantidade);
        }
        else if(categoria.toLowerCase().trim().equals("refrigerados")){
            con.insereRefrigerado(codigo, preco, nome, quantidade);
        }
        else if(categoria.toLowerCase().trim().equals("perfumaria")){
            con.inserePerfumaria(codigo, preco, nome, quantidade);
        }
        else if(categoria.toLowerCase().trim().equals("pets")){
            con.inserePets(codigo, preco, nome, quantidade);
        }
    }
    
    public void removerProduto(int codigo){
        connectDB con = new connectDB();
        List<Produto> prod = new ArrayList();
        try{
            Connection conexao = DriverManager.getConnection(con.url, con.usuario, con.senha);
            Statement stmt = conexao.createStatement();
            prod = getDBInfo(codigo);
            if(prod.get(0).getQuantidade() > 0){
                String sql = "UPDATE PRODUTO SET QUANTIDADE = "+(prod.get(0).getQuantidade()-1)+"WHERE CODIGO = "+codigo+";";
                String sql2 = "UPDATE";
                stmt.executeUpdate(sql);
                stmt.execute(sql2);
            }
            else{
                String sql = "DELETE FROM PRODUTO WHERE CODIGO = "+codigo+";";
                String sql2 = "DELETE";
                stmt.executeQuery(sql);
            }
            stmt.close();
            conexao.close();
        }
        catch(SQLException e){
            ResultSet res = null;
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public List<Produto> getDBInfo(int cod){
        List<Produto> pro = new ArrayList();
        connectDB con = new connectDB();
        try{
            Connection conexao = DriverManager.getConnection(con.url, con.usuario, con.senha);
            Statement stmt = conexao.createStatement();
            String sql = "SELECT * FROM PRODUTO";
            ResultSet res = stmt.executeQuery(sql);
            while(res.next()){
                Produto prod = new Produto();
                prod.setCodigo(res.getInt("codigo"));
                prod.setNome(res.getString("nome"));
                prod.setPreco(res.getDouble("preco"));
                prod.setQuantidade(res.getInt("quantidade"));
                pro.add(prod);
            }
            stmt.close();
            conexao.close();
            return pro;
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
            throw new RuntimeException();
        }
    }

    List<Produto> consultaEstoque(){
        List<Produto> pro = new ArrayList();
        connectDB con = new connectDB();
        try{
            Connection conexao = DriverManager.getConnection(con.url, con.usuario, con.senha);
            Statement stmt = conexao.createStatement();
            String sql = "SELECT * FROM PRODUTO";
            ResultSet res = stmt.executeQuery(sql);
            while(res.next()){
                Produto prod = new Produto();
                prod.setCodigo(res.getInt("codigo"));
                prod.setNome(res.getString("nome"));
                prod.setPreco(res.getDouble("preco"));
                prod.setQuantidade(res.getInt("quantidade"));
                pro.add(prod);
            }
            stmt.close();
            conexao.close();
            return pro;
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
            throw new RuntimeException();
        }
    }
    
    List<Produto> consultaEstoque(String categoria){
        connectDB con = new connectDB();
        List<Produto> pro = new ArrayList();
        try{
            Connection conexao = DriverManager.getConnection(con.url, con.usuario, con.senha);
            Statement stmt = conexao.createStatement();
            String sql = "SELECT * FROM PRODUTO NATURAL JOIN "+categoria;
            ResultSet res = stmt.executeQuery(sql);
            while(res.next()){
                Produto prod = new Produto();
                prod.setCodigo(res.getInt("codigo"));
                prod.setNome(res.getString("nome"));
                prod.setPreco(res.getDouble("preco"));
                prod.setQuantidade(res.getInt("quantidade"));
                pro.add(prod);
            }
            stmt.close();
            conexao.close();
            return pro;
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
            throw new RuntimeException();
        }
    }
    
    Produto consultaEstoque(int codigo){
        connectDB con = new connectDB();
        try{
            Connection conexao = DriverManager.getConnection(con.url, con.usuario, con.senha);
            Statement stmt = conexao.createStatement();
            String sql = "SELECT * FROM PRODUTO WHERE CODIGO = "+codigo;
            ResultSet res = stmt.executeQuery(sql);
            Produto prod = new Produto();
            while(res.next()){
                prod.setCodigo(res.getInt("codigo"));
                prod.setNome(res.getString("nome"));
                prod.setPreco(res.getDouble("preco"));
                prod.setQuantidade(res.getInt("quantidade"));
            }
            stmt.close();
            conexao.close();
            return prod;
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
            throw new RuntimeException();
        }
    }
    
    List<Produto> consultaEstoque(int codigo, String categoria){
        connectDB con = new connectDB();
        List<Produto> pro = new ArrayList();
        try{
            Connection conexao = DriverManager.getConnection(con.url, con.usuario, con.senha);
            Statement stmt = conexao.createStatement();
            String sql = "SELECT * FROM PRODUTO NATURAL JOIN "+categoria +" WHERE CODIGO = "+codigo;
            ResultSet res = stmt.executeQuery(sql);
            while(res.next()){
                Produto prod = new Produto();
                prod.setCodigo(res.getInt("codigo"));
                prod.setNome(res.getString("nome"));
                prod.setPreco(res.getDouble("preco"));
                prod.setQuantidade(res.getInt("quantidade"));
                pro.add(prod);
            }
            stmt.close();
            conexao.close();
            return pro;
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
            throw new RuntimeException();
        }
    }
    
    Produto buscaProduto(int codigo){
        connectDB con = new connectDB();
        Produto prod = new Produto();
        try{
            Connection conexao = DriverManager.getConnection(con.url, con.usuario, con.senha);
            Statement stmt = conexao.createStatement();
            String sql = "SELECT NOME, PRECO FROM PRODUTO WHERE CODIGO = "+codigo;
            stmt.executeQuery(sql);
            ResultSet res = stmt.getResultSet();
            while(res.next()){
                prod.setNome(res.getString("nome"));
                prod.setPreco(res.getDouble("preco"));
            }
            stmt.close();
            conexao.close();
            return prod;
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
            throw new RuntimeException();
        }
        
    }
    
    ResultSet buscaProduto(int codigo, String categoria){
        connectDB con = new connectDB();
        try{
            Connection conexao = DriverManager.getConnection(con.url, con.usuario, con.senha);
            Statement stmt = conexao.createStatement();
            String sql = "SELECT * FROM PRODUTO NATURAL JOIN "+categoria+";";
            stmt.executeQuery(sql);
            ResultSet res = stmt.getResultSet();
            stmt.close();
            conexao.close();
            return res;
        }
        catch(SQLException e){
            ResultSet res = null;
            JOptionPane.showMessageDialog(null, e);
            return res;
        }
    }
    
}
