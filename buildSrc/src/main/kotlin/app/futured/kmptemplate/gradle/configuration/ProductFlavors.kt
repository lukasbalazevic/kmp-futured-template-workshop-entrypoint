package app.futured.kmptemplate.gradle.configuration


// TODO Ex 1.0 Add apiKey
/**
 * Defines all flavor-specific values provided to KMP during compilation.
 */
interface ProductFlavor {
    val name: String
    val restApiUrl: String
}

object ProductFlavors {

    val DEFAULT = Dev

    object Dev : ProductFlavor {
        override val name: String = "dev"
        override val restApiUrl: String = "https://king-prawn-app-w8kae.ondigitalocean.app/api/v1/"
    }

    object Prod : ProductFlavor {
        override val name: String = "prod"
        override val restApiUrl: String = "https://king-prawn-app-w8kae.ondigitalocean.app/api/v1/"
    }
}
