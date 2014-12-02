package ckapps.survey

class Survey {
	
	String surveyName
	String surveyAuthor
	
	static hasMany = [questions : Question]

    static constraints = {
    }
}
