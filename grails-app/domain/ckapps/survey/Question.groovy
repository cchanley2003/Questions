package ckapps.survey

class Question {
	
	static belongsTo = [survey: Survey]
	
	List answers
	
	static hasMany = [answers: PotentialAnswer]
	
	String questionText

    static constraints = {
    }
}
