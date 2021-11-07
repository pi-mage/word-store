package store;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;

public class AtomicFileGroup {
    // java.nio.file.Files.move(Path source, Path target, CopyOption... options) with copyOptions and ATOMIC_MOVE

    private static final String stateFilename = "atomic-file-group-state";


    // a.bin 15
    // b.bin 6

    private File directory;
    private Map<File, Long> keepedFiles;
    private List<FileChange> fileChanges;
    private List<Pair<File, Long>> newKeepedFiles;
    private List<FileChange> newFileChanges;

    AtomicFileGroup(File directory) {

    }

    public synchronized void keepFile(File file, long sizeToKeep) {

    }

    public synchronized void removeFile(File file) {

    }

    public synchronized void moveFile(File source, File dest) {

    }

    public synchronized void commit() {

    }

    public synchronized void syncWithLastCommit() {

    }

    public synchronized void resetDirectory() {

    }

    abstract class FileChange {

        File file;

        abstract void apply(File dir) throws IOException;
    }

    class ChangeRemoveFile extends FileChange {

        @Override
        void apply(File dir) throws IOException {
            // update keepedFiles
        }
    }

    class ChangeMoveFile extends FileChange {

        File dest;

        @Override
        void apply(File dir) throws IOException {
            // update keepedFiles
        }
    }
}
