/*
 * TeleStax, Open Source Cloud Communications
 * Copyright 2011-2013, Telestax Inc and individual contributors
 * by the @authors tag.
 *
 * This program is free software: you can redistribute it and/or modify
 * under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation; either version 3 of
 * the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>
 */

package org.mobicents.protocols.ss7.map.api.errors;

/**
 *
 * SM-DeliveryFailureCause ::= SEQUENCE { sm-EnumeratedDeliveryFailureCause SM-EnumeratedDeliveryFailureCause, diagnosticInfo
 * SignalInfo OPTIONAL, extensionContainer ExtensionContainer OPTIONAL, ...}
 *
 *
 *
 * @author sergey vetyutnev
 *
 */
public enum SMEnumeratedDeliveryFailureCause {
    memoryCapacityExceeded(0), equipmentProtocolError(1), equipmentNotSMEquipped(2), unknownServiceCentre(3), scCongestion(4), invalidSMEAddress(
            5), subscriberNotSCSubscriber(6);

    private int code;

    private SMEnumeratedDeliveryFailureCause(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public static SMEnumeratedDeliveryFailureCause getInstance(int code) {
        switch (code) {
            case 0:
                return memoryCapacityExceeded;
            case 1:
                return equipmentProtocolError;
            case 2:
                return equipmentNotSMEquipped;
            case 3:
                return unknownServiceCentre;
            case 4:
                return scCongestion;
            case 5:
                return invalidSMEAddress;
            case 6:
                return subscriberNotSCSubscriber;
            default:
                return null;
        }
    }
}
