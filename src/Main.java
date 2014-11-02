import classesPackages.CCar;
import classesPackages.CMotocycle;
import exceptionPackage.CException;

public class Main {

    public static void main(String[] args) throws CException {
        CCar masina = new CCar();
        masina.print();
        masina.speedUp();
        masina.print();

        CMotocycle motocicleta = new CMotocycle();
        motocicleta.print();
        motocicleta.speedUp();
        motocicleta.print();
        motocicleta.incGear();
        motocicleta.print();
    }
}
