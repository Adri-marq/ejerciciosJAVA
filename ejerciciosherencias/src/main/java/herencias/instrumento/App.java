package herencias.instrumento;


public class App 
{
    public static void main( String[] args ){
      Piano pina= new Piano();
      Campana campa = new Campana();
    
      pina.add(Notas.FA);
      pina.add(Notas.RE);
      pina.add(Notas.SOL);
    
      pina.interpretar();
      
      campa.add(Notas.FA);
      campa.add(Notas.RE);
      campa.add(Notas.SOL);
    
      campa.interpretar();
    }
}
