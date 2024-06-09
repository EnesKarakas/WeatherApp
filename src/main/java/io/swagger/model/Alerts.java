package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import io.swagger.v3.oas.annotations.media.Schema;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Alerts
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-06-06T14:20:51.790816423Z[GMT]")
@JsonInclude(Include.NON_NULL)

public class Alerts {
  @JsonProperty("headline")
  private String headline = null;

  @JsonProperty("msgtype")
  private String msgtype = null;

  @JsonProperty("severity")
  private String severity = null;

  @JsonProperty("urgency")
  private String urgency = null;

  @JsonProperty("areas")
  private String areas = null;

  @JsonProperty("category")
  private String category = null;

  @JsonProperty("certainty")
  private String certainty = null;

  @JsonProperty("event")
  private String event = null;

  @JsonProperty("note")
  private String note = null;

  @JsonProperty("effective")
  private OffsetDateTime effective = null;

  @JsonProperty("expires")
  private OffsetDateTime expires = null;

  @JsonProperty("desc")
  private String desc = null;

  @JsonProperty("instruction")
  private String instruction = null;

  public Alerts headline(String headline) {
    this.headline = headline;
    return this;
  }

  /**
   * Get headline
   * 
   * @return headline
   **/
  @Schema(description = "")
  @NotNull

  public String getHeadline() {
    return headline;
  }

  public void setHeadline(String headline) {
    this.headline = headline;
  }

  public Alerts msgtype(String msgtype) {
    this.msgtype = msgtype;
    return this;
  }

  /**
   * Get msgtype
   * 
   * @return msgtype
   **/
  @Schema(description = "")

  public String getMsgtype() {
    return msgtype;
  }

  public void setMsgtype(String msgtype) {
    this.msgtype = msgtype;
  }

  public Alerts severity(String severity) {
    this.severity = severity;
    return this;
  }

  /**
   * Get severity
   * 
   * @return severity
   **/
  @Schema(description = "")

  public String getSeverity() {
    return severity;
  }

  public void setSeverity(String severity) {
    this.severity = severity;
  }

  public Alerts urgency(String urgency) {
    this.urgency = urgency;
    return this;
  }

  /**
   * Get urgency
   * 
   * @return urgency
   **/
  @Schema(description = "")

  public String getUrgency() {
    return urgency;
  }

  public void setUrgency(String urgency) {
    this.urgency = urgency;
  }

  public Alerts areas(String areas) {
    this.areas = areas;
    return this;
  }

  /**
   * Get areas
   * 
   * @return areas
   **/
  @Schema(description = "")

  public String getAreas() {
    return areas;
  }

  public void setAreas(String areas) {
    this.areas = areas;
  }

  public Alerts category(String category) {
    this.category = category;
    return this;
  }

  /**
   * Get category
   * 
   * @return category
   **/
  @Schema(description = "")
  @NotNull

  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public Alerts certainty(String certainty) {
    this.certainty = certainty;
    return this;
  }

  /**
   * Get certainty
   * 
   * @return certainty
   **/
  @Schema(description = "")

  public String getCertainty() {
    return certainty;
  }

  public void setCertainty(String certainty) {
    this.certainty = certainty;
  }

  public Alerts event(String event) {
    this.event = event;
    return this;
  }

  /**
   * Get event
   * 
   * @return event
   **/
  @Schema(description = "")
  @NotNull

  public String getEvent() {
    return event;
  }

  public void setEvent(String event) {
    this.event = event;
  }

  public Alerts note(String note) {
    this.note = note;
    return this;
  }

  /**
   * Get note
   * 
   * @return note
   **/
  @Schema(description = "")

  public String getNote() {
    return note;
  }

  public void setNote(String note) {
    this.note = note;
  }

  public Alerts effective(OffsetDateTime effective) {
    this.effective = effective;
    return this;
  }

  /**
   * Get effective
   * 
   * @return effective
   **/
  @Schema(description = "")
  @NotNull

  @Valid
  public OffsetDateTime getEffective() {
    return effective;
  }

  public void setEffective(OffsetDateTime effective) {
    this.effective = effective;
  }

  public Alerts expires(OffsetDateTime expires) {
    this.expires = expires;
    return this;
  }

  /**
   * Get expires
   * 
   * @return expires
   **/
  @Schema(description = "")
  @NotNull

  @Valid
  public OffsetDateTime getExpires() {
    return expires;
  }

  public void setExpires(OffsetDateTime expires) {
    this.expires = expires;
  }

  public Alerts desc(String desc) {
    this.desc = desc;
    return this;
  }

  /**
   * Get desc
   * 
   * @return desc
   **/
  @Schema(description = "")
  @NotNull

  public String getDesc() {
    return desc;
  }

  public void setDesc(String desc) {
    this.desc = desc;
  }

  public Alerts instruction(String instruction) {
    this.instruction = instruction;
    return this;
  }

  /**
   * Get instruction
   * 
   * @return instruction
   **/
  @Schema(description = "")
  @NotNull

  public String getInstruction() {
    return instruction;
  }

  public void setInstruction(String instruction) {
    this.instruction = instruction;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Alerts alerts = (Alerts) o;
    return Objects.equals(this.headline, alerts.headline) &&
        Objects.equals(this.msgtype, alerts.msgtype) &&
        Objects.equals(this.severity, alerts.severity) &&
        Objects.equals(this.urgency, alerts.urgency) &&
        Objects.equals(this.areas, alerts.areas) &&
        Objects.equals(this.category, alerts.category) &&
        Objects.equals(this.certainty, alerts.certainty) &&
        Objects.equals(this.event, alerts.event) &&
        Objects.equals(this.note, alerts.note) &&
        Objects.equals(this.effective, alerts.effective) &&
        Objects.equals(this.expires, alerts.expires) &&
        Objects.equals(this.desc, alerts.desc) &&
        Objects.equals(this.instruction, alerts.instruction);
  }

  @Override
  public int hashCode() {
    return Objects.hash(headline, msgtype, severity, urgency, areas, category, certainty, event, note, effective,
        expires, desc, instruction);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Alerts {\n");

    sb.append("    headline: ").append(toIndentedString(headline)).append("\n");
    sb.append("    msgtype: ").append(toIndentedString(msgtype)).append("\n");
    sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
    sb.append("    urgency: ").append(toIndentedString(urgency)).append("\n");
    sb.append("    areas: ").append(toIndentedString(areas)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    certainty: ").append(toIndentedString(certainty)).append("\n");
    sb.append("    event: ").append(toIndentedString(event)).append("\n");
    sb.append("    note: ").append(toIndentedString(note)).append("\n");
    sb.append("    effective: ").append(toIndentedString(effective)).append("\n");
    sb.append("    expires: ").append(toIndentedString(expires)).append("\n");
    sb.append("    desc: ").append(toIndentedString(desc)).append("\n");
    sb.append("    instruction: ").append(toIndentedString(instruction)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
