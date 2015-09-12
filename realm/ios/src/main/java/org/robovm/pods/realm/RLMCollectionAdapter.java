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
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/RLMCollectionAdapter<T extends RLMObject>/*</name>*/
    extends /*<extends>*/NSFastEnumerationAdapter/*</extends>*/ 
    /*<implements>*/implements RLMCollection<T>/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*//*</constructors>*/
    /*<properties>*/
    @NotImplemented("count")
    public long getCount() { return 0; }
    @NotImplemented("objectClassName")
    public String getObjectClassName() { return null; }
    @NotImplemented("realm")
    public RLMRealm getRealm() { return null; }
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @NotImplemented("objectAtIndex:")
    public T objectAtIndex(long index) { return null; }
    @NotImplemented("firstObject")
    public T firstObject() { return null; }
    @NotImplemented("lastObject")
    public T lastObject() { return null; }
    @NotImplemented("indexOfObject:")
    public long indexOfObject(T object) { return 0; }
    @NotImplemented("indexOfObjectWithPredicate:")
    public long indexOfObjectWithPredicate(NSPredicate predicate) { return 0; }
    @NotImplemented("objectsWithPredicate:")
    public RLMResults<T> objectsWithPredicate(NSPredicate predicate) { return null; }
    @NotImplemented("sortedResultsUsingProperty:ascending:")
    public RLMResults<T> sortedResultsUsingProperty(NSString property, boolean ascending) { return null; }
    @NotImplemented("sortedResultsUsingDescriptors:")
    public RLMResults<T> sortedResultsUsingDescriptors(List<RLMSortDescriptor> properties) { return null; }
    @NotImplemented("objectAtIndexedSubscript:")
    public T objectAtIndexedSubscript(long index) { return null; }
    @NotImplemented("valueForKey:")
    public long valueForKey(String key) { return 0; }
    @NotImplemented("setValue:forKey:")
    public void setValue(T value, NSString key) {}
    /*</methods>*/
}
