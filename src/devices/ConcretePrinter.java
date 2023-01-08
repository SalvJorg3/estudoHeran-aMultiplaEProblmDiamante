package devices;

/* Classe Printer foi renomeada para ConcretePrinter para evidenciar que é 
 uma classe concreta e diferenciar da interface */

/*Classe ConcretePrinter herda a classe Device e também implementa a interface Printer */ 

 public class ConcretePrinter extends Device implements Printer  {
    
    public ConcretePrinter(String serialNumber) {
        super(serialNumber);
    }

    @Override
    public void processDoc(String doc) {
        System.out.println("Printer processing: " + doc);
    }

    /*Classe ConcretePrinter sobrescreve a operação processDoc (vindo da classe Device)
     assim como também sobrescreve a operação print vinda da interface Print (@Override)*/
    
     @Override
     public void print(String doc) {
        System.out.println("Printing: " + doc);
    }    
}
