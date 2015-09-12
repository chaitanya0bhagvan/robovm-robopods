package org.robovm.pods.realm;

/**
 * Created by c on 9/12/15.
 */
public interface RLMMigrationCallback {
    void done(RLMMigration migration, long oldSchemaVersion);
}
