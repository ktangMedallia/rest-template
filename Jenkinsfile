node {
   // Checkout code from repository
   stage 'Checkout'
   checkout scm

   // Get the Gradle tool.
   def gradleHome = tool 'GRADLE213'

   // Build codes with unit testing
   stage 'Build and unit test'
   sh "${gradleHome}/bin/gradle build"

}
