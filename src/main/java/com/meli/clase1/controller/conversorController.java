package com.meli.clase1.controller;

import com.meli.clase1.entity.ConversorNumero;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class conversorController {

    @GetMapping("/romanos/{numero}")
    public String conversonNumero(@PathVariable() int numero){
        if(numero<=3999){
            return ConversorNumero.conversor(numero);
        }else{
            return "Nùmero supera el maximo permitido";
        }

    }
}
