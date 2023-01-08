package devices;

/*ComboDevice também herda a classe Device e implementa as interfaces Scanner e Printer
 (necessário sobrescrever os métodos das interfaces e de Device)*/

public class ComboDevice extends Device implements Scanner, Printer {
    
    public ComboDevice(String serialNumber) {
        super(serialNumber);
    }

    @Override
    public void print(String doc) {
        System.out.println("Combo printing: " + doc);
    } 

    @Override
    public String scan() {
        return "Combo scan result";
    }

    @Override
    public void processDoc(String doc) {
        System.out.println("Combo processing: " + doc);
    }


}
