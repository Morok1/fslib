package com.smagin.fslib.api;

import java.io.File;

public interface BasicFileOperations {
    File write(File file);
    File append(File file);
    void remove(File file);
    File rename(File file);
    File move(File file);
}
