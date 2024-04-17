package com.carlariela.websocketserver.controller;

import com.carlariela.websocketserver.dto.MensajeDto;
import com.carlariela.websocketserver.service.MensajeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class MensajeController {

    @Autowired
    private MensajeService mensajeService;

    @MessageMapping("/envio")
    @SendTo("/tema/mensajes")
    public MensajeDto envio(MensajeDto mensaje){
        mensajeService.guardar(mensaje);
        return new MensajeDto(mensaje.nombre(), mensaje.contenido());
    }

}
