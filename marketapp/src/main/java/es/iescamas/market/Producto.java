package es.iescamas.market;

import es.iescamas.market.interfaces.Descuentable;
import es.iescamas.market.interfaces.Enviable;

/**
 * Representa un producto del catálogo de la aplicación Market.
*/
public class Producto implements Descuentable,Enviable{
	private String sku;
     private String nombre;
     private String categoria;
     private double precio;
     private double rating;
     private int stock;
     private int ventas;
     private double porcentajeDescuento;
     private double pesoKg;

    /**
     * Construye un producto con todos sus datos.
     *
     * @param sku código único del producto (SKU)
     * @param nombre nombre comercial del producto
     * @param categoria categoría del producto (puede ser {@code null})
     * @param precio precio base del producto (sin descuentos aplicados)
     * @param rating valoración media del producto (p.ej., 0.0..5.0)
     * @param stock unidades disponibles en almacén
     * @param ventas unidades vendidas (para ordenar por “popularidad”)
     * @param porcentajeDescuento descuento en tanto por uno (0.0..1.0)
     * @param pesoKg peso en kilogramos (0.0 si no es enviable; para envío debe ser &gt; 0)
     */
    public Producto(
            String sku,
            String nombre,
            String categoria,
            double precio,
            double rating,
            int stock,
            int ventas,
            double porcentajeDescuento,
            double pesoKg
    ) {
        // TODO Auto-generated constructor stub
    	this.sku=sku;
    	this.nombre=nombre;
    	this.categoria=categoria;
    	this.precio=precio;
    	this.rating=rating;
    	this.stock=stock;
    	this.ventas=ventas;
    	this.porcentajeDescuento=porcentajeDescuento;
    	this.pesoKg=pesoKg;
    }

	public double getPrecio() {
		// TODO Auto-generated method stub
		return precio;
	}

	@Override
	public double getPesoKg() {
		// TODO Auto-generated method stub
		return pesoKg;
	}

	@Override
	public double getPorcentajeDescuento() {
		
		return porcentajeDescuento;
	}

	public int compareTo(Producto p) {
		if(ventas > p.ventas) {
			return -1;
		}else if(ventas < p.ventas)  {
			return 1;
		} else {
			if(rating > p.rating) {
				return -1;
			}else if (rating < p.rating) {
			return 1;	
			}else {
				if(nombre.compareToIgnoreCase(p.nombre) < 0) {
					return -1;
				}else if (nombre.compareToIgnoreCase(p.nombre) > 0) {
					return 1;
				} else {
					if(sku.compareToIgnoreCase(p.sku) < 0) {
						return -1;
					}else {
						return 1;
						}
				}
			}
		}
	
	
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public int getVentas() {
		return ventas;
	}

	public void setVentas(int ventas) {
		this.ventas = ventas;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public void setPorcentajeDescuento(double porcentajeDescuento) {
		this.porcentajeDescuento = porcentajeDescuento;
	}

	public void setPesoKg(double pesoKg) {
		this.pesoKg = pesoKg;
	}

	public String getSku() {
		// TODO Auto-generated method stub
		return sku;
	}

	public String getCategoria() {
		// TODO Auto-generated method stub
		return categoria;
	}
}
