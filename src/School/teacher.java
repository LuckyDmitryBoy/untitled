package School;

public class teacher extends School{
public String name;
public String surname;
public long telephonNumber;
public String subject;
public void setName(String name){
    this.name=name;
}
public String getName(){
    return name;
}
    public void setSurname(String surname){
        this.surname=surname;
    }
    public String getSurname(){
        return surname;
    }
    public void setTelephonNumber(long telephonNumber){
        this.telephonNumber=telephonNumber;
    }
    public long getTelephonNumber(){
        return telephonNumber;
    }
    public void setSubject(String subject){
        this.subject=subject;
    }
    public String getSubject(){
        return subject;
    }
    public static int count;

public  teacher(String name,String surname,long telephonNumber,String subject){
    this.name=name;
    this.surname=surname;
    this.telephonNumber=telephonNumber;
    this.subject=subject;
}
public String toString(){
    return count+"."+name+" "+surname+","+telephonNumber+","+subject;
}
}
