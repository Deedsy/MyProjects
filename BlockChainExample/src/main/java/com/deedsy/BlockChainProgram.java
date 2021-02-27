package com.deedsy;

/**
 * Hello world!
 *
 */
public class BlockChainProgram 
{
    public static void main( String[] args )
    {
        String [] transactionList = {"Ricardo pays 80€ to Raquel", "Ricardo pays 50€ to Alex"};
        Block genesisBlock = new Block (transactionList,0);
    }
}
