//package com.felixcamilo.colours.config;
//
//import com.felixcamilo.colours.services.BluePrinter;
//import com.felixcamilo.colours.services.ColourPrinter;
//import com.felixcamilo.colours.services.GreenPrinter;
//import com.felixcamilo.colours.services.RedPrinter;
//import com.felixcamilo.colours.services.impl.*;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//
//@Configuration
//public class PrinterConfig {
//
//    @Bean
//    public RedPrinter redPrinter(){
//        return new SpanishRedPrinter();
//    }
//
//
//    @Bean
//    public GreenPrinter greenPrinter(){
//        return new SpanishGreenPrinter();
//    }
//
//
//    @Bean
//    public BluePrinter bluePrinter(){
//        return new SpanishBluePrinter();
//    }
//
//
//    @Bean
//    public ColourPrinter colourPrinter(RedPrinter redPrinter, BluePrinter bluePrinter, GreenPrinter greenPrinter){
//        return new ColourPrinterImpl(redPrinter,bluePrinter, greenPrinter);
//    }
//
//
//
//}
