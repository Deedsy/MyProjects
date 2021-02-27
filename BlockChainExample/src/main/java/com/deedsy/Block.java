package com.deedsy;

import java.util.Arrays;


public class Block {

    private int previousBlockHash;
    private String [] data;
    private int hash;

    @Override
    public String toString() {
        return "Block []";
    }

    public Block(String [] data, int previousBlockHash) {
        this.data = data;
        this.previousBlockHash = previousBlockHash;
        this.hash = Arrays.hashCode(new Integer[] { data.hashCode(), previousBlockHash});
    }

    public int getPreviousBlockHash() {
        return previousBlockHash;
    }

    public void setPreviousBlockHash(int previousBlockHash) {
        this.previousBlockHash = previousBlockHash;
    }

    public String[] getData() {
        return data;
    }

    
    
}
