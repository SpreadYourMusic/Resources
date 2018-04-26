package com.spreadyourmusic.spreadyourmusic.apis

import com.spreadyourmusic.spreadyourmusic.models.*
import com.spreadyourmusic.spreadyourmusic.test.ServerEmulator

/**
 * Created by abel on 26/04/18.
 */

/**
 * Devuelve true si se puede acceder al servidor, false en caso contrario
 * Warning: esta operación puede ser costosa en tiempo
 */
fun isServerOnline(): Boolean {
    // TODO:
    return true
}

/**
 * Realiza un login en el servidor y devuelve el token de sesión
 */
//@Throws(Exception::class)
fun doLoginServer(username: String, password: String): String {
    //TODO:
    if (ServerEmulator.userList.containsKey(username)) {

        return "dfsdfdsdf"
    } else {
        throw Exception("Error")
    }
}

/**
 * Realiza una creación de usuario en el servidor y devuelve el token de sesión
 */
//@Throws(Exception::class)
fun doSignUpServer(user: User): String {
    //TODO:
    return "dfsdfdsdf"
}

/**
 * Elimina cuenta servidor
 */
//@Throws(Exception::class)
fun doDeleteAccountServer(user: String, sessionToken: String): Boolean {
    //TODO:
    return true
}

/**
 * Realiza un logout en el servidor
 */
//@Throws(Exception::class)
fun doLogoutServer(username: String, sessionToken: String) {
    //TODO:
}

/**
 * Obtiene la información asociada al usuario con nick @username
 */
//@Throws(Exception::class)
fun obtainUserDataServer(username: String, sessionToken: String?): User? {
    //TODO:
    if (ServerEmulator.userList.containsKey(username)) {
        return ServerEmulator.userList[username]
    } else {
        throw Exception("Error")
    }
}

/**
 * Obtiene las canciones creados por el usuario @user del servidor
 */
//@Throws(Exception::class)
fun obtainSongsFromUserServer(username: String): List<Song> {
    val resultado = ArrayList<Song>()
    for (i in ServerEmulator.songList) {
        if (i.value.album.creator.username == username) {
            resultado.add(i.value)
        }
    }
    return resultado
}

/**
 * Obtiene las playlist creadas por el usuario @user del servidor
 */
//@Throws(Exception::class)
fun obtainPlaylistsFromUserServer(username: String): List<Playlist> {
    val resultado = ArrayList<Playlist>()
    for (i in ServerEmulator.playlistList) {
        if (i.value.creator.username == username) {
            resultado.add(i.value)
        }
    }
    return resultado
}

/**
 * Devuelve una lista con los usuarios a los que sigue el usuario @username
 */
//@Throws(Exception::class)
fun getFollowedUsersServer(username: String): List<User> {
    //TODO:
    if (ServerEmulator.artistasSeguidos.containsKey(username)) {
        return ServerEmulator.artistasSeguidos[username]!!
    } else {
        return ArrayList()
    }
}

/**
 * Devuelve true si el usuario @user es seguido por el usuario @username
 */
//@Throws(Exception::class)
fun isUserFollowedByUserServer(username: String, user: String): Boolean {
//TODO:
    if (ServerEmulator.artistasSeguidos.containsKey(username)) {
        for (i in ServerEmulator.artistasSeguidos[username]!!) {
            if (i.username == user) return true
        }
        return false
    } else {
        return false
    }
}

/**
 * Devuelve una lista con los usuarios que siguen al usuario @username
 */
//@Throws(Exception::class)
fun getFollowersOfUserServer(username: String): List<User> {
    //TODO:
    return ArrayList()
}

/**
 * Devuelve el numero de seguidores del usuario @username
 */
//@Throws(Exception::class)
fun getNumberOfFollowersOfUserServer(username: String): Long {
    //TODO:
    return 4
}

/**
 * Añade el usuario @username como seguidor del usuario @followed
 */
//@Throws(Exception::class)
fun addFollowerToUserServer(username: String, sessionToken: String, followed: String) {
    //TODO:
    val seguido = ServerEmulator.userList[followed]
    ServerEmulator.artistasSeguidos[username]!!.add(seguido!!)
}

/**
 * Elimina el usuario @username como seguidor del usuario @followed
 */
//@Throws(Exception::class)
fun deleteFollowerToUserServer(username: String, sessionToken: String, followed: String) {
//TODO:
    val seguido = ServerEmulator.userList[followed]
    ServerEmulator.artistasSeguidos[username]!!.remove(seguido!!)
}

/**
 * Devuelve una lista con las playlist que sigue el usuario @username
 */
//@Throws(Exception::class)
fun getFollowedPlaylistsServer(username: String): List<Playlist> {
//TODO:
    return ServerEmulator.playlistSeguidos[username]!!
}

/**
 * Devuelve true si la playlist @playlist es seguida por el usuario @username
 */
//@Throws(Exception::class)
fun isPlaylistFollowedByUserServer(username: String, playlist: Long): Boolean {
//TODO:
    for (i in ServerEmulator.playlistSeguidos[username]!!) {
        if (i.id == playlist) return true
    }
    return false
}

/**
 * Devuelve una lista con los usuarios que siguen a la playlist @playlist
 */
//@Throws(Exception::class)
fun getFollowersOfPlaylistServer(playlist: Long): List<User> {
//TODO:
    return ArrayList()
}

/**
 * Devuelve el numero de seguidores de la playlist @playlist
 */
//@Throws(Exception::class)
fun getNumberOfFollowersOfPlaylistServer(playlist: Long): Long {
//TODO:
    return 8
}

/**
 * Añade el usuario @username como seguidor de la playlist @followed
 */
//@Throws(Exception::class)
fun addFollowerToPlaylistServer(username: String, sessionToken: String, followed: Long) {
//TODO:
    val seguido = ServerEmulator.playlistList[followed]
    ServerEmulator.playlistSeguidos[username]!!.add(seguido!!)
}

/**
 * Elimina el usuario @username como seguidor de la playlist @followed
 */
//@Throws(Exception::class)
fun deleteFollowerToPlaylistServer(username: String, sessionToken: String, followed: Long) {
//TODO:
    val seguido = ServerEmulator.playlistList[followed]
    ServerEmulator.playlistSeguidos[username]!!.remove(seguido!!)
}

/**
 * Añade una reproducción a la canción @song
 * En caso de ser un usuario no logeado username y sessionToken seran igual a null
 */
//@Throws(Exception::class)
fun addReproductionToSongServer(username: String?, sessionToken: String?, song: Long) {
//TODO:
}

/**
 * Añade la cancion @song como favorita del usuario @username
 */
//@Throws(Exception::class)
fun setSongFavoutireServer(username: String, sessionToken: String, song: Long) {
    //TODO:
    val seguido = ServerEmulator.songList[song]
    ServerEmulator.cancionesFavoritas[username]!!.add(seguido!!)
}

/**
 * Elimina la cancion @song como favorita del usuario @username
 */
//@Throws(Exception::class)
fun unSetSongFavoutireServer(username: String, sessionToken: String, song: Long) {
    //TODO:
    val seguido = ServerEmulator.songList[song]
    ServerEmulator.cancionesFavoritas[username]!!.remove(seguido!!)
}

/**
 * Devuelve true si la cancion @song es favorita del usuario @username
 */
//@Throws(Exception::class)
fun isSongFavoutireByUserServer(username: String, sessionToken: String, song: Long): Boolean {
    //TODO:
    for (i in ServerEmulator.cancionesFavoritas[username]!!) {
        if (i.id == song) return true
    }
    return false
}

/**
 * Obtiene la información asociada a la playlist con id @id
 * Warning: esta operación puede ser costosa en tiempo
 */
//@Throws(Exception::class)
fun obtainPlaylistDataServer(id: Long): Playlist? {
    //TODO:
    return ServerEmulator.playlistList[id]
}

//@Throws(Exception::class)
fun uploadSongServer(username: String, sessionToken: String, song: Song) {
//TODO:
}

/**
 * Devuelve las canciones favoritas de un usuario
 */
//@Throws(Exception::class)
fun obtainFavouriteSongsByUserServer(username: String, sessionToken: String): List<Song>? {
//TODO:
    return ServerEmulator.cancionesFavoritas[username]
}

/**
 * Devuelve una lista de @cantidad de Artistas, Playlist y Canciones recomendadas para el usuario @username
 */
//@Throws(Exception::class)
fun obtainRecomendationsForUserServer(username: String, sessionToken: String, cantidad: Long): List<Recommendation>? {
//TODO:
    return ServerEmulator.recomendaciones[username]
}

/**
 * Devuelve las canciones populares (plazo de una semana o un mes)
 */
//@Throws(Exception::class)
fun obtainPopularSongsServer(cantidad: Long): List<Song>? {
//TODO:
    return ServerEmulator.trends
}

/**
 * Devuelve la lista de maximo @cantidad canciones nuevas de los artistas seguidos
 */
//@Throws(Exception::class)
fun obtainNewSongsFromFollowedArtistOfUserServer(username: String, sessionToken: String, cantidad: Long): List<Song>? {
//TODO:
    return ServerEmulator.trends
}

/**
 * Devuelve las canciones populares (ultimo dia o ultimos dias)
 */
//@Throws(Exception::class)
fun obtainTrendSongsServer(cantidad: Long): List<Song>? {
//TODO:
    return ServerEmulator.trends
}

/**
 * Devuelve las canciones populares en el pais de origen del usuario (ultimo dia o ultimos dias)
 */
//@Throws(Exception::class)
fun obtainTrendSongsInUserCountryServer(username: String, cantidad: Long): List<Song>? {
//TODO:
    return ServerEmulator.trends
}

/**
 * Devuelve la lista de maximo @cantidad playlists seguidas que se han actualizado
 */
//@Throws(Exception::class)
fun obtainUpdatedPlaylistsFollowedByUserServer(username: String, sessionToken: String, cantidad: Long): List<Playlist>? {
//TODO:
    return ServerEmulator.playlistSeguidos[username]
}

/**
 * Devuelve la lista de maximo @cantidad resultados a la consulta @query
 * Si tipo es null devuelve todos los resultados a la query realizada, si tipo es 1 devuelve solamente canciones, si tipo = 2
 * devuelve solamente playlists y si tipo = 3 devuelve solamente autores
 */
//@Throws(Exception::class)
fun obtainResultForQueryServer(cantidad: Long, query: String, tipo : Int?): List<Recommendation>? {
//TODO:
    return ServerEmulator.trends
}

/**
 * Devuelve una lista compuesta por pares nombre del genero, canciones populares. Las canciones populares
 * tendrán un máximo de @cantidad canciones
 */
//@Throws(Exception::class)
fun obtainPopularByGenreServer(cantidad: Long): List<Pair<String, List<Recommendation>>>? {
//TODO:
    return ServerEmulator.generos
}

/**
 * Devuelve true si el usuario tiene una sesión abierta
 */
//@Throws(Exception::class)
fun isOtherSessionOpenFromSameUserServer(username: String, sessionToken: String): Boolean {
//TODO:
    return false
}

/**
 * Devuelve la última canción escuchada por el usuario en alguna de sus sesiones
 */
//@Throws(Exception::class)
fun obtainLastSongListenedServer(username: String, sessionToken: String): Song? {
//TODO:
    return ServerEmulator.songList[1]
}

/**
 * Crea una lista en el servidor
 */
//@Throws(Exception::class)
fun createPlaylistServer(username: String, sessionToken: String, playlist: Playlist) {
//TODO:
}

/**
 * Elimina una lista en el servidor
 */
//@Throws(Exception::class)
fun deletePlaylistServer(username: String, sessionToken: String, playlist: Playlist) {
//TODO:
}

/**
 * Actualiza una lista en el servidor
 */
//@Throws(Exception::class)
fun updatePlaylistServer(username: String, sessionToken: String, playlist: Playlist) {
//TODO:
}

//@Throws(Exception::class)
fun obtainGeneresServer():List<String>{
    //TODO:
    return ServerEmulator.generesList
}

//@Throws(Exception::class)
fun obtainAlbumsFromUserServer(username: String):List<Album>{
    //TODO:
    return ServerEmulator.albumList
}


//@Throws(Exception::class)
fun createAlbumsServer(username: String, sessionToken: String, album: Album){
    //TODO:
    ServerEmulator.albumList.add(album)
}

//@Throws(Exception::class)
fun updateAlbumsServer(username: String, sessionToken: String, album: Album){
    //TODO:
}

//@Throws(Exception::class)
fun deleteAlbumsServer(username: String, sessionToken: String, album: Album){
    //TODO:
}







