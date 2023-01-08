package devices;

/* Classe Scanner foi renomeada para ConcreteScanner para evidenciar que é 
 uma classe concreta e diferenciar da interface */


/*Classe ConcreteScanner herda a classe Device e também implementa a interface Scanner */ 

public class ConcreteScanner extends Device implements Scanner {
    
    public ConcreteScanner(String serialNumber) {
        super(serialNumber);
    }

    @Override
    public void processDoc(String doc) {
        System.out.println("Scanner processing: " + doc);
    }

    /*Classe ConcreteScanner sobrescreve a operação processDoc (vindo da classe Device)
     assim como também sobrescreve a operação scan vinda da interface Scanner (@Override)*/
    public String scan() {
        return "Scanner content";
    }
}
