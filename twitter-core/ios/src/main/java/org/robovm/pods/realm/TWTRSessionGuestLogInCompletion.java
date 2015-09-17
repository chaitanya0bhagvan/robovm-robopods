package org.robovm.pods.realm;

import org.robovm.apple.foundation.NSError;

/**
 * Created by c on 9/15/15.
 */
public interface TWTRSessionGuestLogInCompletion {
    void done(TWTRGuestSession guestSession, org.robovm.apple.foundation.NSError error);
}
