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

package com.google.samples.apps.sunflower.data

import android.graphics.Bitmap
import androidx.room.*

@Entity(tableName = "users",primaryKeys = ["user_name","user_id"]
)
data class User(
        @PrimaryKey(autoGenerate = true)

        @ColumnInfo(name = "user_id")
        private val id: String,
        @ColumnInfo(name = "user_name")
        private val name: String,
        private val lastName: String

){

        override fun toString() = name


        private fun getPic(): Bitmap {
                TODO("Not yet implemented")
        }

}