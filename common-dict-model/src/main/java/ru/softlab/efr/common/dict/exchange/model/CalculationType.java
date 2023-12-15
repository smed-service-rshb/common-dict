package ru.softlab.efr.common.dict.exchange.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Способ расчета курса валюты Организации
 */
public enum CalculationType {
  
  CB_RF_RATE("CB_RF_RATE"),
  
  SET_BY_ADMINISTRATOR("SET_BY_ADMINISTRATOR"),
  
  CB_RF_WITH_PERCENT("CB_RF_WITH_PERCENT");

  private String value;

  CalculationType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static CalculationType fromValue(String text) {
    for (CalculationType b : CalculationType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}

