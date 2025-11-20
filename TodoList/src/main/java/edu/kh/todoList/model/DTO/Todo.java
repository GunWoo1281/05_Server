package edu.kh.todoList.model.DTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data //getter, setter, tostring
@NoArgsConstructor //기본 생성자
@AllArgsConstructor //모든필드 초기화 생성자
@Builder //빌더 패턴
public class Todo {

	private int todoNo;
	private String todoTitle;
	private String todoDetail;
	private boolean todoComplete;
	private String regDate;
	
}
