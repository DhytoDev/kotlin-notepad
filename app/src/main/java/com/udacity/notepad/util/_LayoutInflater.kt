package com.udacity.notepad.util

import android.content.Context
import android.view.LayoutInflater

/**
 * Created by izadalab on 10/12/17.
 */


val Context.layoutInflater get() = LayoutInflater.from(this)