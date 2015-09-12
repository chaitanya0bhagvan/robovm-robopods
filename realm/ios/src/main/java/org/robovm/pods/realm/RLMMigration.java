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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/RLMMigration/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class RLMMigrationPtr extends Ptr<RLMMigration, RLMMigrationPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(RLMMigration.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public RLMMigration() {}
    protected RLMMigration(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "oldSchema")
    public native IntPtr getOldSchema();
    @Property(selector = "newSchema")
    public native IntPtr getNewSchema();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "enumerateObjects:block:")
    public native void enumerateObjects(String className, @Block RLMObjectMigrationCallback block);
    @Method(selector = "createObject:withValue:")
    public native RLMObject createObjectWithValue(String className, NSObject value);
    @Method(selector = "createObject:withObject:")
    public native RLMObject createObjectWithObject(String className, NSObject object);
    @Method(selector = "deleteObject:")
    public native void deleteObject(RLMObject object);
    @Method(selector = "deleteDataForClassName:")
    public native boolean deleteDataForClassName(String name);
    /*</methods>*/
}
