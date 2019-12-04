package com.smagin.fslib;

import com.smagin.fslib.api.BasicFileOperations;

import java.io.*;

public class BasicOperationImpl implements BasicFileOperations {
    private final File container;

    public BasicOperationImpl(String name) {
        this.container = new File(name);
    }

    @Override
    public File write(File file) {
        try {
            FileWriter fstream = new FileWriter(file);
            BufferedWriter out  = new BufferedWriter(fstream);

            FileInputStream fileInputStream = new FileInputStream(file);
            BufferedReader in = new BufferedReader(new InputStreamReader(fileInputStream));

        } catch (FileNotFoundException e) {
            System.err.println("File with cause " + e.getCause());
        } catch (IOException e) {
            System.err.println("File operations break with cause" + e.getCause());
        }

        return null;
    }

    @Override
    public File append(File file) {
        return null;
    }

    @Override
    public void remove(File file) { }

    @Override
    public File rename(File file) { return null; }

    @Override
    public File move(File file) { return null; }
}
