package org.robovm.pods.realm;

/**
 * Created by c on 9/12/15.
 */
public interface RLMObjectMigrationCallback {
    void done(RLMObject oldObject, RLMObject newObject);
}
