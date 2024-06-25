package com.tutomas.java_taxi_seguimiento.controller;

import com.tutomas.java_taxi_seguimiento.model.Coordenada;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //indica que es un api rest
@RequestMapping("/taxiapp")
public class TaxiController {
    private final SimpMessagingTemplate template;

    public TaxiController(SimpMessagingTemplate template) {
        this.template = template;
    }

    @PostMapping("/send-coordenada") //para enviarle información de la coordenada al api rest
    public void sendCoordenada(@RequestBody Coordenada coordenada){
        //tareas REST controller
        this.template.convertAndSend("/taxi/coordenada", coordenada); //manda a taxi/coordenada la coordenada recibida
    }
}
