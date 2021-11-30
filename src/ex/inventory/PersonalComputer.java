package ex.inventory;

//PC情報
public class PersonalComputer {

    private String userName;
    private int pcNo;
    private int storageNo;
    private int pcPrice;
    private int bit;
    private String OS;

    public PersonalComputer(String userName, int pcNo, int storageNo, int pcPrice, int bit, String OS) {
        this.userName = userName;
        this.pcNo = pcNo;
        this.storageNo = storageNo;
        this.pcPrice = pcPrice;
        this.bit = bit;
        this.OS = OS;
    }

    public String getUserName() {
        return userName;
    }

    public int getPcNo() {
        return pcNo;
    }

    public int getStorageNo() {
        return storageNo;
    }

    public int getPcPrice() {
        return pcPrice;
    }


    public int getBit() {
        return bit;
    }

    public String getOS() {
        return OS;
    }

    @Override
    public String toString() {
        return "PersonalComputer{" +
                "userName='" + userName + '\'' +
                ", pcNo=" + pcNo +
                ", storageNo=" + storageNo +
                ", price=" + pcPrice +
                ", bit=" + bit +
                ", OS='" + OS + '\'' +
                '}';
    }

}

