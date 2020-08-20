package com.logicipher.mvvm.data.remote

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import com.logicipher.mvvm.di.ApiInfo
import javax.inject.Inject
import javax.inject.Singleton

/**
 * Created by Shamji N S on 20-08-2020.
 */
@Singleton
public class ApiHeader @Inject constructor(
    publicApiHeader: PublicApiHeader,
    protectedApiHeader: ProtectedApiHeader
) {
    private val mProtectedApiHeader: ProtectedApiHeader
    private val mPublicApiHeader: PublicApiHeader
    fun getProtectedApiHeader(): ProtectedApiHeader {
        return mProtectedApiHeader
    }

    fun getPublicApiHeader(): PublicApiHeader {
        return mPublicApiHeader
    }

    class ProtectedApiHeader(
        @field:SerializedName("api_key") @field:Expose var apiKey: String,
        @field:SerializedName("user_id") @field:Expose var userId: Long,
        @field:SerializedName("access_token") @field:Expose var accessToken: String
    )

    class PublicApiHeader @Inject constructor(@field:SerializedName("api_key")
                                              @field:Expose @param:ApiInfo var apiKey: String)

    init {
        mPublicApiHeader = publicApiHeader
        mProtectedApiHeader = protectedApiHeader
    }
}
