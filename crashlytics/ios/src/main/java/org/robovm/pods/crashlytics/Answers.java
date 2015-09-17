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
package org.robovm.pods.crashlytics;

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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/Answers/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class AnswersPtr extends Ptr<Answers, AnswersPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(Answers.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "logSignUpWithMethod:success:customAttributes:")
    public static native void logSignUpWithMethod(String signUpMethodOrNil, long signUpSucceededOrNil, NSDictionary<NSString, NSObject> customAttributesOrNil);
    @Method(selector = "logLoginWithMethod:success:customAttributes:")
    public static native void logLoginWithMethod(String loginMethodOrNil, long loginSucceededOrNil, NSDictionary<NSString, NSObject> customAttributesOrNil);
    @Method(selector = "logShareWithMethod:contentName:contentType:contentId:customAttributes:")
    public static native void logShareWithMethod(String shareMethodOrNil, String contentNameOrNil, String contentTypeOrNil, String contentIdOrNil, NSDictionary<NSString, NSObject> customAttributesOrNil);
    @Method(selector = "logInviteWithMethod:customAttributes:")
    public static native void logInviteWithMethod(String inviteMethodOrNil, NSDictionary<NSString, NSObject> customAttributesOrNil);
    @Method(selector = "logPurchaseWithPrice:currency:success:itemName:itemType:itemId:customAttributes:")
    public static native void logPurchaseWithPrice(double itemPriceOrNil, String currencyOrNil, long purchaseSucceededOrNil, String itemNameOrNil, String itemTypeOrNil, String itemIdOrNil, NSDictionary<NSString, NSObject> customAttributesOrNil);
    @Method(selector = "logLevelStart:customAttributes:")
    public static native void logLevelStart(String levelNameOrNil, NSDictionary<NSString, NSObject> customAttributesOrNil);
    @Method(selector = "logLevelEnd:score:success:customAttributes:")
    public static native void logLevelEnd(String levelNameOrNil, long scoreOrNil, long levelCompletedSuccesfullyOrNil, NSDictionary<NSString, NSObject> customAttributesOrNil);
    @Method(selector = "logAddToCartWithPrice:currency:itemName:itemType:itemId:customAttributes:")
    public static native void logAddToCartWithPrice(double itemPriceOrNil, String currencyOrNil, String itemNameOrNil, String itemTypeOrNil, String itemIdOrNil, NSDictionary<NSString, NSObject> customAttributesOrNil);
    @Method(selector = "logStartCheckoutWithPrice:currency:itemCount:customAttributes:")
    public static native void logStartCheckoutWithPrice(double totalPriceOrNil, String currencyOrNil, long itemCountOrNil, NSDictionary<NSString, NSObject> customAttributesOrNil);
    @Method(selector = "logRating:contentName:contentType:contentId:customAttributes:")
    public static native void logRating(long ratingOrNil, String contentNameOrNil, String contentTypeOrNil, String contentIdOrNil, NSDictionary<NSString, NSObject> customAttributesOrNil);
    @Method(selector = "logContentViewWithName:contentType:contentId:customAttributes:")
    public static native void logContentViewWithName(String contentNameOrNil, String contentTypeOrNil, String contentIdOrNil, NSDictionary<NSString, NSObject> customAttributesOrNil);
    @Method(selector = "logSearchWithQuery:customAttributes:")
    public static native void logSearchWithQuery(String queryOrNil, NSDictionary<NSString, NSObject> customAttributesOrNil);
    @Method(selector = "logCustomEventWithName:customAttributes:")
    public static native void logCustomEventWithName(String eventName, NSDictionary<NSString, NSObject> customAttributesOrNil);
    /*</methods>*/
}
