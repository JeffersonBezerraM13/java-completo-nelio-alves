package projeto.aprendizado.aplication;

import projeto.aprendizado.db.DB;
import projeto.aprendizado.db.DbException;
import projeto.aprendizado.db.DbIntegrityException;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class _4ProgramDeletarDadosDB {
    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement st = null;
        try {
            conn = DB.getConnection();

            st = conn.prepareStatement(
                    "DELETE FROM department "
                    + "WHERE "
                    + "Id = ?"
            );
            st.setInt(1,2);

            int rowAffeted = st.executeUpdate();

            System.out.println("Done! Rows affected: "+rowAffeted);
        } catch (SQLException e){
            throw new DbIntegrityException(e.getMessage());
        } finally {
            DB.closeStatement(st);
            DB.closeConnection();
        }


    }
}
