package School;

public class student extends School implements initialization{
    public String name;
    public String surname;
    public long telephonNumber;
    public double srBall;
    public  student(String name,String surname,long telephonNumber,double srBall){
        this.name=name;
        this.surname=surname;
        this.telephonNumber=telephonNumber;
        this.srBall=srBall;
    }

    public double getSrBall() {
        return srBall;
    }

    public long getTelephonNumber() {
        return telephonNumber;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSrBall(double srBall) {
        this.srBall = srBall;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setTelephonNumber(long telephonNumber) {
        this.telephonNumber = telephonNumber;
    }

    @Override
    public void initiliz() {

    }
}
