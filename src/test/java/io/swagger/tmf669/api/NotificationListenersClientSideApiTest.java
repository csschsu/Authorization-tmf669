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

package io.swagger.tmf669.api;

import io.swagger.tmf669.model.*;
import org.junit.Ignore;
import org.junit.Test;


/**
 * API tests for NotificationListenersClientSideApi
 */
@Ignore
public class NotificationListenersClientSideApiTest {

    private final io.swagger.tmf669.api.NotificationListenersClientSideApi api = new NotificationListenersClientSideApi();

    /**
     * Client listener for entity PartyRoleAttributeValueChangeEvent
     *
     * Example of a client listener for receiving the notification PartyRoleAttributeValueChangeEvent
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void listenToPartyRoleAttributeValueChangeEventTest() throws Exception {
        PartyRoleAttributeValueChangeEvent body = null;
        EventSubscription response = api.listenToPartyRoleAttributeValueChangeEvent(body);

        // TODO: test validations
    }
    /**
     * Client listener for entity PartyRoleCreateEvent
     *
     * Example of a client listener for receiving the notification PartyRoleCreateEvent
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void listenToPartyRoleCreateEventTest() throws Exception {
        PartyRoleCreateEvent body = null;
        EventSubscription response = api.listenToPartyRoleCreateEvent(body);

        // TODO: test validations
    }
    /**
     * Client listener for entity PartyRoleDeleteEvent
     *
     * Example of a client listener for receiving the notification PartyRoleDeleteEvent
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void listenToPartyRoleDeleteEventTest() throws Exception {
        PartyRoleDeleteEvent body = null;
        EventSubscription response = api.listenToPartyRoleDeleteEvent(body);

        // TODO: test validations
    }
    /**
     * Client listener for entity PartyRoleStateChangeEvent
     *
     * Example of a client listener for receiving the notification PartyRoleStateChangeEvent
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void listenToPartyRoleStateChangeEventTest() throws Exception {
        PartyRoleStateChangeEvent body = null;
        EventSubscription response = api.listenToPartyRoleStateChangeEvent(body);

        // TODO: test validations
    }
}