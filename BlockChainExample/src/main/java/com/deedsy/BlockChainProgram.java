package com.deedsy;

import java.util.ArrayList;

/**
 * Hello world!
 *
 */
public class BlockChainProgram 
{
    public static void main( String[] args )
    {

        ArrayList<String> blockChain = new ArrayList<String> ();

        String [] transactionList = {"Ricardo pays 80€ to Raquel", "Ricardo pays 50€ to Alex"};
        Block genesisBlock = new Block (transactionList,0);
    }
}
