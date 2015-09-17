/*
 * Copyright (C) 2013-2015 RoboVM AB
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.robovm.pods.realm;

/*<imports>*/
import java.io.*;
import java.nio.*;
import java.util.*;
import org.robovm.objc.*;
import org.robovm.objc.annotation.*;
import org.robovm.objc.block.*;
import org.robovm.rt.*;
import org.robovm.rt.annotation.*;
import org.robovm.rt.bro.*;
import org.robovm.rt.bro.annotation.*;
import org.robovm.rt.bro.ptr.*;
import org.robovm.apple.foundation.*;
import org.robovm.apple.coredata.*;
import org.robovm.apple.accounts.*;
import org.robovm.apple.uikit.*;
import org.robovm.apple.social.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Marshaler(ValuedEnum.AsMachineSizedUIntMarshaler.class)/*</annotations>*/
public enum /*<name>*/TWTRAPIErrorCode/*</name>*/ implements ValuedEnum {
    /*<values>*/
    CouldNotAuthenticate(32L),
    PageNotExist(34L),
    NotAuthorizedForEndpoint(37L),
    AccountSuspended(64L),
    APIVersionRetired(68L),
    RateLimitExceeded(88L),
    InvalidOrExpiredToken(89L),
    SSLInvalid(92L),
    OverCapacity(130L),
    InternalError(131L),
    CouldNotAuthenticateTimestampOutOfRange(135L),
    AlreadyFavorited(139L),
    CannotFollowOverLimit(161L),
    NotAuthorizedToSeeStatus(179L),
    OverDailyStatusUpdateLimit(185L),
    StatusIsDuplicate(187L),
    BadAuthenticationData(215L),
    RequestIsAutomated(226L),
    UserMustVerifyLogin(231L),
    BadGuestToken(239L),
    EndpointRetired(251L),
    ApplicationCannotPerformWriteAction(261L),
    CannotMuteSelf(271L),
    CannotMuteSpecifiedUser(272L),
    AlreadyRetweeted(327L),
    TooManyRequests(429L);
    /*</values>*/

    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<methods>*//*</methods>*/

    private final long n;

    private /*<name>*/TWTRAPIErrorCode/*</name>*/(long n) { this.n = n; }
    public long value() { return n; }
    public static /*<name>*/TWTRAPIErrorCode/*</name>*/ valueOf(long n) {
        for (/*<name>*/TWTRAPIErrorCode/*</name>*/ v : values()) {
            if (v.n == n) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + n + " found in " 
            + /*<name>*/TWTRAPIErrorCode/*</name>*/.class.getName());
    }
}
