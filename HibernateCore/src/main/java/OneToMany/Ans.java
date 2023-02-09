package OneToMany;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Ans {
	@Id
	private int aid;
	private String answer;
	@ManyToOne
	private Ques question;
	public Ans() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	public Ques getQuestion() {
		return question;
	}
	public void setQuestion(Ques question) {
		this.question = question;
	}
	@Override
	public String toString() {
		return "Ans [aid=" + aid + ", answer=" + answer + ", question=" + question + "]";
	}
	
	
}
