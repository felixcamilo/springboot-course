package com.felixcamilo.colours.services.impl;

import com.felixcamilo.colours.services.GreenPrinter;
import org.springframework.stereotype.Component;


@Component
public class SpanishGreenPrinter implements GreenPrinter {

    @Override
    public String print(){
        return "verde";
    }

}
