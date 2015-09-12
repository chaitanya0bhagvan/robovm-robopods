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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/RLMRealm/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class RLMRealmPtr extends Ptr<RLMRealm, RLMRealmPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(RLMRealm.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public RLMRealm() {}
    protected RLMRealm(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "path")
    public native String getPath();
    @Property(selector = "isReadOnly")
    public native boolean isReadOnly();
    @Property(selector = "inWriteTransaction")
    public native boolean isInWriteTransaction();
    @Property(selector = "configuration")
    public native IntPtr getConfiguration();
    @Property(selector = "autorefresh")
    public native boolean isAutorefresh();
    @Property(selector = "setAutorefresh:")
    public native void setAutorefresh(boolean v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "addNotificationBlock:")
    public native RLMNotificationToken addNotificationBlock(@Block RLMNotificationCallback block);
    @Method(selector = "removeNotification:")
    public native void removeNotification(RLMNotificationToken notificationToken);
    @Method(selector = "beginWriteTransaction")
    public native void beginWriteTransaction();
    @Method(selector = "commitWriteTransaction")
    public native void commitWriteTransaction();
    @Method(selector = "cancelWriteTransaction")
    public native void cancelWriteTransaction();
    @Method(selector = "transactionWithBlock:")
    public native void transactionWithBlock(@Block Runnable block);
    @Method(selector = "refresh")
    public native boolean refresh();
    @Method(selector = "writeCopyToPath:error:")
    public native boolean writeCopyToPath(String path, NSError.NSErrorPtr error);
    @Method(selector = "writeCopyToPath:encryptionKey:error:")
    public native boolean writeCopyToPath(String path, NSData key, NSError.NSErrorPtr error);
    @Method(selector = "invalidate")
    public native void invalidate();
    @Method(selector = "addObject:")
    public native void addObject(RLMObject object);
    @Method(selector = "addObjects:")
    public native void addObjects(NSArray<?> array);
    @Method(selector = "addOrUpdateObject:")
    public native void addOrUpdateObject(RLMObject object);
    @Method(selector = "addOrUpdateObjectsFromArray:")
    public native void addOrUpdateObjectsFromArray(NSObject array);
    @Method(selector = "deleteObject:")
    public native void deleteObject(RLMObject object);
    @Method(selector = "deleteObjects:")
    public native void deleteObjects(NSObject array);
    @Method(selector = "deleteAllObjects")
    public native void deleteAllObjects();
    @Method(selector = "defaultRealm")
    public static native RLMRealm defaultRealm();
    @Method(selector = "realmWithConfiguration:error:")
    public static native RLMRealm realmWithConfiguration(NSObject configuration, NSError.NSErrorPtr error);
    @Method(selector = "realmWithPath:")
    public static native RLMRealm realmWithPath(String path);
    @Method(selector = "realmWithPath:readOnly:error:")
    public static native RLMRealm realmWithPath(String path, boolean readonly, NSError.NSErrorPtr error);
    @Method(selector = "realmWithPath:encryptionKey:readOnly:error:")
    public static native RLMRealm realmWithPath(String path, NSData key, boolean readonly, NSError.NSErrorPtr error);
    @Method(selector = "setEncryptionKey:forRealmsAtPath:")
    public static native void setEncryptionKey(NSData key, NSString path);
    @Method(selector = "inMemoryRealmWithIdentifier:")
    public static native RLMRealm inMemoryRealm(String identifier);
    @Method(selector = "defaultRealmPath")
    public static native String getDefaultRealmPath();
    @Method(selector = "setDefaultRealmPath:")
    public static native void setDefaultRealmPath(String defaultRealmPath);
    @Method(selector = "setDefaultRealmSchemaVersion:withMigrationBlock:")
    public static native void setDefaultRealmSchemaVersion(long version, @Block RLMMigrationCallback block);
    @Method(selector = "setSchemaVersion:forRealmAtPath:withMigrationBlock:")
    public static native void setSchemaVersion(long version, NSString realmPath, @Block RLMMigrationCallback block);
    @Method(selector = "schemaVersionAtPath:error:")
    public static native long schemaVersionAtPath(String realmPath, NSError.NSErrorPtr error);
    @Method(selector = "schemaVersionAtPath:encryptionKey:error:")
    public static native long schemaVersionAtPath(NSString realmPath, NSData key, NSError.NSErrorPtr error);
    @Method(selector = "migrateRealm:")
    public static native NSError migrateRealm(NSObject configuration);
    @Method(selector = "migrateRealmAtPath:")
    public static native NSError migrateRealmAtPath(String realmPath);
    @Method(selector = "migrateRealmAtPath:encryptionKey:")
    public static native NSError migrateRealmAtPath(String realmPath, NSData key);
    /*</methods>*/
}
