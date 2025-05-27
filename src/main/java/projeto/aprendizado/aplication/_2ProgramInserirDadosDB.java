package projeto.aprendizado.aplication;

import projeto.aprendizado.db.DB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;

public class _2ProgramInserirDadosDB {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            con = DB.getConnection();
//            ps = con.prepareStatement(
//                    "INSERT INTO seller "
//                    + "(Name,Email,BirthDate,BaseSalary,DepartmentId) "
//                    + "VALUES "
//                    + "(?,?,?,?,?)", PreparedStatement.RETURN_GENERATED_KEYS
//            );
//
//            ps.setString(1,"Maria da Luz");
//            ps.setString(2, "mariadaluz@gmail.com");
//            ps.setDate(3,new java.sql.Date(sdf.parse("22/04/1995").getTime()));
//            ps.setDouble(4, 1500.00);
//            ps.setInt(5, 4);

            ps = con.prepareStatement("insert into department (Name) values ('D1'),('D2')",
                    PreparedStatement.RETURN_GENERATED_KEYS);

            int rowsAffected = ps.executeUpdate();

            if(rowsAffected > 0){
                ResultSet rs2 = ps.getGeneratedKeys();
                while(rs2.next()){
                    int id = rs2.getInt(1);
                    System.out.println("Done! Id = "+id);
                }
            } else {
                System.out.println("No rows affected!");
            }
        } catch (SQLException e){
            e.printStackTrace();
        } finally {
            DB.closeResultSet(rs);
            DB.closeStatement(ps);
            DB.closeConnection();
        }
    }
}
