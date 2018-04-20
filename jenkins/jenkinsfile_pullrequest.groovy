#!groovy
def Common = new odos.jenkins.Common()
pipeline {
    agent any

    stages {
             
        stage('Test') {
            steps {
                script{
                  Common.slack 'Building...'
                  Common.jHipsterBuild()
                }
            }
        }
     
        stage('Sonar Scan') {
          steps {
            script{
              Common.slack 'Sonar Scan for build request...'
              //Common.sonarScan()
              withCredentials([usernamePassword(credentialsId: 'soar-login', passwordVariable: 'SONAR_PASSWORD', usernameVariable: '')]) {
                   withCredentials([usernamePassword(credentialsId: 'soar-login', passwordVariable: 'SONAR_PASSWORD', usernameVariable: '')]) {
                  sh """
                        ./gradlew --full-stacktrace\
                        -Dsonar.host.url=http://odos.lassiterdynamics.com:9000 \
                        -Dsonar.github.endpoint=https://api.github.com \
                        -Dsonar.github.repository=ODOS-II-code-challange/odos_crrs_service  \
                        -Dsonar.projectKey=gov.dhs.uscis.odos:crrsvc \
                        -Dsonar.analysis.mode=preview \
                        -Dsonar.github.pullRequest=$ghprbPullId \
                        -Dsonar.github.repository=$ghprbGhRepository \
                        -Dsonar.github.login=odos-jenkins \
                        -Dsonar.github.oauth=c1d702b375ef96065d3e4fa6996681033fbbf1e2 \
                        -Dsonar.login=jenkins \
                        -Dsonar.password=$SONAR_PASSWORD \
                        -x test sonarqube
                    """
   
            }
   
            }
               
            }
          }
        }


    }
}

