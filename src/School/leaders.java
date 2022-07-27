package School;

public class leaders extends School implements initialization{
    public String name;
    public String surname;
    public long telephonNumber;
    public String JobTittle;
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
    public void setJobTittle(String jobTittle){
        this.JobTittle=JobTittle;}
    public String getJobTittle(){
        return JobTittle;
    }
    public static int count;

    public  leaders(String name,String surname,long telephonNumber,String JobTittle){
        this.name=name;
        this.surname=surname;
        this.telephonNumber=telephonNumber;
        this.JobTittle=JobTittle;
        count++;
    }
    @Override
    public void initiliz() {
    System.out.println(count+"."+name+" "+surname+","+telephonNumber+","+JobTittle+".");
    }
}
