package ckapps.survey.controller

import ckapps.survey.PotentialAnswer
import ckapps.survey.Question
import ckapps.survey.Survey

class SurveyController {

    def index() {
		def survey = new Survey(surveyName:"first", surveyAuthor:"Chad")
		[survey:survey]	
	}
	
	def displayCreate() {
	}
	
	def create() {
		
	}
	
	def save()
	{
		def survey = new Survey(params)
		survey.save()
		redirect(action: "addQuestions", id: survey.id)
	}
	
	def addQuestions()
	{
		def survey = Survey.findById(params.id)
		[survey: survey]
	}
	
	def saveQuestion()
	{
		def survey = Survey.findById(params.id)
		def question = new Question(params)
		def a1 = new PotentialAnswer()
		addAnswer("One", question, params)
		addAnswer("Two", question, params)
		addAnswer("Three", question, params)
		addAnswer("Four", question, params)
		survey.addToQuestions(question)
		if (!survey.save(flush:true)) {
		    survey.errors.each {
				println it
			}
		}
		redirect(action: "addQuestions", id: survey.id)
		
	}
	
	private void addAnswer(String param, Question question, def params)	
	{
		def a = new PotentialAnswer()
		a.answerText = params."answer${param}"
		question.addToAnswers(a)
	}
}
