package hbcls;

import java.util.List;
import javax.persistence.*;

@Entity
@Table(name="answer")
public class Answer {

	@Id
	@Column(name="ans_id",length = 30)
	private String ans_id;
	@Column(name="ans",length = 150)
	private String ans;
	@Column(name="posted",length = 100)
	private String posted_by;
	
	/*@OneToMany(targetEntity = Question.class)
	private List<Question> question;

	public List<Question> getQuestion() {
		return question;
	}

	public void setQuestion(List<Question> question) {
		this.question = question;
	}*/

	
	public String getAns_id() {
		return ans_id;
	}

	public void setAns_id(String ans_id) {
		this.ans_id = ans_id;
	}

	
	public String getAns() {
		return ans;
	}

	public void setAns(String ans) {
		this.ans = ans;
	}

	
	public String getPosted_by() {
		return posted_by;
	}

	public void setPosted_by(String posted_by) {
		this.posted_by = posted_by;
	}
}
