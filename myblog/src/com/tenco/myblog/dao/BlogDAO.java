package com.tenco.myblog.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.tenco.myblog.dto.BlogDTO;
import com.tenco.myblog.utils.DBHelper;

public class BlogDAO implements IBlogDAO {

	private Connection conn;

	private PreparedStatement pstmt;
	private ResultSet rs;

	public BlogDAO() {
		conn = DBHelper.getInstance().getConnection();
	}

	@Override
	public void select() {

	}

	// 2차원 표를 클래스로 모델링 하기 위해 DTO 만들기
	@Override
	public BlogDTO select(int id) {
		BlogDTO blogDTO = null;
		String query = " SELECT * " + " FROM board " + " WHERE id = ? ";

		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, id);

			rs = pstmt.executeQuery();

			// blogDTO에 결과값을 담음
			while (rs.next()) {
				blogDTO = new BlogDTO();

				blogDTO.setId(rs.getInt("id"));
				blogDTO.setTitle(rs.getString("title"));
				blogDTO.setContent(rs.getString("content"));
				blogDTO.setReadCount(rs.getInt("readCount"));
				blogDTO.setUserId(rs.getInt("userId"));
			}
		} catch (SQLException e) {
			System.out.println(">> BlogDAO select(int id) 에러 발생 <<");
			e.printStackTrace();
		}

		return blogDTO;
	}

	@Override
	public int delete(int boardId) {
		int resultRow = 0;
		String sql = " DELETE FROM board "
				+ " WHERE id = ? ";
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, boardId);
			
			// 반환타입이 int이므로 resultRow를 받음
			resultRow = pstmt.executeUpdate();
			
			
		} catch (SQLException e) {
			System.out.println(">> delete 에러 발생 <<");
			e.printStackTrace();
		}
		return resultRow;
	}

}
