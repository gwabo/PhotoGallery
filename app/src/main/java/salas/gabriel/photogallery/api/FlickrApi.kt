package salas.gabriel.photogallery.api

import retrofit2.http.GET
import retrofit2.http.Query

private const val API_KEY = "d9db48198e4550fdbbce0a90b4fdf12a"

interface FlickrApi {
    @GET("services/rest/?method=flickr.interestingness.getList")
    suspend fun fetchPhotos(): FlickrResponse

    @GET("services/rest/?method=flickr.photos.search")
    suspend fun searchPhotos(@Query("text") query: String) : FlickrResponse
}