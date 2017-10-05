/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thread_netbeans;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author student
 */
public class Thread_NetBeans {

//    static int sum ;
    static AtomicInteger sum = new AtomicInteger();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        new Thread() {
            @Override
            public void run() {
                super.run(); //To change body of generated methods, choose Tools | Templates.

                for (int j = 0; j < 10000; j++) {
                    //sum++;
                    sum.incrementAndGet();
//                    try {
                    //                        System.out.println("      j=" + j);
                    //                        Thread.sleep(1000);
                    //                    } catch (InterruptedException ex) {
                    //                        Logger.getLogger(Thread_NetBeans.class.getName()).log(Level.SEVERE, null, ex);
                    //                    }
                }
            }
        }
                .start();

        new Thread(
                new Runnable() {
            @Override
            public void run() {

                for (int k = 0; k < 10000; k++) {
//                    sum++;
                    sum.incrementAndGet();
//                    try {
//
//                        System.out.println("            k=" + k);
//                        Thread.sleep(1000);
//                    } catch (InterruptedException ex) {
//                        Logger.getLogger(Thread_NetBeans.class.getName()).log(Level.SEVERE, null, ex);
//                    }
                }

            }
        }
        ).start();

        for (int i = 0;
                i < 10000; i++) {
//            sum++;
            sum.incrementAndGet();
//            try {
//                System.out.println("i=" + i);
//                Thread.sleep(1000);
//            } catch (InterruptedException ex) {
//                Logger.getLogger(Thread_NetBeans.class.getName()).log(Level.SEVERE, null, ex);
//            }
        }

        try {
//            System.out.println("sum=" + sum);
            System.out.println("sum=" + sum.intValue());
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Thread_NetBeans.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
