/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itc.mutexexample;

import java.util.concurrent.locks.ReentrantLock;

/**
 *
 * @author joe
 */
class IntegerObj {
    int value;
    ReentrantLock mutex = new ReentrantLock();

    IntegerObj(int val) {
        this.value = val;
    }

    //synchronized only allows one thread to access value at a time
    int inc(){


        mutex.lock();
        this.value++;
        int tempStoreValue = this.value;
        mutex.unlock();
          return tempStoreValue;





    }
}
