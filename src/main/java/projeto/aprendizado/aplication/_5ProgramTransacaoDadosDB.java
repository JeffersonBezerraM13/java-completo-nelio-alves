package projeto.aprendizado.aplication;

import projeto.aprendizado.db.DB;
import projeto.aprendizado.db.DbException;
import projeto.aprendizado.db.DbIntegrityException;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class _5ProgramTransacaoDadosDB {
    public static void main(String[] args) {
        Connection conn = null;
        Statement st = null;
        try {
            conn = DB.getConnection();

            conn.setAutoCommit(false);

            st = conn.createStatement();

            int rows1 = st.executeUpdate(
                    "UPDATE seller "
                    + "SET BaseSalary = 2090 "
                    + "WHERE DepartmentId = 1"
            );

//            int x = 1;
//            if (x < 2) {
//                throw new SQLException("Erro ao executar update");
//            }

            int rows2 = st.executeUpdate(
                    "UPDATE seller "
                    + "SET BaseSalary = 3090 "
                    + "WHERE DepartmentId = 2"
            );
            conn.commit();

            System.out.println("Rows1: "+rows1);
            System.out.println("Rows1: "+rows2);
        } catch (SQLException e){
            try {
                conn.rollback();
                throw new DbException("Transaction rolled back! Coused by: "+e.getMessage());
            } catch (SQLException ex) {
                throw new DbException("Error trying to roll back! Coused by: "+e.getMessage());
            }
        } finally {
            DB.closeStatement(st);
            DB.closeConnection();
        }
    }
}
