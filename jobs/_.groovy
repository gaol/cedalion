new eap7.Builder(branch:'main',
                 jobName: 'wildfly',
                 gitRepositoryUrl: "git@github.com:wildfly/wildfly.git"
                ).buildAndTest(this)
EapView.jobList(this, 'wildfly', 'wildfly.*')
