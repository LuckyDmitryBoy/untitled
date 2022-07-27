package Building;

public class Test {
    public static void main(String[]args){
        Library l=new Library();
        House h=new House();
        PoliceDepartment pd=new PoliceDepartment();
        University u=new University();
        ShoppingCenter sc=new ShoppingCenter();
        HighRiseBuilding hb=new HighRiseBuilding();
        System.out.println(l.toString());
        System.out.println(h.toString());
        System.out.println(pd.toString());
        System.out.println(u.toString());
        System.out.println(sc.toString());
        System.out.println(hb.toString());
        l.important();
        h.comfortoflive();
        h.coutofperson();
        l.personaiyty();
        pd.important();
        hb.comfortoflive();
        hb.coutofperson();
        pd.personaiyty();
        u.important();
        u.personaiyty();
        sc.important();
        sc.personaiyty();
    }
}
