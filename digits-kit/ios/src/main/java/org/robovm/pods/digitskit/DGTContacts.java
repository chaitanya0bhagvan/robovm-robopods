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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/DGTContacts/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class DGTContactsPtr extends Ptr<DGTContacts, DGTContactsPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(DGTContacts.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public DGTContacts(DGTSession userSession) { super((SkipInit) null); initObject(initWithUserSession(userSession)); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithUserSession:")
    protected native @Pointer long initWithUserSession(DGTSession userSession);
    @Method(selector = "startContactsUploadWithCompletion:")
    public native void startContactsUploadWithCompletion(@Block DGTUploadContactsCompletion completion);
    @Method(selector = "startContactsUploadWithTitle:completion:")
    public native void startContactsUploadWithTitle(String title, @Block DGTUploadContactsCompletion completion);
    @Method(selector = "startContactsUploadWithPresenterViewController:title:completion:")
    public native void startContactsUploadWithPresenterViewController(UIViewController presenterViewController, String title, @Block DGTUploadContactsCompletion completion);
    @Method(selector = "startContactsUploadWithDigitsAppearance:presenterViewController:title:completion:")
    public native void startContactsUploadWithDigitsAppearance(DGTAppearance appearance, UIViewController presenterViewController, String title, @Block DGTUploadContactsCompletion completion);
    @Method(selector = "lookupContactMatchesWithCursor:completion:")
    public native void lookupContactMatchesWithCursor(String cursor, @Block DGTLookupContactsCompletion completion);
    @Method(selector = "deleteAllUploadedContactsWithCompletion:")
    public native void deleteAllUploadedContactsWithCompletion(@Block DGTDeleteAllUploadedContactsCompletion completion);
    @Method(selector = "contactsAccessAuthorizationStatus")
    public static native DGTContactAccessAuthorizationStatus contactsAccessAuthorizationStatus();
    /*</methods>*/
}
