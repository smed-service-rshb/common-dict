package ru.softlab.efr.common.dict.exchange.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Тип строения
 */
public enum HouseType {
  
  UNKNOWN("unknown"),
  
  BUILDING("building"),
  
  CONSTRUCTION("construction"),
  
  LETTER("letter");

  private String value;

  HouseType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static HouseType fromValue(String text) {
    for (HouseType b : HouseType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}

