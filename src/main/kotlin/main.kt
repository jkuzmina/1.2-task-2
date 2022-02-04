fun main(){
    val likes = 11
    println(likesToString(likes))
}
fun likesToString(likes: Int):String {

    val likesStr = likes.toString()
    val likesLastSym = likesStr.substring(likesStr.length - 1)
    val likesBeforeLastSym = if (likesStr.length > 1) likesStr.substring(likesStr.length - 2, likesStr.length - 1) else ""
    if(likesLastSym == "1" && likesBeforeLastSym != "1"){
        return "Понравилось $likes человеку"
    } else return "Понравилось $likes людям"
}