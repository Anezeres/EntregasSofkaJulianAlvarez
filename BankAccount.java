public class BankAccount {

    /**
     *
     * Esta clase representa una cuenta de banco.
     *
     * @autor Julian Alexander Alvarez Payares
     */

    private int accountNumber;
    protected  boolean activated;
    private int balance;
    public String bank;
    public String owner;
    private int password;

    /**
     * @param accountNumber Representa el numero de cuenta.
     * @param activated Indica si la cuenta está activada o no.
     * @param balance Representa el saldo de la cuenta.
     * @param bank Indica cual es el nombre del banco usado.
     * @param owner Indica quien es el dueño de la cuenta.
     * @param password Indica cual es la contraseña para ingresar a la cuenta.
     */

    public BankAccount(int accountNumber, boolean activated, int balance, String bank, String owner, int password) {
        this.accountNumber = accountNumber;
        this.activated = activated;
        this.balance = balance;
        this.bank = bank;
        this.owner = owner;
        this.password = password;
    }

    /**
     * Getters y Setters de Activated.
     */

    public boolean isActivated() {
        return activated;
    }

    public void setActivated(boolean activated) {
        this.activated = activated;
    }
}
