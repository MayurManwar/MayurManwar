package joinOperation;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Answer {
	
	@Id
	private int aid;
	private String answer;
	
	@ManyToOne
	Question question;
	
	public Question getQuestion() {
		return question;
	}
	
	public void setQuestion(Question question) {
		this.question=question;
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

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Answer [aid=");
		builder.append(aid);
		builder.append(", answer=");
		builder.append(answer);
		builder.append(", question=");
		builder.append(question);
		builder.append("]");
		return builder.toString();
	}

	
	

}
