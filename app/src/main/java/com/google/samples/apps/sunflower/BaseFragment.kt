/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.samples.apps.sunflower

import android.content.Context
import android.os.Bundle
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

open class BaseFragment:Fragment() {
    private fun getMethodName(){
        val temp = Thread.currentThread().stackTrace
        val a = temp[3] as StackTraceElement
        println(javaClass.simpleName+"--------"+a.methodName)
    }
    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        getMethodName()
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        getMethodName()
    }

    override fun onAttachFragment(childFragment: Fragment) {
        super.onAttachFragment(childFragment)
        getMethodName()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        getMethodName()
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return super.onCreateView(inflater, container, savedInstanceState)
        getMethodName()
    }

    override fun onDestroy() {
        super.onDestroy()
        getMethodName()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        getMethodName()
    }

    override fun onDetach() {
        super.onDetach()
        getMethodName()
    }

    override fun onHiddenChanged(hidden: Boolean) {
        super.onHiddenChanged(hidden)
        getMethodName()
    }

    override fun onPause() {
        super.onPause()
        getMethodName()
    }

    override fun onResume() {
        super.onResume()
        getMethodName()
    }

    override fun onInflate(context: Context, attrs: AttributeSet, savedInstanceState: Bundle?) {
        super.onInflate(context, attrs, savedInstanceState)
        getMethodName()
    }

    override fun onStart() {
        super.onStart()
        getMethodName()
    }

    override fun onStop() {
        super.onStop()
        getMethodName()
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        getMethodName()
    }


}