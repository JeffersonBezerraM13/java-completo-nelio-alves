package projeto.aprendizado.aplication;

import projeto.aprendizado.db.DB;

import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;

public class _1ProgramRecuperarDadosDB {
    public static void main(String[] args) {
        Connection conn = null;
        Statement st = null;
        ResultSet rs = null; //ResultSet é um objeto que tem forma de tabela
        try {
            conn = DB.getConnection();

            st = conn.createStatement();

            rs = st.executeQuery("select * from department");

            while(rs.next()){
                System.out.println(rs.getInt("Id") + ", " + rs.getString("Name"));
            }
        } catch (SQLException e){
            e.printStackTrace();
        } finally {
            DB.closeResultSet(rs);
            DB.closeStatement(st);
            DB.closeConnection();
        }
    }
}
