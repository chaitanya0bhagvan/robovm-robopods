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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/RLMObject/*</name>*/ 
    extends /*<extends>*/RLMObjectBase/*</extends>*/
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class RLMObjectPtr extends Ptr<RLMObject, RLMObjectPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(RLMObject.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public RLMObject() {}
    protected RLMObject(SkipInit skipInit) { super(skipInit); }
    public RLMObject(NSObject value) { super((SkipInit) null); initObject(initWithValue(value)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "objectSchema")
    public native RLMObjectSchema getObjectSchema();
    @Property(selector = "isInvalidated")
    public native boolean isInvalidated();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithValue:")
    protected native @Pointer long initWithValue(NSObject value);
    @Method(selector = "linkingObjectsOfClass:forProperty:")
    public native NSArray<?> linkingObjectsOfClass$forProperty$(String className, String property);
    @Method(selector = "isEqualToObject:")
    public native boolean isEqualToObject(RLMObject object);
    @Method(selector = "objectForKeyedSubscript:")
    public native NSObject objectForKeyedSubscript(String key);
    @Method(selector = "setObject:forKeyedSubscript:")
    public native void setObject(NSObject obj, String key);
    @Method(selector = "className")
    public static native String getClassName();
    @Method(selector = "createInDefaultRealmWithValue:")
    public static native RLMObject createInDefaultRealmWithValue(NSObject value);
    @Method(selector = "createInDefaultRealmWithObject:")
    public static native RLMObject createInDefaultRealmWithObject(NSObject object);
    @Method(selector = "createInRealm:withValue:")
    public static native RLMObject createInRealmWithValue(NSObject realm, NSObject value);
    @Method(selector = "createInRealm:withObject:")
    public static native RLMObject createInRealmWithObject(NSObject realm, NSObject object);
    @Method(selector = "createOrUpdateInDefaultRealmWithValue:")
    public static native RLMObject createOrUpdateInDefaultRealmWithValue(NSObject value);
    @Method(selector = "createOrUpdateInDefaultRealmWithObject:")
    public static native RLMObject createOrUpdateInDefaultRealmWithObject(NSObject object);
    @Method(selector = "createOrUpdateInRealm:withValue:")
    public static native RLMObject createOrUpdateInRealmWithValue(NSObject realm, NSObject value);
    @Method(selector = "createOrUpdateInRealm:withObject:")
    public static native RLMObject createOrUpdateInRealmWithObject(NSObject realm, NSObject object);
    @Method(selector = "indexedProperties")
    public static native NSArray<?> indexedProperties();
    @Method(selector = "defaultPropertyValues")
    public static native NSDictionary<NSString, ?> defaultPropertyValues();
    @Method(selector = "primaryKey")
    public static native NSString primaryKey();
    @Method(selector = "ignoredProperties")
    public static native NSArray<NSString> getIgnoredProperties();
    @Method(selector = "requiredProperties")
    public static native NSArray<?> requiredProperties();
    @Method(selector = "allObjects")
    public static native RLMResults allObjects();
    @Method(selector = "objectsWithPredicate:")
    public static native RLMResults objectsWithPredicate(NSPredicate predicate);
    @Method(selector = "objectForPrimaryKey:")
    public static native RLMObject objectForPrimaryKey(NSObject primaryKey);
    @Method(selector = "allObjectsInRealm:")
    public static native RLMResults allObjectsInRealm(NSObject realm);
    @Method(selector = "objectsInRealm:withPredicate:")
    public static native RLMResults objectsInRealm(RLMRealm realm, NSPredicate predicate);
    @Method(selector = "objectInRealm:forPrimaryKey:")
    public static native RLMObject objectInRealm(RLMRealm realm, NSObject primaryKey);
    /*</methods>*/
}
