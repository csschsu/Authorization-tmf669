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
 * The event data structure
 */
@Schema(description = "The event data structure")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-08-22T11:22:07.892279+02:00[Europe/Stockholm]")
public class PartyRoleCreateEventPayload {
  @SerializedName("partyRole")
  private PartyRole partyRole = null;

  public PartyRoleCreateEventPayload partyRole(PartyRole partyRole) {
    this.partyRole = partyRole;
    return this;
  }

   /**
   * Get partyRole
   * @return partyRole
  **/
  @Schema(description = "")
  public PartyRole getPartyRole() {
    return partyRole;
  }

  public void setPartyRole(PartyRole partyRole) {
    this.partyRole = partyRole;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PartyRoleCreateEventPayload partyRoleCreateEventPayload = (PartyRoleCreateEventPayload) o;
    return Objects.equals(this.partyRole, partyRoleCreateEventPayload.partyRole);
  }

  @Override
  public int hashCode() {
    return Objects.hash(partyRole);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PartyRoleCreateEventPayload {\n");
    
    sb.append("    partyRole: ").append(toIndentedString(partyRole)).append("\n");
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
