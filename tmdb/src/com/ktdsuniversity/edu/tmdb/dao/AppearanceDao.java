package com.ktdsuniversity.edu.tmdb.dao;

import java.util.ArrayList;
import java.util.List;

import com.ktdsuniversity.edu.tmdb.dao.query.AppearanceQuery;
import com.ktdsuniversity.edu.tmdb.db.helper.DataAccessHelper;
import com.ktdsuniversity.edu.tmdb.db.helper.SQLType;
import com.ktdsuniversity.edu.tmdb.vo.ActorVO;
import com.ktdsuniversity.edu.tmdb.vo.AppearanceVO;

public class AppearanceDao {
	private DataAccessHelper dah;

	public AppearanceDao(DataAccessHelper dah) {
		this.dah = dah;
	}

	public List<AppearanceVO> selectAppearancesByMovieId(String movieId) {
		List<AppearanceVO> result = new ArrayList<>();

		this.dah.preparedStatement(AppearanceQuery.makeSelectQuery(), pstmt -> {
			pstmt.setString(1, movieId);
		});

		this.dah.executeQuery(SQLType.SELECT, rs -> {
			AppearanceVO eachApperance = new AppearanceVO();
			eachApperance.setAppearanceId(rs.getString("APPEARANCE_ID"));
			eachApperance.setActorId(rs.getString("ACTOR_ID"));
			eachApperance.setMovieId(rs.getString("MOVIE_ID"));
			eachApperance.setCharacter(rs.getString("CHARACTER"));

			ActorVO eachActor = new ActorVO();
			eachActor.setActorId(rs.getString("ACTOR_ID"));
			eachActor.setActorName(rs.getString("ACTOR_NAME"));
			eachActor.setActorProfileUrl(rs.getString("ACTOR_PROFILE_URL"));

			eachApperance.setActor(eachActor);
			result.add(eachApperance);
		});
		return result;
	}

}
