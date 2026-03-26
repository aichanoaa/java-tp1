package ExceptionTP2;
public class Date {
    private int j;
    private int m;
    private int a;

    public Date(int j,int m,int a){
        this.j=j;
        this.m=m;
        this.a=a;
    }
    public static int recupererMois(String date) throws Exception{
        String [] d=date.split("/");
        String m=d[1];
        int mois=Integer.parseInt(m);
        return mois;
    }
    public static  int recupereJour(String date) throws Exception{
        String [] d=date.split("/");
        String j=d[0];
        int jour=Integer.parseInt(j);
        return jour;
    }
    public static int recupereAnnee(String date) throws Exception{
        String [] d=date.split("/");
        String a=d[2];
        int anne=Integer.parseInt(a);
        return anne;
    }
    public Date (String unedate) throws Exception{
        this.j=recupereJour(unedate);
        this.m=recupererMois(unedate);
        this.a=recupereAnnee(unedate);
    }
    public static Date dateApres1Mois(String date) throws Exception{
        try {
            int j =recupereJour(date);
            int m =recupererMois(date)+1;
            int a =recupereAnnee(date);
            if(m == 13){
                m=1;
                a=a+1;
            }
            return new Date(j,m,a);
        }
        catch(Exception e){
           // return Date(int recupereJour(date),int recupererMois(date),int recupereAnnee(date));
            // return null;solution :correcte
            //system.out.printl(e.getMessage());Solution faux
            throw  new Exception("Error de creation de nouvelle date");
        }
    }
    @Override
    public String toString(){
        return j+"/"+ m +"/"+a ;
    }
}
