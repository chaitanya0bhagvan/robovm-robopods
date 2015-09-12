////////////////////////////////////////////////////////////////////////////
//
// Copyright 2014 Realm Inc.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.
//
////////////////////////////////////////////////////////////////////////////

#import <Foundation/Foundation.h>

//This is a hack.
//We have to put #import "RLMProperty.h" on top other wise the enum are not getting created. 
#import "RLMProperty.h"
#import "RLMArray.h"
#import "RLMMigration.h"
#import "RLMObject.h"
#import "RLMObjectBase.h"
#import "RLMObjectSchema.h"
#import "RLMRealm.h"
#import "RLMRealmConfiguration.h"
#import "RLMResults.h"
#import "RLMSchema.h"
#import "RLMCollection.h"
#import "RLMConstants.h"

#import <Realm/RLMArray.h>
#import <Realm/RLMMigration.h>
#import <Realm/RLMObject.h>
#import <Realm/RLMObjectSchema.h>
#import <Realm/RLMPlatform.h>
#import <Realm/RLMProperty.h>
#import <Realm/RLMRealm.h>
#import <Realm/RLMRealmConfiguration.h>
#import <Realm/RLMResults.h>
#import <Realm/RLMSchema.h>
