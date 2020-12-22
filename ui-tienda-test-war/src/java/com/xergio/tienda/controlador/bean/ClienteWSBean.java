/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xergio.tienda.controlador.bean;

import com.xergio.tienda.controlador.cliente.ClienteWSImpl;
import com.xergio.tienda.controlador.servicios.Cliente;
import com.xergio.tienda.controlador.servicios.ClienteDTO;
import javax.annotation.PostConstruct;
import javax.faces.event.ActionEvent;



/**
 *
 * @author tlako
 */
public class ClienteWSBean {




    /**
     * Creates a new instance of ClienteWSBean
     */
    private Integer id;
    private String message = "Mantenimiento de CLientes";
    private ClienteDTO dto;
    private String nombres;
    private String apellidos;
    
    @PostConstruct
    public void main(){
        
    }
    
    public void buscarCliente(ActionEvent event){
        if(id!=null && id > 0 ){
            dto = ClienteWSImpl.buscarClienteId(id);
        }
    }
    
    public void guardarCliente(ActionEvent event){
        System.out.println("vamos a guardar");
        Cliente cliente = new Cliente();
        //cliente.setId(id);
        cliente.setNombres(nombres);
        cliente.setApellidos(apellidos);
        ClienteWSImpl.guardarCliente(cliente);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ClienteDTO getDto() {
        return dto;
    }

    public void setDto(ClienteDTO dto) {
        this.dto = dto;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    
    

   
    
    
}