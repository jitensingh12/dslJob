 job("test job") {
	description("Siple jenkins job generated by DSL")
	
	scm {
             git {
		remote {
			github('jitensingh12/jenkinfilejob.git', 'https')
		}
		branch('master')
	    }
	}
	steps {
		shell('echo START')
	}
}
