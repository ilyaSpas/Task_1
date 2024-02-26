package org.example;

import java.util.ArrayList;
import java.util.List;

public class History {

    private List<Snapshot> snapshots = new ArrayList<>();

    private int index = 0;

    public History() {
    }

    public Snapshot getSnapshot() {
        Snapshot lastSnapshot = snapshots.get(snapshots.size() - 1);
        snapshots.remove(snapshots.size() - 1);
        return lastSnapshot;
    }

    public void addSnapshot(Snapshot snapshot) {
        snapshots.add(snapshot);
        index++;
    }
}
