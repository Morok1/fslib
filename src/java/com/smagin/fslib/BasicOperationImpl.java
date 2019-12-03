package com.smagin.fslib;

import com.smagin.fslib.api.BasicFileOperations;

import java.io.File;

public class BasicOperationImpl implements BasicFileOperations {
    private final File container;

    public BasicOperationImpl(File container) {
        this.container = container;
    }


    @Override
    public File write(File file) {

        return null;
    }

    @Override
    public File append(File file) {
        return null;
    }

    @Override
    public void remove(File file) {

    }
}
