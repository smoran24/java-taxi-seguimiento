package com.tutomas.java_taxi_seguimiento.controller;

import com.tutomas.java_taxi_seguimiento.model.Coordenada;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
//Este es el socket
@Controller
public class CoordenadaController {
    @MessageMapping("/taxi")
    @SendTo("/taxi/coordenada") //replicar coordenadas a todos los usuarios suscritos
    public Coordenada envio(Coordenada coordenada){ //recibe la coordenada y la retorna
        // tareas del socket
        return coordenada;
    }
}
