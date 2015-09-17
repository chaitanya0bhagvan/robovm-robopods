package org.robovm.pods.digitskit;

import org.robovm.apple.foundation.NSError;

/**
 * Created by c on 9/15/15.
 */
public interface DGTAuthenticationCompletion {
    void done(DGTSession session, NSError error);
}
