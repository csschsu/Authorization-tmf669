/*
 * Party Role Management
 * This is Swagger UI environment generated for the TMF Party Role Management specification
 *
 * OpenAPI spec version: 4.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.tmf669.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;
import org.threeten.bp.OffsetDateTime;

import java.util.Objects;
/**
 * The notification data structure
 */
@Schema(description = "The notification data structure")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-08-22T11:22:07.892279+02:00[Europe/Stockholm]")
public class PartyRoleAttributeValueChangeEvent {
  @SerializedName("eventId")
  private String eventId = null;

  @SerializedName("eventTime")
  private OffsetDateTime eventTime = null;

  @SerializedName("eventType")
  private String eventType = null;

  @SerializedName("correlationId")
  private String correlationId = null;

  @SerializedName("domain")
  private String domain = null;

  @SerializedName("title")
  private String title = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("priority")
  private String priority = null;

  @SerializedName("timeOcurred")
  private OffsetDateTime timeOcurred = null;

  @SerializedName("fieldPath")
  private String fieldPath = null;

  @SerializedName("event")
  private PartyRoleAttributeValueChangeEventPayload event = null;

  public PartyRoleAttributeValueChangeEvent eventId(String eventId) {
    this.eventId = eventId;
    return this;
  }

   /**
   * The identifier of the notification.
   * @return eventId
  **/
  @Schema(description = "The identifier of the notification.")
  public String getEventId() {
    return eventId;
  }

  public void setEventId(String eventId) {
    this.eventId = eventId;
  }

  public PartyRoleAttributeValueChangeEvent eventTime(OffsetDateTime eventTime) {
    this.eventTime = eventTime;
    return this;
  }

   /**
   * Time of the event occurrence.
   * @return eventTime
  **/
  @Schema(description = "Time of the event occurrence.")
  public OffsetDateTime getEventTime() {
    return eventTime;
  }

  public void setEventTime(OffsetDateTime eventTime) {
    this.eventTime = eventTime;
  }

  public PartyRoleAttributeValueChangeEvent eventType(String eventType) {
    this.eventType = eventType;
    return this;
  }

   /**
   * The type of the notification.
   * @return eventType
  **/
  @Schema(description = "The type of the notification.")
  public String getEventType() {
    return eventType;
  }

  public void setEventType(String eventType) {
    this.eventType = eventType;
  }

  public PartyRoleAttributeValueChangeEvent correlationId(String correlationId) {
    this.correlationId = correlationId;
    return this;
  }

   /**
   * The correlation id for this event.
   * @return correlationId
  **/
  @Schema(description = "The correlation id for this event.")
  public String getCorrelationId() {
    return correlationId;
  }

  public void setCorrelationId(String correlationId) {
    this.correlationId = correlationId;
  }

  public PartyRoleAttributeValueChangeEvent domain(String domain) {
    this.domain = domain;
    return this;
  }

   /**
   * The domain of the event.
   * @return domain
  **/
  @Schema(description = "The domain of the event.")
  public String getDomain() {
    return domain;
  }

  public void setDomain(String domain) {
    this.domain = domain;
  }

  public PartyRoleAttributeValueChangeEvent title(String title) {
    this.title = title;
    return this;
  }

   /**
   * The title of the event.
   * @return title
  **/
  @Schema(description = "The title of the event.")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public PartyRoleAttributeValueChangeEvent description(String description) {
    this.description = description;
    return this;
  }

   /**
   * An explanatory of the event.
   * @return description
  **/
  @Schema(description = "An explanatory of the event.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public PartyRoleAttributeValueChangeEvent priority(String priority) {
    this.priority = priority;
    return this;
  }

   /**
   * A priority.
   * @return priority
  **/
  @Schema(description = "A priority.")
  public String getPriority() {
    return priority;
  }

  public void setPriority(String priority) {
    this.priority = priority;
  }

  public PartyRoleAttributeValueChangeEvent timeOcurred(OffsetDateTime timeOcurred) {
    this.timeOcurred = timeOcurred;
    return this;
  }

   /**
   * The time the event occured.
   * @return timeOcurred
  **/
  @Schema(description = "The time the event occured.")
  public OffsetDateTime getTimeOcurred() {
    return timeOcurred;
  }

  public void setTimeOcurred(OffsetDateTime timeOcurred) {
    this.timeOcurred = timeOcurred;
  }

  public PartyRoleAttributeValueChangeEvent fieldPath(String fieldPath) {
    this.fieldPath = fieldPath;
    return this;
  }

   /**
   * The path identifying the object field concerned by this notification.
   * @return fieldPath
  **/
  @Schema(description = "The path identifying the object field concerned by this notification.")
  public String getFieldPath() {
    return fieldPath;
  }

  public void setFieldPath(String fieldPath) {
    this.fieldPath = fieldPath;
  }

  public PartyRoleAttributeValueChangeEvent event(PartyRoleAttributeValueChangeEventPayload event) {
    this.event = event;
    return this;
  }

   /**
   * Get event
   * @return event
  **/
  @Schema(description = "")
  public PartyRoleAttributeValueChangeEventPayload getEvent() {
    return event;
  }

  public void setEvent(PartyRoleAttributeValueChangeEventPayload event) {
    this.event = event;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PartyRoleAttributeValueChangeEvent partyRoleAttributeValueChangeEvent = (PartyRoleAttributeValueChangeEvent) o;
    return Objects.equals(this.eventId, partyRoleAttributeValueChangeEvent.eventId) &&
        Objects.equals(this.eventTime, partyRoleAttributeValueChangeEvent.eventTime) &&
        Objects.equals(this.eventType, partyRoleAttributeValueChangeEvent.eventType) &&
        Objects.equals(this.correlationId, partyRoleAttributeValueChangeEvent.correlationId) &&
        Objects.equals(this.domain, partyRoleAttributeValueChangeEvent.domain) &&
        Objects.equals(this.title, partyRoleAttributeValueChangeEvent.title) &&
        Objects.equals(this.description, partyRoleAttributeValueChangeEvent.description) &&
        Objects.equals(this.priority, partyRoleAttributeValueChangeEvent.priority) &&
        Objects.equals(this.timeOcurred, partyRoleAttributeValueChangeEvent.timeOcurred) &&
        Objects.equals(this.fieldPath, partyRoleAttributeValueChangeEvent.fieldPath) &&
        Objects.equals(this.event, partyRoleAttributeValueChangeEvent.event);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventId, eventTime, eventType, correlationId, domain, title, description, priority, timeOcurred, fieldPath, event);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PartyRoleAttributeValueChangeEvent {\n");
    
    sb.append("    eventId: ").append(toIndentedString(eventId)).append("\n");
    sb.append("    eventTime: ").append(toIndentedString(eventTime)).append("\n");
    sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
    sb.append("    correlationId: ").append(toIndentedString(correlationId)).append("\n");
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    timeOcurred: ").append(toIndentedString(timeOcurred)).append("\n");
    sb.append("    fieldPath: ").append(toIndentedString(fieldPath)).append("\n");
    sb.append("    event: ").append(toIndentedString(event)).append("\n");
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
