/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xergio.tienda.controlador.bean;

import com.xergio.tienda.controlador.cliente.ProductoDTO;
import com.xergio.tienda.controlador.cliente.ProductoWebService_Service;
import javax.xml.ws.WebServiceRef;

/**
 *
 * @author tlako
 */
public class ProductoWSBean {

    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/ProductoWebService/ProductoWebService.wsdl")
    private ProductoWebService_Service service;
    
    

    /**
     * Creates a new instance of ProductoWSBean
     */
    public ProductoWSBean() {
    }

    private ProductoDTO buscarProductoId(java.lang.Integer id) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        com.xergio.tienda.controlador.cliente.ProductoWebService port = service.getProductoWebServicePort();
        return port.buscarProductoId(id);
    }
    
}
