package OneToOne;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Question {
	@Id
	private int qid;
	private String quetion;
	@OneToOne(mappedBy = "question")
	private Answer answer;
	
	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Question(int qid, String quetion, Answer answer) {
		super();
		this.qid = qid;
		this.quetion = quetion;
		this.answer = answer;
	}
	public int getQid() {
		return qid;
	}
	public void setQid(int qid) {
		this.qid = qid;
	}
	public String getQuetion() {
		return quetion;
	}
	public void setQuetion(String quetion) {
		this.quetion = quetion;
	}
	public Answer getAnswer() {
		return answer;
	}
	public void setAnswer(Answer answer) {
		this.answer = answer;
	}
	@Override
	public String toString() {
		return "Question [qid=" + qid + ", quetion=" + quetion + ", answer=" + answer + "]";
	}
	
}
