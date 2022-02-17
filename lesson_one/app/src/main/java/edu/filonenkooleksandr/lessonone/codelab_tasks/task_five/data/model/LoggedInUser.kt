package edu.filonenkooleksandr.lessonone.codelab_tasks.task_five.data.model

/**
 * Data class that captures user information for logged in users retrieved from LoginRepository
 */
data class LoggedInUser(
    val userId: String,
    val displayName: String
)