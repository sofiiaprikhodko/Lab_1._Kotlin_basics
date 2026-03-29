fun toUpperCaseSafe(text: String?): String {
    // TODO: Перевірте if (text != null), використайте .uppercase(), інакше поверніть "EMPTY"
    return if (text != null) {
        text.uppercase()
    } else {
        "EMPTY"
    }
}