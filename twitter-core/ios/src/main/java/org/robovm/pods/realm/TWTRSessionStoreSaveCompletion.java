package org.robovm.pods.realm;

import org.robovm.apple.foundation.NSError;

/**
 * Created by c on 9/15/15.
 */
public interface TWTRSessionStoreSaveCompletion {
    void done(TWTRAuthSession session, NSError error);
}
