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
/*<visibility>*/public/*</visibility>*/ interface /*<name>*/RLMCollection<T extends RLMObject>/*</name>*/
    /*<implements>*/extends NSFastEnumeration/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<properties>*/
    @Property(selector = "count")
    long getCount();
    @Property(selector = "objectClassName")
    String getObjectClassName();
    @Property(selector = "realm")
    RLMRealm getRealm();
    /*</properties>*/
    /*<methods>*/
    @Method(selector = "objectAtIndex:")
    T objectAtIndex(long index);
    @Method(selector = "firstObject")
    T firstObject();
    @Method(selector = "lastObject")
    T lastObject();
    @Method(selector = "indexOfObject:")
    long indexOfObject(T object);
    @Method(selector = "indexOfObjectWithPredicate:")
    long indexOfObjectWithPredicate(NSPredicate predicate);
    @Method(selector = "objectsWithPredicate:")
    RLMResults<T> objectsWithPredicate(NSPredicate predicate);
    @Method(selector = "sortedResultsUsingProperty:ascending:")
    RLMResults<T> sortedResultsUsingProperty(NSString property, boolean ascending);
    @Method(selector = "sortedResultsUsingDescriptors:")
    RLMResults<T> sortedResultsUsingDescriptors(List<RLMSortDescriptor> properties);
    @Method(selector = "objectAtIndexedSubscript:")
    NSObject objectAtIndexedSubscript$(@MachineSizedUInt long index);
    @Method(selector = "valueForKey:")
    long valueForKey(String key);
    @Method(selector = "setValue:forKey:")
    void setValue(T value, NSString key);
    /*</methods>*/
    /*<adapter>*/
    /*</adapter>*/
}
