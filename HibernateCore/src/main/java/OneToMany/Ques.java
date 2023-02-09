package OneToMany;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Ques {
	@Id
	private int qid;
	private String quetion;
	@OneToMany
	private List<Ans> answer;
	public Ques() {
		super();
		// TODO Auto-generated constructor stub
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
	public List<Ans> getAnswer() {
		return answer;
	}
	public void setAnswer(List<Ans> answer) {
		this.answer = answer;
	}
	@Override
	public String toString() {
		return "Ques [qid=" + qid + ", quetion=" + quetion + ", answer=" + answer + "]";
	}
	
	
}
