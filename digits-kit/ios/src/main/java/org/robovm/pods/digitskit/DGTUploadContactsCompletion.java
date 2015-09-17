package org.robovm.pods.digitskit;

import org.robovm.apple.foundation.NSError;

/**
 * Created by c on 9/15/15.
 */
public interface DGTUploadContactsCompletion {
    void done(DGTContactsUploadResult result, NSError error);
}
