package ru.softlab.efr.common.dict.exchange.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Уровень иерархии адреса
 */
public enum AddressLevel {
  
  REGION("region"),
  
  AREA("area"),
  
  CITY("city"),
  
  LOCALITY("locality"),
  
  STREET("street"),
  
  UNKNOWN("unknown");

  private String value;

  AddressLevel(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static AddressLevel fromValue(String text) {
    for (AddressLevel b : AddressLevel.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}

