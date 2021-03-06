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

package org.mobicents.protocols.ss7.tcap.asn;

import org.mobicents.protocols.ss7.tcap.asn.comp.PAbortCauseType;

/**
 * @author baranowb
 *
 */
public enum AbortSourceType {

    User(0), Provider(1);

    private long type = -1;

    AbortSourceType(long t) {
        this.type = t;
    }

    /**
     * @return the type
     */
    public long getType() {
        return type;
    }

    public static AbortSourceType getFromInt(long t) throws ParseException {
        if (t == 0) {
            return User;
        } else if (t == 1) {
            return Provider;
        }

        throw new ParseException(PAbortCauseType.IncorrectTxPortion, null, "Wrong value of type: " + t);
    }

}
