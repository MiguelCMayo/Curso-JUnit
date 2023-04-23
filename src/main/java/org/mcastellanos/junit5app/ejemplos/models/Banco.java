package org.mcastellanos.junit5app.ejemplos.models;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Banco {
    private String nombre;
    private List<Cuenta> cuentas;

    public Banco() {
        cuentas = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void transferir(Cuenta origen, Cuenta destino, BigDecimal monto){
        origen.debito(monto); //a origen se le resta dinero
        destino.credito(monto); //a destino se le suma dinero
    }

    public List<Cuenta> getCuentas() {
        return cuentas;
    }

    public void setCuentas(List<Cuenta> cuentas) {
        this.cuentas = cuentas;
    }

    //metodo para añadir cuentas a la List
    public void addCuenta(Cuenta cuenta){
        cuentas.add(cuenta);
        cuenta.setBanco(this); //a cada cuenta que se añade a un banco le agregamos el nombre del banco
    }
}
