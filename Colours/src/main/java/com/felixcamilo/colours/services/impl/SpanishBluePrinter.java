package com.felixcamilo.colours.services.impl;

import com.felixcamilo.colours.services.BluePrinter;
import org.springframework.stereotype.Component;



public class SpanishBluePrinter implements BluePrinter {

    @Override
    public String print(){
        return "azul";
    }
}
