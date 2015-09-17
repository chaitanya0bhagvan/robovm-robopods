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
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/TWTRSession/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements TWTRAuthSession/*</implements>*/ {

    /*<ptr>*/public static class TWTRSessionPtr extends Ptr<TWTRSession, TWTRSessionPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(TWTRSession.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public TWTRSession() {}
    protected TWTRSession(SkipInit skipInit) { super(skipInit); }
    public TWTRSession(NSCoder aDecoder) { super((SkipInit) null); initObject(init(aDecoder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "authToken")
    public native String getAuthToken();
    @Property(selector = "authTokenSecret")
    public native String getAuthTokenSecret();
    @Property(selector = "userName")
    public native String getUserName();
    @Property(selector = "userID")
    public native String getUserID();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithSessionDictionary:")
    public native TWTRSession initWithSessionDictionary(NSDictionary<NSString, NSString> sessionDictionary);
    @Method(selector = "initWithAuthToken:authTokenSecret:userName:userID:")
    public native TWTRSession initWithAuthToken(String authToken, String authTokenSecret, String userName, String userID);
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder aDecoder);
    /*</methods>*/
}
