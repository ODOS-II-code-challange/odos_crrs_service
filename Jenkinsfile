//get common library inclusion
def Common = new odos.jenkins.Common()

def GIT_URL=scm.getUserRemoteConfigs()[0].getUrl()

pipeline {
    agent any

    stages {
        stage('init'){
          steps{
            script{
              Common.runGitMerge('CI_Master', 'master')
              Common.slack "Build Started."
            }
          }
        }
        stage('Build') {
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
              Common.slack 'Sonar Scan and Upload...'
              Common.sonarScan()
            }
          }
        }
        stage('Fortify Scan') {
            steps {
              script{
                Common.slack 'Fortify Scan...'
                Common.fortify('src','reports')
              }
            }
        }
        stage('Build Container') {
            steps {
              script{
                Common.slack 'Packaging into a container...'
                Common.buildContainer('odosii_crrs')
              }
            }
        }
        // stage('Twistlock Scan') {
        //     steps {
        //       script{
        //         Common.slack 'Twistlock Scan...'
        //         Common.twistlock('docker.lassiterdynamics.com:5000', 'odosii_crrs','latest')
        //       }
        //     }
        // }
        stage('Push Container') {
            steps {
              script{
                Common.slack 'Push to Docker Registry..'
                Common.pushContainer('odosii_crrs')
              }
            }
        }
        stage('Test Deploy') {
            steps {
              script{
                Common.slack 'Deploying to Test Environment...'
                Common.deployToOpenShift('odos-ii-test','odosii_crrs','latest')
              }
            }
        }
        stage('FT') {
            steps {
              script{
                Common.slack 'Functional Testing...'
              }
            }
        }
        stage('PT') {
            steps {
              script{
                Common.slack 'Performance Testing...'
              }
            }
        }
        // stage('Merge') {
        //     steps {
        //       script{
        //         Common.slack 'Merge to master branch...'
        //         Common.runGitPush('master')
        //       }
        //     }
        // }
        stage('PP Deploy') {
            steps {
              script{
                Common.slack 'Deploying to PreProd Environment...'
              }
            }
        }

    }
}
