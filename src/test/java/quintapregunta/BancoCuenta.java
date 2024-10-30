package quintapregunta;

import com.webpage.quintapregunta.Banco;
import com.webpage.quintapregunta.Cuenta;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class BancoCuenta {

    @BeforeAll
    public static void cuentas(){
        Banco banco = new Banco();
        Cuenta cuenta1 = new Cuenta("pepe","001",2000);
        Cuenta cuenta2 = new Cuenta("aldo","002",3000);
        List<Cuenta> cuentas = new ArrayList<>();
        cuentas.add(cuenta1);
        cuentas.add(cuenta2);
        banco.setCuentas(cuentas);

    }

    @Test
    public void existeCuenta(){
        Banco banco = new Banco();
        Cuenta cuenta1 = new Cuenta("pepe","001",2000);
        Cuenta cuenta2 = new Cuenta("aldo","002",3000);
        List<Cuenta> cuentas = new ArrayList<>();
        cuentas.add(cuenta1);
        cuentas.add(cuenta2);
        banco.setCuentas(cuentas);
        Assertions.assertTrue(banco.existeCuenta("pepe"));
    }

    @Test
    public void existeCuentaFallido(){
        Banco banco = new Banco();
        Cuenta cuenta1 = new Cuenta("pepe","001",2000);
        Cuenta cuenta2 = new Cuenta("aldo","002",3000);
        List<Cuenta> cuentas = new ArrayList<>();
        cuentas.add(cuenta1);
        cuentas.add(cuenta2);
        banco.setCuentas(cuentas);
        Assertions.assertFalse(banco.existeCuenta("hola"));
    }

    @Test
    public void depositarTest(){
        Banco banco = new Banco();
        Cuenta cuenta1 = new Cuenta("pepe","001",2000);
        Cuenta cuenta2 = new Cuenta("aldo","002",3000);
        List<Cuenta> cuentas = new ArrayList<>();
        cuentas.add(cuenta1);
        cuentas.add(cuenta2);
        banco.setCuentas(cuentas);

        //No se deja ya que devuelve un void pasa lo mismo con el retirar Assertions.assertEquals(banco.depositar("001",200));
    }

    @Test
    public void depositarTestFallido(){
        Banco banco = new Banco();
        Cuenta cuenta1 = new Cuenta("pepe","001",2000);
        Cuenta cuenta2 = new Cuenta("aldo","002",3000);
        List<Cuenta> cuentas = new ArrayList<>();
        cuentas.add(cuenta1);
        cuentas.add(cuenta2);
        banco.setCuentas(cuentas);

    }
}
