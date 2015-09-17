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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/DGTAppearance/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class DGTAppearancePtr extends Ptr<DGTAppearance, DGTAppearancePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(DGTAppearance.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public DGTAppearance() {}
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "backgroundColor")
    public native UIColor getBackgroundColor();
    @Property(selector = "setBackgroundColor:")
    public native void setBackgroundColor(UIColor v);
    @Property(selector = "accentColor")
    public native UIColor getAccentColor();
    @Property(selector = "setAccentColor:")
    public native void setAccentColor(UIColor v);
    @Property(selector = "headerFont")
    public native UIFont getHeaderFont();
    @Property(selector = "setHeaderFont:")
    public native void setHeaderFont(UIFont v);
    @Property(selector = "labelFont")
    public native UIFont getLabelFont();
    @Property(selector = "setLabelFont:")
    public native void setLabelFont(UIFont v);
    @Property(selector = "bodyFont")
    public native UIFont getBodyFont();
    @Property(selector = "setBodyFont:")
    public native void setBodyFont(UIFont v);
    @Property(selector = "logoImage")
    public native UIImage getLogoImage();
    @Property(selector = "setLogoImage:")
    public native void setLogoImage(UIImage v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
