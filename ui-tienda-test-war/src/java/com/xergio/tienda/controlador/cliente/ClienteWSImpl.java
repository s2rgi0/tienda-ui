/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xergio.tienda.controlador.cliente;

import com.xergio.tienda.controlador.servicios.ClienteDTO;

/**
 *
 * @author tlako
 */
public class ClienteWSImpl {

    public static ClienteDTO buscarClienteId(java.lang.Integer id) {
        com.xergio.tienda.controlador.servicios.ClienteWebService_Service service = new com.xergio.tienda.controlador.servicios.ClienteWebService_Service();
        com.xergio.tienda.controlador.servicios.ClienteWebService port = service.getClienteWebServicePort();
        return port.buscarClienteId(id);
    }

    public static Boolean guardarCliente(com.xergio.tienda.controlador.servicios.Cliente cliente) {
        com.xergio.tienda.controlador.servicios.ClienteWebService_Service service = new com.xergio.tienda.controlador.servicios.ClienteWebService_Service();
        com.xergio.tienda.controlador.servicios.ClienteWebService port = service.getClienteWebServicePort();
        return port.guardarCliente(cliente);
    }

    public static java.util.List<com.xergio.tienda.controlador.servicios.ClienteDTO> buscarTodosLosCliente() {
        com.xergio.tienda.controlador.servicios.ClienteWebService_Service service = new com.xergio.tienda.controlador.servicios.ClienteWebService_Service();
        com.xergio.tienda.controlador.servicios.ClienteWebService port = service.getClienteWebServicePort();
        return port.buscarTodosLosCliente();
    }
    
    
    
    

 
    
    
    
    
}
