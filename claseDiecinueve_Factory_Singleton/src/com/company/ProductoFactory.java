package com.company;

public class ProductoFactory {
    private static ProductoFactory instance;

    private ProductoFactory()
    {
    }

    public static ProductoFactory getInstance(){
        if (instance == null)
            instance = new ProductoFactory();

        return instance;
    }

    public Producto crearProducto(String tipoProducto){
        Producto resultado = null;
        switch (tipoProducto){
            case "CAJA10X10":
                resultado = new Caja(10.0,10.0,10.0);
                break;
            case "PELOTAFUTBOL":
                resultado = new Pelota(11.0);
                break;
            case "PELOTATENIS":
                resultado = new Pelota(0.32);
                break;

        }
        return resultado;

    }


}
