 job("test job") {
	description("Siple jenkins job generated by DSL")
	
	scm {
             git {
		remote {
			//github('jitensingh12/jenkinfilejob.git', 'https')
			git branch: 'master', credentialsId: 'b0f25a4f-9107-411b-85b2-ad7d4d89a6d4', url: 'https://github.com/jitensingh12/jenkinfilejob.git'
		}
		branch('master')
	    }
	}
	steps {
		shell('echo "START"')
	}
}
