package salas.gabriel.photogallery.api

import retrofit2.http.GET

private const val API_KEY = "d9db48198e4550fdbbce0a90b4fdf12a"

interface FlickrApi {
    @GET(
        "services/rest/?method=flickr.interestingness.getList" +
            "&api_key=$API_KEY" +
            "&format=json" +
            "&nojsoncallback=1" +
            "&extras=url_s")
    suspend fun fetchPhotos(): FlickrResponse
}