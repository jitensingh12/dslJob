(1..4).each {
 job("test job-$it") {
	description("Siple jenkins job generated by DSL")
	}

	scm {
             git {
		remote {
			github('pp/test.git', 'https')
		}
		branch('master')
	    }
	}
	steps {
		sh 'echo "hello"'
	}
}
