public class DAOfactory {
    private AccountDAO adao;
    public AccountDAO getAccountDAO(){
        return new AccountDAO();
    }
}
