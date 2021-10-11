/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itc.mutexexample;

import java.util.concurrent.atomic.AtomicInteger;

/**
 *
 * @author joe
 */
class IntegerObj {
    AtomicInteger value;
    IntegerObj(int val) {
        //

         value = new AtomicInteger(val);


    }
    int inc(){

        return value.incrementAndGet();

    //    this.value++;
    //    return this.value;
    }
}
