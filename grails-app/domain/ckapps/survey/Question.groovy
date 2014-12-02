package ckapps.survey

class Question {
	
	static belongsTo = [survey: Survey]
	
	static hasMany = [answers: PotentialAnswer]
	
	String questionText

    static constraints = {
    }
}
