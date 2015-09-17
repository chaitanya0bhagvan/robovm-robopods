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
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/RLMRealmConfiguration/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class RLMRealmConfigurationPtr extends Ptr<RLMRealmConfiguration, RLMRealmConfigurationPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(RLMRealmConfiguration.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public RLMRealmConfiguration() {}
    protected RLMRealmConfiguration(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "path")
    public native String getPath();
    @Property(selector = "setPath:")
    public native void setPath(String v);
    @Property(selector = "inMemoryIdentifier")
    public native String getInMemoryIdentifier();
    @Property(selector = "setInMemoryIdentifier:")
    public native void setInMemoryIdentifier(String v);
    @Property(selector = "encryptionKey")
    public native NSData getEncryptionKey();
    @Property(selector = "setEncryptionKey:")
    public native void setEncryptionKey(NSData v);
    @Property(selector = "readOnly")
    public native boolean isReadOnly();
    @Property(selector = "setReadOnly:")
    public native void setReadOnly(boolean v);
    @Property(selector = "schemaVersion")
    public native long getSchemaVersion();
    @Property(selector = "setSchemaVersion:")
    public native void setSchemaVersion(long v);
    @Property(selector = "migrationBlock")
    public native @Block RLMMigrationCallback getMigrationBlock();
    @Property(selector = "setMigrationBlock:")
    public native void setMigrationBlock(@Block RLMMigrationCallback v);
    @Property(selector = "objectClasses")
    public native NSArray<?> getObjectClasses();
    @Property(selector = "setObjectClasses:")
    public native void setObjectClasses(NSArray<?> v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "defaultConfiguration")
    public static native RLMRealmConfiguration defaultConfiguration();
    @Method(selector = "setDefaultConfiguration:")
    public static native void setDefaultConfiguration(RLMRealmConfiguration configuration);
    /*</methods>*/
}
