package hbcls;

import javax.persistence.*;
import java.util.List;


@Entity
@Table(name="question")
public class Question {
	@Id
	@Column(name="qid",length = 30)
	private String qid;
	@Column(name="qname",length = 200)
	private String qname;
	
	@ManyToMany(targetEntity = Answer.class)
	@JoinTable(name="quesandans",joinColumns = {@JoinColumn(name="qid")} , 
	inverseJoinColumns = {@JoinColumn(name="ans_id")})
	private List<Answer> answer;
	
	
	public String getQid() {
		return qid;
	}

	public void setQid(String qid) {
		this.qid = qid;
	}

	
	public String getQname() {
		return qname;
	}

	public void setQname(String qname) {
		this.qname = qname;
	}

	public List<Answer> getAnswer() {
		return answer;
	}

	public void setAnswer(List<Answer> answer) {
		this.answer = answer;
	}

	
}











