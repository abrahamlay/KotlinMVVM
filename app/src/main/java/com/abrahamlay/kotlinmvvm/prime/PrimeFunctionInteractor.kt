package com.abrahamlay.kotlinmvvm.prime

import com.abrahamlay.kotlinmvvm.util.CalculateListener
import com.abrahamlay.kotlinmvvm.util.postDelayed

/**
 * Created by Abraham Lay on 2019-08-07.
 */

class PrimeFunctionInteractor {
    fun calculate(input1: String, calculateListener: CalculateListener) {
        postDelayed(1000) {
            when {
                input1.isEmpty() -> calculateListener.onInput1Empty()
                else -> calculateListener.onSuccess(primeFunction(input1))
            }
        }
    }

    fun primeFunction(input1: String): String {
        val n = input1.toInt()
        var result = ""

        var hitung = 0;
        var angka = 2;


        while (hitung < n) {

            //set boolean prima ke true
            var prima = true

            for (pembagi in 2..angka / 2) {

                if (angka % pembagi == 0) {
                    prima = false//set prima ke false
                    break
                }
            }

            if (prima) {
                result += if(hitung == 0){
                    "$angka"
                }else{
                    ", $angka"
                }
                hitung++
            }
            //Cek bila angka adalah bilangan prima
            angka++
        }

        return result
    }

}