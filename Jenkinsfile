node {
   // Mark the code checkout 'stage'....
   stage 'Checkout'

   // Checkout code from repository
   checkout scm

   // Get the Gradle tool.
   def mvnHome = tool 'GRADLE213'

   // Mark the code build 'stage'....
   stage 'Build'
   // Run the maven build
   sh "${mvnHome}/bin/gradle build -x test"
}
