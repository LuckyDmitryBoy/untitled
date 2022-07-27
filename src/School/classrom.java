package School;

public class classrom implements initialization {
    public int Number;
    public String abc;
    public classrom(int Number, String abc){
        this.Number=Number;
        this.abc=abc;
    }

    public String getAbc() {
        return abc;
    }

    public int getNumber() {
        return Number;
    }

    public void setNumber(int number) {
        Number = number;
    }

    public void setAbc(String abc) {
        this.abc = abc;
    }

    @Override
    public void initiliz() {
        System.out.println(Number+abc);
    }
}
