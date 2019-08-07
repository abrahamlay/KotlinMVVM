package com.abrahamlay.kotlinmvvm.util.base

import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment

/**
 * Created by Abraham Lay on 2019-08-07.
 */

 abstract class BaseActivity: AppCompatActivity(){



    fun replaceFragment(viewId: Int, fragment: Fragment, addToBackStack: Boolean) {
        val ft = supportFragmentManager.beginTransaction()
        ft.setCustomAnimations(
            android.R.anim.fade_in,
            android.R.anim.fade_out,
            android.R.anim.fade_in,
            android.R.anim.fade_out
        )
            .replace(viewId, fragment)

        if (addToBackStack) ft.addToBackStack(null)

        ft.commit()
    }


    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            android.R.id.home -> finish()
        }
        return super.onOptionsItemSelected(item)
    }
}