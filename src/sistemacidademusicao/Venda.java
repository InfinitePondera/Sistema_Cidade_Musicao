package sistemacidademusicao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import javax.swing.JOptionPane;

public class Venda {
    
    private int IDNotaFiscal;
    private Calendar dataVenda;
    private double preco;
    private int idFun;

    public int getIDNotaFiscal() {
        return IDNotaFiscal;
    }

    public void setIDNotaFiscal(int IDNotaFiscal) {
        this.IDNotaFiscal = IDNotaFiscal;
    }

    public Calendar getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(Calendar dataVenda) {
        this.dataVenda = dataVenda;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getIdFun() {
        return idFun;
    }

    public void setIdFun(int idFun) {
        this.idFun = idFun;
    }
    
    
    
    void insereVenda(int IDNotaFiscal, Calendar dataVenda, double preco, int idfun){
        connectDB con = new connectDB();
        try{
            Connection conexao = DriverManager.getConnection(con.url, con.usuario, con.senha);
            Statement stmt = conexao.createStatement();
            Date data  = new Date(dataVenda.getTimeInMillis());
            String sql1 = "INSERT INTO VENDAS VALUES("+IDNotaFiscal+", '"+data+"', "+preco+", "+idfun+");";
            stmt.executeUpdate(sql1);
            stmt.close();
            conexao.close();
            JOptionPane.showMessageDialog(null, "Dados inseridos com sucesso");
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
        
    List<Venda> consultaVendas(){
            connectDB con = new connectDB();
            List<Venda> vend = new ArrayList();
        try{
            Connection conexao = DriverManager.getConnection(con.url, con.usuario, con.senha);
            Statement stmt = conexao.createStatement();
            String sql = "SELECT * FROM VENDAS";
            stmt.executeQuery(sql);
            ResultSet res = stmt.getResultSet();
            while(res.next()){
                Venda ven = new Venda();
                ven.setIDNotaFiscal(res.getInt("idnotafiscal"));
                ven.dataVenda.setTime(res.getDate("datavenda"));
                ven.setPreco(res.getDouble("preco"));
                ven.setIdFun(res.getInt("fk_empregado_id"));
                vend.add(ven);
            }
            stmt.close();
            conexao.close();
            return vend;
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
            return vend;
        }
    }

}
