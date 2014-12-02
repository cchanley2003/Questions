package ckapps.survey

class PotentialAnswer {
	
	static belongsTo = [question : Question]
	
	String answerText

    static constraints = {
    }
}
