package com.felixcamilo.colours.services.impl;

import com.felixcamilo.colours.services.RedPrinter;
import org.springframework.stereotype.Component;


@Component
public class SpanishRedPrinter implements RedPrinter {

    @Override
    public String print(){
        return "rojo";
    }
}
