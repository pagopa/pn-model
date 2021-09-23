/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.pagopa.pn.api.dto.events;

import java.util.Arrays;
import java.util.Collection;

/**
 *
 * @author GIANGR40
 */
public class MessageType {

    /**
     * The inbound event message types
     */
    public static final String PN_EXT_CHN_PEC = "PN-EXT_CHN-PEC";
    public static final String PN_EXT_CHN_EMAIL = "PN-EXT_CHN-EMAIL";

    private static final Collection<String> messageTypes;

    static {
        messageTypes
                = Arrays.asList(
                PN_EXT_CHN_PEC,
                PN_EXT_CHN_EMAIL
                );
    }

    private MessageType(){

    }
    
    public static boolean checkIfKnown(String messageType) {
        return messageTypes.contains(messageType != null ? messageType : "");
    }

}
