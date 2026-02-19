package herencias.horas;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Hora hora=new Hora(2,3);
        Hora12 hora1=new Hora12(22,33,periodo.AM);
        Hora hora2=new Hora(2,9);
        Hora12 hora3=new Hora12(11,59,periodo.PM);
        HoraExacta hora4 = new HoraExacta(4,6,43);
        HoraExacta hora5 = new HoraExacta(23,59,59);
        HoraExacta hora6 = new HoraExacta(2,56,0);
        HoraExacta hora7 = new HoraExacta(2,56,0);
        hora2.inc();
        hora3.inc();
        hora5.inc();
        hora6.setSegundos(60);
        
        System.out.println(hora1.toString());
        System.out.println(hora2.toString());
        System.out.println(hora3.toString());
        System.out.println(hora4.toString());
        System.out.println(hora5.toString());
        System.out.println(hora6.toString());
        System.out.println(hora7.ComparacionHoras(2, 56, 0));
    }
}
