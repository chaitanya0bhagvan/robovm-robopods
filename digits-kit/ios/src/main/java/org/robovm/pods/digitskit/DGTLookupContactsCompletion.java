package org.robovm.pods.digitskit;

import org.robovm.apple.foundation.NSArray;
import org.robovm.apple.foundation.NSError;

/**
 * Created by c on 9/15/15.
 */
public interface DGTLookupContactsCompletion {
    void done(NSArray<?> matches, String nextCursor, NSError error);
}
