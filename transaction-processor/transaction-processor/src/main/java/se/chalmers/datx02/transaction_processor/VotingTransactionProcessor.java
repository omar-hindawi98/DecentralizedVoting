package se.chalmers.datx02.transaction_processor;


import sawtooth.sdk.processor.TransactionProcessor;

public class VotingTransactionProcessor {
  
  public static void main(String[] args) throws InterruptedException {
  	// Connect to validator
    TransactionProcessor transactionProcessor = new TransactionProcessor(args[0]);
    // Register handler with the validator
    transactionProcessor.addHandler(new VotingHandler(args[1]));
    Thread thread = new Thread(transactionProcessor);
    thread.start();
    thread.join();
  }
}