new eap7.Builder(branch:'main',
                 jobName: 'wildfly',
                 gitRepositoryUrl: "git@github.com:wildfly/wildfly.git"
                ).buildAndTest(this)
EapView.jobList(this, 'wildfly', 'wildfly.*')

new eap7.Builder(branch:'7.4.x').buildAndTest(this)

EapView.jobList(this, 'eap7', 'eap-.*')