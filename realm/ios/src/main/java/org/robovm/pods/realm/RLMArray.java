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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/RLMArray<T extends RLMObject>/*</name>*/
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements RLMCollection<T>, NSFastEnumeration/*</implements>*/ {

    /*<ptr>*/public static class RLMArrayPtr extends Ptr<RLMArray, RLMArrayPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(RLMArray.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected RLMArray(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "objectClassName")
    public native String getObjectClassName();
    @Property(selector = "realm")
    public native RLMRealm getRealm();
    @Property(selector = "isInvalidated")
    public native boolean isInvalidated();
    @Property(selector = "count")
    public native @MachineSizedUInt long getCount();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "objectAtIndex:")
    public native T objectAtIndex(@MachineSizedUInt long index);
    @Method(selector = "firstObject")
    public native T firstObject();
    @Method(selector = "lastObject")
    public native T lastObject();
    @Method(selector = "addObject:")
    public native void addObject(T object);
    @Method(selector = "addObjects:")
    public native void addObjects(NSArray<T> objects);
    @Method(selector = "insertObject:atIndex:")
    public native void insertObject(T anObject, @MachineSizedUInt long index);
    @Method(selector = "removeObjectAtIndex:")
    public native void removeObjectAtIndex(@MachineSizedUInt long index);
    @Method(selector = "removeLastObject")
    public native void removeLastObject();
    @Method(selector = "removeAllObjects")
    public native void removeAllObjects();
    @Method(selector = "replaceObjectAtIndex:withObject:")
    public native void replaceObjectAtIndex(@MachineSizedUInt long index, T anObject);
    @Method(selector = "moveObjectAtIndex:toIndex:")
    public native void moveObjectAtIndex(@MachineSizedUInt long sourceIndex, @MachineSizedUInt long destinationIndex);
    @Method(selector = "exchangeObjectAtIndex:withObjectAtIndex:")
    public native void exchangeObjectAtIndex(@MachineSizedUInt long index1, @MachineSizedUInt long index2);
    @Method(selector = "indexOfObject:")
    public native @MachineSizedUInt long indexOfObject(T object);
    @Method(selector = "indexOfObjectWithPredicate:")
    public native @MachineSizedUInt long indexOfObjectWithPredicate(NSPredicate predicate);
    @Method(selector = "objectsWithPredicate:")
    public native RLMResults<T> objectsWithPredicate(NSPredicate predicate);
    @Method(selector = "sortedResultsUsingProperty:ascending:")
    public native RLMResults<T> sortedResultsUsingProperty(String property, boolean ascending);
    @Method(selector = "sortedResultsUsingDescriptors:")
    public native RLMResults<T> sortedResultsUsingDescriptors(NSArray<RLMSortDescriptor> properties);
    @Method(selector = "objectAtIndexedSubscript:")
    public native T objectAtIndexedSubscript(@MachineSizedUInt long index);
    @Method(selector = "setObject:atIndexedSubscript:")
    public native void setObject(T newValue, @MachineSizedUInt long index);
    @Method(selector = "valueForKey:")
    public native NSObject valueForKey(String key);
    @Method(selector = "setValue:forKey:")
    public native void setValue(NSObject value, NSString key);
    /*</methods>*/
}
