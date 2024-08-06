pipeline {
    agent any

    stages {
        stage('Hello') {
            steps {
                echo 'Hello Pawan Tiwari,'
            }
        }
        stage('How'){
            steps{
                echo 'How are you Pawan?'
            }
        }
        stage('Why'){
            steps{
                echo 'Why you are doing Engineering?'
            }
        }
        stage('What'){
            steps{
                echo 'What force you to take engineering in this college?'
            }
        }
        stage('Where'){
            steps{
                echo 'Where you find yourself after taking engineering?'
            }
        }
    }
}
