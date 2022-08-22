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

import java.util.Objects;

/**
 * Account reference. A account may be a party account or a financial account.
 */
@Schema(description = "Account reference. A account may be a party account or a financial account.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-08-22T11:22:07.892279+02:00[Europe/Stockholm]")
public class AccountRef {
  @SerializedName("id")
  private String id = null;

  @SerializedName("href")
  private String href = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("@baseType")
  private String _atBaseType = null;

  @SerializedName("@schemaLocation")
  private String _atSchemaLocation = null;

  @SerializedName("@type")
  private String _atType = null;

  @SerializedName("@referredType")
  private String _atReferredType = null;

  public AccountRef id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Unique identifier of the account
   * @return id
  **/
  @Schema(description = "Unique identifier of the account")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public AccountRef href(String href) {
    this.href = href;
    return this;
  }

   /**
   * Reference of the account
   * @return href
  **/
  @Schema(description = "Reference of the account")
  public String getHref() {
    return href;
  }

  public void setHref(String href) {
    this.href = href;
  }

  public AccountRef description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Detailed description of the account
   * @return description
  **/
  @Schema(description = "Detailed description of the account")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public AccountRef name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the account
   * @return name
  **/
  @Schema(required = true, description = "Name of the account")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public AccountRef _atBaseType(String _atBaseType) {
    this._atBaseType = _atBaseType;
    return this;
  }

   /**
   * When sub-classing, this defines the super-class
   * @return _atBaseType
  **/
  @Schema(description = "When sub-classing, this defines the super-class")
  public String getAtBaseType() {
    return _atBaseType;
  }

  public void setAtBaseType(String _atBaseType) {
    this._atBaseType = _atBaseType;
  }

  public AccountRef _atSchemaLocation(String _atSchemaLocation) {
    this._atSchemaLocation = _atSchemaLocation;
    return this;
  }

   /**
   * A URI to a JSON-Schema file that defines additional attributes and relationships
   * @return _atSchemaLocation
  **/
  @Schema(description = "A URI to a JSON-Schema file that defines additional attributes and relationships")
  public String getAtSchemaLocation() {
    return _atSchemaLocation;
  }

  public void setAtSchemaLocation(String _atSchemaLocation) {
    this._atSchemaLocation = _atSchemaLocation;
  }

  public AccountRef _atType(String _atType) {
    this._atType = _atType;
    return this;
  }

   /**
   * When sub-classing, this defines the sub-class entity name
   * @return _atType
  **/
  @Schema(description = "When sub-classing, this defines the sub-class entity name")
  public String getAtType() {
    return _atType;
  }

  public void setAtType(String _atType) {
    this._atType = _atType;
  }

  public AccountRef _atReferredType(String _atReferredType) {
    this._atReferredType = _atReferredType;
    return this;
  }

   /**
   * The actual type of the target instance when needed for disambiguation.
   * @return _atReferredType
  **/
  @Schema(description = "The actual type of the target instance when needed for disambiguation.")
  public String getAtReferredType() {
    return _atReferredType;
  }

  public void setAtReferredType(String _atReferredType) {
    this._atReferredType = _atReferredType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountRef accountRef = (AccountRef) o;
    return Objects.equals(this.id, accountRef.id) &&
        Objects.equals(this.href, accountRef.href) &&
        Objects.equals(this.description, accountRef.description) &&
        Objects.equals(this.name, accountRef.name) &&
        Objects.equals(this._atBaseType, accountRef._atBaseType) &&
        Objects.equals(this._atSchemaLocation, accountRef._atSchemaLocation) &&
        Objects.equals(this._atType, accountRef._atType) &&
        Objects.equals(this._atReferredType, accountRef._atReferredType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, href, description, name, _atBaseType, _atSchemaLocation, _atType, _atReferredType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountRef {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    _atBaseType: ").append(toIndentedString(_atBaseType)).append("\n");
    sb.append("    _atSchemaLocation: ").append(toIndentedString(_atSchemaLocation)).append("\n");
    sb.append("    _atType: ").append(toIndentedString(_atType)).append("\n");
    sb.append("    _atReferredType: ").append(toIndentedString(_atReferredType)).append("\n");
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