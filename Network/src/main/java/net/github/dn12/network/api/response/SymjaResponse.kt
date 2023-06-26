/*
 * Copyright 2021 Horácio Flávio Comé Júnior
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package net.github.dn12.network.api.response
import com.squareup.moshi.JsonClass

import com.squareup.moshi.Json


@JsonClass(generateAdapter = true)
data class SymjaResponse(
    @Json(name = "queryresult")
    val queryresult: Queryresult?
)

@JsonClass(generateAdapter = true)
data class Queryresult(
    @Json(name = "numpods")
    val numpods: Int?,
    @Json(name = "pods")
    val pods: List<Pod?>?,
    @Json(name = "success")
    val success: String?,
    @Json(name = "version")
    val version: String?
)

@JsonClass(generateAdapter = true)
data class Pod(
    @Json(name = "error")
    val error: String?,
    @Json(name = "numsubpods")
    val numsubpods: Int?,
    @Json(name = "scanner")
    val scanner: String?,
    @Json(name = "subpods")
    val subpods: List<Subpod?>?,
    @Json(name = "title")
    val title: String?
)

@JsonClass(generateAdapter = true)
data class Subpod(
    @Json(name = "html")
    val html: String?,
    @Json(name = "plaintext")
    val plaintext: String?
)