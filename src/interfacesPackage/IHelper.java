package interfacesPackage;

import exceptionPackage.CException;

/**
 * Created by Daniel on 11/2/2014.
 */

/**
 * interfata folosita pentru a face disponibile cele 2 functii,
 * speedUp si speedDown tuturor claselor
 */
public interface IHelper {

    void speedUp() throws CException;

    void speedDown() throws CException;

}
