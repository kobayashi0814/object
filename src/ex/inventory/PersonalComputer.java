package ex.inventory;

//PC情報
public class PersonalComputer implements Constants{

    private String userName;
    private int pcNo;
    private int storageNo;
    private int memory;
    private int bit;
    private String OS;

    public PersonalComputer(String userName, int pcNo, int storageNo, int memory, int bit, String OS) {
        this.userName = userName;
        this.pcNo = pcNo;
        this.storageNo = storageNo;
        this.memory = memory;
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

    public int getMemory() {
        return memory;
    }

}

