package introduction

//Read about null safety and safe calls in Kotlin and rewrite the following Java code using only one if expression:
//public void introduction.sendMessageToClient(
//    @Nullable introduction.Client client,
//    @Nullable String message,
//    @NotNull introduction.Mailer mailer
//) {
//    if (client == null || message == null) return;
//
//    introduction.PersonalInfo personalInfo = client.getPersonalInfo();
//    if (personalInfo == null) return;
//
//    String email = personalInfo.getEmail();
//    if (email == null) return;
//
//    mailer.sendMessage(email, message);
//}

fun sendMessageToClient(client: Client?, message: String?, mailer: Mailer) {
    val email = client?.personalInfo?.email
    if (email != null && message != null) {
        mailer.sendMessage(email, message)
    }
}

class Client (val personalInfo: PersonalInfo?)
class PersonalInfo (val email: String?)
interface Mailer {
    fun sendMessage(email: String, message: String)
}