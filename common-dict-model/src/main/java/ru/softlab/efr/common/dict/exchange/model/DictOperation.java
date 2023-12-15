package ru.softlab.efr.common.dict.exchange.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Тип операции по справочнику (обновление/проверка)
 */
public enum DictOperation {
  
  UPDATE("update"),
  
  CHECK("check"),
  
  FINISHED("finished");

  private String value;

  DictOperation(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static DictOperation fromValue(String text) {
    for (DictOperation b : DictOperation.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}

