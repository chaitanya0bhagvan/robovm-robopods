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
package org.robovm.pods.digitskit;

/*<imports>*/
import java.io.*;
import java.nio.*;
import java.util.*;
import org.robovm.objc.*;
import org.robovm.objc.annotation.*;
import org.robovm.objc.block.*;
import org.robovm.pods.realm.TWTRAuthSession;
import org.robovm.rt.*;
import org.robovm.rt.annotation.*;
import org.robovm.rt.bro.*;
import org.robovm.rt.bro.annotation.*;
import org.robovm.rt.bro.ptr.*;
import org.robovm.apple.foundation.*;
import org.robovm.apple.uikit.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.coredata.*;
import org.robovm.apple.accounts.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/DGTSession/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/{

    /*<ptr>*/public static class DGTSessionPtr extends Ptr<DGTSession, DGTSessionPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(DGTSession.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected DGTSession(SkipInit skipInit) { super(skipInit); }
    public DGTSession(String authToken, String authTokenSecret, String userID, String phoneNumber) { super((SkipInit) null); initObject(initWithAuthToken(authToken, authTokenSecret, userID, phoneNumber)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "authToken")
    public native String getAuthToken();
    @Property(selector = "authTokenSecret")
    public native String getAuthTokenSecret();
    @Property(selector = "userID")
    public native String getUserID();
    @Property(selector = "phoneNumber")
    public native String getPhoneNumber();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithAuthToken:authTokenSecret:userID:phoneNumber:")
    protected native @Pointer long initWithAuthToken(String authToken, String authTokenSecret, String userID, String phoneNumber);
    /*</methods>*/
}
