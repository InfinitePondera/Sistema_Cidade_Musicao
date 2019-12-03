package sistemacidademusicao;

public class SistemaCidadeMusicao {

    public static void main(String[] args) {
       telaIntroducao tela = new telaIntroducao();
       tela.setLocationRelativeTo(null);
       tela.show();
       connectDB con = new connectDB();
       con.connection_test();
       con.create_database();
    }
    
}
