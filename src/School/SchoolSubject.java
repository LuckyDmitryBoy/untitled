package School;

public class SchoolSubject {
    public String nameOfSubject;
    public String TypeOfSubject;

    public void setNameOfSubject(String nameOfSubject) {
        this.nameOfSubject = nameOfSubject;
    }

    public String getNameOfSubject() {
        return nameOfSubject;
    }

    public String getTypeOfSubject() {
        return TypeOfSubject;
    }

    public void setTypeOfSubject(String typeOfSubject) {
        TypeOfSubject = typeOfSubject;
    }
    public static int count;
    public SchoolSubject(String nameOfSubject,String TypeOfSubject){
        this.nameOfSubject=nameOfSubject;
        this.TypeOfSubject=TypeOfSubject;
        count++;
    }
public  String toString(){
        return count+"."+nameOfSubject+"-"+TypeOfSubject;
}
}
