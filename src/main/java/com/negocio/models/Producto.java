package com.negocio.models;

public class Producto {
    private int id;
    private String nombre;
    private double precio;
    private int stock;
    private int cantidad;

    public Producto(int id, String nombre, double precio, int stock) {
        this(id, nombre, precio, stock, 1);
    }

    public Producto(int id, String nombre, double precio, int stock, int cantidad) {
        if (id < 0) throw new IllegalArgumentException("El ID no puede ser negativo.");
        if (nombre == null || nombre.trim().isEmpty()) throw new IllegalArgumentException("El nombre no puede estar vacío.");
        if (precio < 0) throw new IllegalArgumentException("El precio no puede ser negativo.");
        if (stock < 0) throw new IllegalArgumentException("El stock no puede ser negativo.");
        if (cantidad < 0) throw new IllegalArgumentException("La cantidad no puede ser negativa.");

        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
        this.cantidad = cantidad;
    }

    public int getId() { return id; }
    public String getNombre() { return nombre; }
    public double getPrecio() { return precio; }
    public int getStock() { return stock; }
    public int getCantidad() { return cantidad; }

    public void setId(int id) {
        if (id < 0) throw new IllegalArgumentException("El ID no puede ser negativo.");
        this.id = id;
    }

    public void setNombre(String nombre) {
        if (nombre == null || nombre.trim().isEmpty()) throw new IllegalArgumentException("El nombre no puede estar vacío.");
        this.nombre = nombre;
    }

    public void setPrecio(double precio) {
        if (precio < 0) throw new IllegalArgumentException("El precio no puede ser negativo.");
        this.precio = precio;
    }

    public void setStock(int stock) {
        if (stock < 0) throw new IllegalArgumentException("El stock no puede ser negativo.");
        this.stock = stock;
    }

    public void setCantidad(int cantidad) {
        if (cantidad < 0) throw new IllegalArgumentException("La cantidad no puede ser negativa.");
        this.cantidad = cantidad;
    }

    public void reducirStock(int cantidad) {
        if (cantidad <= 0) {
            System.out.println("La cantidad no puede ser negativa ni cero");
            return;
        }
        if (stock < cantidad) {
            System.out.println("No contamos con esa cantidad, solo con " + stock);
            return;
        }
        this.stock -= cantidad;
    }

    public boolean hayStock(int cantidad) {
        return stock >= cantidad;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", stock=" + stock +
                '}';
    }
}