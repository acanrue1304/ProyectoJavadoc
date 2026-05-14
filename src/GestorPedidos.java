/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto_javadoc;

/**
 *
 * @author adrian
 * Esto es un ejercicio de clases para probar en el repositorio.
 */

/**
 * Componente software encargado de gestionar los pedidos de clientes en una
 * empresa. Permite calcular el importe total, actualizar cantidades y obtener
 * un resumen del pedido.
 *
 * Este componente simula el tipo de módulo que se documentaría en una empresa
 * durante la fase de DUAL utilizando Javadoc.
 *
 * @author Adrian
 * @version 1.0
 */
public class GestorPedidos {

    private String idPedido;
    private String cliente;
    private double precioUnidad;
    private int cantidad;

    /**
     * Constructor del componente GestorPedidos.
     *
     * @param idPedido Identificador único del pedido.
     * @param cliente Nombre del cliente asociado al pedido.
     * @param precioUnidad Precio por unidad del producto.
     * @param cantidad Cantidad de unidades solicitadas.
     */
    public GestorPedidos(String idPedido, String cliente, double precioUnidad, int cantidad) {
        this.idPedido = idPedido;
        this.cliente = cliente;
        this.precioUnidad = precioUnidad;
        this.cantidad = cantidad;
    }

    /**
     * Calcula el importe total del pedido.
     *
     * @return Importe total del pedido.
     */
    public double calcularTotal() {
        return precioUnidad * cantidad;
    }

    /**
     * Devuelve un resumen del pedido.
     *
     * @return Cadena con la información del pedido.
     */
    public String resumenPedido() {
        return "Pedido de " + cliente + " | Total: " + calcularTotal() + " €";
    }

    /**
     * Actualiza la cantidad de unidades del pedido.
     *
     * @param nuevaCantidad Nueva cantidad de unidades.
     */
    public void actualizarCantidad(int nuevaCantidad) {
        this.cantidad = nuevaCantidad;
    }

    /**
     * Obtiene el identificador del pedido.
     *
     * @return ID del pedido.
     */
    public String getIdPedido() {
        return idPedido;
    }
}