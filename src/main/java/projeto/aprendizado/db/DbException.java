package projeto.aprendizado.db;

public class DbException extends RuntimeException{
    public DbException(String msg){
        super(msg);
    }
    public DbException(){
        super();
    }
}
