node {
    
    // Checkout code from repository
    stage 'Checkout'
    checkout scm

    // Get the Gradle tool.
    def gradleHome = tool 'GRADLE213'

    // Build codes with unit testing
    stage 'Build and unit test'
    sh "${gradleHome}/bin/gradle build"

    stage 'Construct integration manifest'

    stage 'Set up base integration environment'
    parallel (
        phasea1: { echo "Configure Express" },
        phasea2: { echo "Configure Composition Layer" }
    )
    echo 'Configure District One'

    stage 'Verify base integration environment'
    echo 'Test and verify'

    stage 'Deploy new version'
    parallel (
        phase1: { echo "Configure Express" },
        phase2: { echo "Configure Composition Layer" },
        phase3: { echo "Configure FE" },
        phase4: { echo "Configure District One" }
    )

    stage 'Integration test'

    stage 'Publish manifest'
}
