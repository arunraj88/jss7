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

package org.mobicents.protocols.ss7.tools.simulator.tests.cap;

import org.mobicents.protocols.ss7.tools.simulator.common.CapApplicationContextScf;

/**
 *
 * @author sergey vetyutnev
 *
 */
public interface TestCapScfManMBean {

    CapApplicationContextScf getCapApplicationContext();

    String getCapApplicationContext_Value();

    void setCapApplicationContext(CapApplicationContextScf val);

    void putCapApplicationContext(String val);

    String getCurrentRequestDef();

    String closeCurrentDialog();

    String performInitiateCallAttempt(String msg);

    String performApplyCharging(String msg);

    String performCancel(String msg);

    String performConnect(String msg);

    String performContinue(String msg);

    String performReleaseCall(String msg);

    String performRequestReportBCSMEvent(String msg);

}