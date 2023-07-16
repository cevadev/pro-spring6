package com.ceva.prospring6.two.decoupled;

import java.util.Optional;
import java.util.Properties;

/*
 * Clase que tiene la responsabilidad de recuperar 2 tipos de implementaciones
 */
public class MessageSupportFactory {
    private static MessageSupportFactory instace;
    private Properties props;
    private MessageRenderer renderer;
    private MessageProvider provider;

    private MessageSupportFactory(){
        props = new Properties();
        try{
            props.load(this.getClass().getResourceAsStream("/msf.properties"));
            String rendererClass = props.getProperty("renderer.class");
            String providerClass = props.getProperty("provider.class");
            renderer = (MessageRenderer) Class.forName(rendererClass).getDeclaredConstructor().newInstance();
            provider = (MessageProvider) Class.forName(providerClass).getDeclaredConstructor().newInstance();
        }catch (Exception ex){}
    }

    static {
        instace = new MessageSupportFactory();
    }

    public static MessageSupportFactory getInstace(){
        return instace;
    }

    public Optional<MessageRenderer> getMessageRenderer(){
        return renderer != null? Optional.of(renderer) : Optional.empty();
    }

    public Optional<MessageProvider> getMessageProvider(){
        return provider != null? Optional.of(provider) : Optional.empty();
    }
}
