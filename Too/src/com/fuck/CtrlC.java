package com.fuck;

/**
 * This Class introduced how to handle Ctrl+C in your program <BR>
 * You can close file descriptor, close remote connection , release memory and
 * so on when Ctrl C happens.
 *
 * @author Ahui Wang
 *
 */
public class CtrlC implements Runnable {
	//如果在处理器中bExit设为true，则CtrlC线程退出
    private boolean bExit = false;
    private class ExitHandler extends Thread {
        public ExitHandler() {
            super("Exit Handler");
        }
        public void run() {
            System.out.println("Set exit");
            bExit = true;
        }
    }
    public CtrlC() {
        Runtime.getRuntime().addShutdownHook(new ExitHandler());
    }
    public void run() {
    	int i=0;
        // while (!bExit) {
    	while (i<100000) {
            // Do some thing
        	  System.out.println(i++);
    		 
        }
        System.out.println("Exit CtrlC");//如果通过ctrl c退出，这句不会执行。
    }
    public static void main(String[] args) throws InterruptedException {
        CtrlC ctrlc = new CtrlC();
        Thread t = new Thread(ctrlc);
        t.setName("Ctrl C Thread");
        t.run();//如果直接调用t.run()，则意味着先跑完run后，再执行往下的语句，此时不需要t.join()
       // t.join();//等待该线程死亡，即t线程。
        System.out.println("Exit Main");
    }
}