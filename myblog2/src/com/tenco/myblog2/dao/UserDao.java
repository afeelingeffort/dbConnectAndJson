package com.tenco.myblog2.dao;

import com.tenco.myblog2.dto.UserDto;

public class UserDao {

	// 1. UserDTO를 만들어보세요
	public UserDto select(int userId) {
		// UserDTO 객체를 임의의 값을 넣어서 생성하고
		// 그 결과 값을 main 함수에서 출력하시오
		UserDto kimUser = new UserDto(1, "미킴");

		return kimUser;

		// DB에 있는 부분을 연동하고 싶다면
		// 거기에 맞는 기술들을 알아보고 분석해서 준비하면 됨

		// MySQL <-- 데이터 관리 (다중 접속 가능)
		// 드라이버..

		// Connection 객체가 필요하다.
		// 주소, 계정, 비번, 데이터베이스 이름, 포트 번호, 사용할 문자셋, 현지 시간
		// 접근해서 활용 가능한 부분들이 Connection이라는 객체 안에 담겨져 있다.

		// Connection에서 연결처리 외 또 많이 하는 작업은
		// SQL을 만들고 실행하는 일이다.
		// SQL 질의어를 만들기 위해선 Statement 객체가 필요하다.

		// Connection 객체에서 Statement, PreparedStatement를 생성할 수 있다.
		// conn.createStatement() OR conn.prepareStatement() 를 사용할 수 있다.
		// ? 에 값을 바인딩 하는 기능

		// prepareStatement를 통해서 질의어를 생성하고 질의어를 실행시킬 수 있다.
		// select <- executeQuery() 사용 / delete, update, insert <- executeUpdate()를 사용하면 된다.
		
		// 쿼리를 실행하면 결과값은 
		// executeQuery() --> ResultSet을 반환한다. (Dto 반환)
		// executeUpdate() --> 적용받은 row 갯수를 반환한다. (int 반환)
		
	}
}
