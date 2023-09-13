
package herency;

import java.util.Date;

public class Client extends Person{
    private int idClient;
    private Date registDate;
    private boolean vip;
    private static int clientCounter;

    public Client(Date registDate, boolean vip, String name, 
            char gender, int age, String address) {
        super(name, gender, age, address);
        this.idClient = ++Client.clientCounter;
        this.registDate = registDate;
        this.vip = vip;
    }

    public int getIdClient() {
        return this.idClient;
    }

    public Date getRegistDate() {
        return this.registDate;
    }

    public void setRegistDate(Date registDate) {
        this.registDate = registDate;
    }

    public boolean isVip() {
        return this.vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }  
    
    @Override
    public String getDetail() {
        return super.getDetail() + "Es VIP: " + this.vip;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Client{");
        sb.append("idClient=").append(idClient);
        sb.append(", registDate=").append(registDate);
        sb.append(", vip=").append(vip);
        sb.append(", ").append(super.toString());
        sb.append('}');
        return sb.toString();
    }
    
    
}
