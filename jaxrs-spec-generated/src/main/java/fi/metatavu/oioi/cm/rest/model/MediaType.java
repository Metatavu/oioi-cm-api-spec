package fi.metatavu.oioi.cm.rest.model;

import java.util.UUID;
import java.util.List;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import fi.metatavu.oioi.cm.rest.model.*;
import javax.validation.constraints.*;
import javax.validation.Valid;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets MediaType
 */
public enum MediaType {
  FOLDER("FOLDER"),
    IMAGE("IMAGE"),
    TEXT("TEXT"),
    VIDEO("VIDEO"),
    PDF("PDF");

  private String value;

  MediaType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static MediaType fromValue(String text) {
    for (MediaType b : MediaType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
