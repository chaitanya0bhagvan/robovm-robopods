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
import org.robovm.pods.realm.TWTRAuthConfig;
import org.robovm.pods.realm.TWTRCoreOAuthSigning;
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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/DGTOAuthSigning/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class DGTOAuthSigningPtr extends Ptr<DGTOAuthSigning, DGTOAuthSigningPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(DGTOAuthSigning.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public DGTOAuthSigning(TWTRAuthConfig authConfig, DGTSession authSession) { super((SkipInit) null); initObject(initWithAuthConfig(authConfig, authSession)); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithAuthConfig:authSession:")
    protected native @Pointer long initWithAuthConfig(TWTRAuthConfig authConfig, DGTSession authSession);
    @Method(selector = "OAuthEchoHeadersToVerifyCredentialsWithParams:")
    public native NSDictionary<NSString, NSString> OAuthEchoHeadersToVerifyCredentialsWithParams(NSDictionary<NSString, NSString> params);
    /*</methods>*/
}
