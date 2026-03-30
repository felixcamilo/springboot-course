package com.felixcamilo.colours.services.impl;

import com.felixcamilo.colours.services.BluePrinter;
import org.springframework.stereotype.Service;


@Service
public class EnglishBluePrinter implements BluePrinter {

  @Override
  public String print() {
    return "blue";
  }
}
