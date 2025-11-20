package edu.kh.todoList.model.service;

import java.util.Map;

/*
유지보수성, 확장성, 테스트용이성 때문에 인터페이스 구현함.
Service / DAO 단은 interface와 상속받는 구현체 class로 작성한다.
Controller는 ServiceImpl을 직접 사용하지 않고,
Service 를 의존하므로, 나중에 구현체가 바뀌어도 Controller는 큰영향을받지 않음
*/
public interface TodoListService {

	Map<String, Object> todoListFullView() throws Exception;

	int todoAdd(String title, String detail) throws Exception;


}
