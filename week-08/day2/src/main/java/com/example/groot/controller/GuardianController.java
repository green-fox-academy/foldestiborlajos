package com.example.groot.controller;

import com.example.groot.DTO.ShipDTO;
import com.example.groot.model.Arrow;
import com.example.groot.model.ArrowError;
import com.example.groot.model.GuardianError;
import com.example.groot.model.Ship;
import com.example.groot.model.ShipError;
import com.example.groot.model.TranslatedMessage;
import com.example.groot.service.ShipService;
import javax.servlet.ServletResponse;
import javax.xml.ws.soap.AddressingFeature.Responses;
import org.apache.coyote.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;
import org.springframework.web.server.ServerErrorException;


@RestController
public class GuardianController {

  ShipService shipService;

  public GuardianController(ShipService shipService) {
    this.shipService = shipService;
  }

  @GetMapping("/groot")
  public ResponseEntity translate(
      @RequestParam(name = "message", required = false) String message) {
    if (message == null) {
      return ResponseEntity.badRequest().body(new GuardianError());
    } else {
      TranslatedMessage translatedMessage = new TranslatedMessage(message);
      return ResponseEntity.ok().body(translatedMessage);
    }
  }

  @GetMapping("/yondu")
  public ResponseEntity getSpeed(@RequestParam(name = "distance", required = false) Double distance,
      @RequestParam(name = "time", required = false) Double time) {
    if (time == null || distance == null) {
      ArrowError error = new ArrowError();
      return ResponseEntity.badRequest().body(error);
    } else {
      Arrow result = new Arrow(distance, time);
      return ResponseEntity.ok().body(result);
    }
  }

  @GetMapping("/rocket")
  @ResponseBody
  public Ship getShipInfo() {
    return shipService.getGuardianShip();
  }

  @GetMapping("/rocket/fill")
  @ResponseBody
  public ResponseEntity fillShip(@RequestParam(name = "caliber", required = false) String caliber,
      @RequestParam(name = "amount", required = false) Integer amount) {
    if (caliber == null || amount == null) {
      return ResponseEntity.badRequest().body(new ShipError());
    } else {
      shipService.placeCargo(caliber, amount);
      shipService.countShipStatus();
      shipService.countIfReady();

      ShipDTO shipDTO = new ShipDTO(caliber,amount,shipService.getGuardianShip().getShipStatus(),
          shipService.getGuardianShip().isReady());

      return ResponseEntity.ok().body(shipDTO);
    }
  }
}

