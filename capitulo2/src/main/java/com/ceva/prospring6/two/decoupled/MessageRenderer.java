package com.ceva.prospring6.two.decoupled;

/*
 * Service provider interface (SPI)
 * Cualquier implementacion de MessageRender esta desacoplado
 * de la recuperacion de mensajes
 */
public interface MessageRenderer {
    void render();
    void setMessageProvider(MessageProvider messageProvider);
    MessageProvider getMessageProvider();
}
