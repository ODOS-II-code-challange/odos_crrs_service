//get common library inclusion
def Common = new odos.jenkins.Common()

def GIT_URL=scm.getUserRemoteConfigs()[0].getUrl()


def CDC_GIT_BASE = "master"
def CDC_GIT_BRANCH = "CI_Master"

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
        stage('CDC') {
            steps {
                script{
                  Common.runCDCTests(CDC_GIT_BRANCH)
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
                Common.buildContainer('crrsvc')
              }
            }
        }
        // stage('Twistlock Scan') {
        //     steps {
        //       script{
        //         Common.slack 'Twistlock Scan...'
        //         Common.twistlock('docker.lassiterdynamics.com:5000', 'crrsvc','latest')
        //       }
        //     }
        // }
        stage('Push Container') {
            steps {
              script{
                Common.slack 'Push to Docker Registry..'
                Common.pushContainer('crrsvc')
              }
            }
        }
        stage('Test Deploy') {
            steps {
              script{
                Common.slack 'Deploying to Test Environment...'
                Common.deployToOpenShift('odos-ii-test','crrsvc','latest')
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
        stage('Merge') {
            steps {
              script{
                Common.slack 'Merge to master branch...'
                Common.runGitPush('master')
              }
            }
        }
        stage('PP Deploy') {
            steps {
              script{
                Common.slack 'Deploying to PreProd Environment...'
              }
            }
        }

    }
}
