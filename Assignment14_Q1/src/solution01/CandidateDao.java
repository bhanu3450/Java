package solution01;

import java.io.InputStream;
import java.io.Reader;
import java.math.BigDecimal;
import java.net.URL;
import java.sql.Array;
import java.sql.Blob;
import java.sql.Clob;
import java.sql.Connection;
import java.sql.Date;
import java.sql.NClob;
import java.sql.ParameterMetaData;
import java.sql.PreparedStatement;
import java.sql.Ref;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.RowId;
import java.sql.SQLException;
import java.sql.SQLWarning;
import java.sql.SQLXML;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Scanner;

public class CandidateDao implements AutoCloseable {

	private Connection con;

	// constructor
	public CandidateDao() throws SQLException {
		// making object of CandidateDao
		con = DbUtil.getConnection(); // Connection thorows SQLException
	}

	@Override
	public void close() {

		try {
			if (con != null)
				con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// add new candidate
	public int saveCandidate(Candidate c) throws SQLException{
//		int cnt = 0;
		String sql = "INSERT INTO candidates VALUES(default, ?, ?, ?)";
		try (PreparedStatement stmt = con.prepareStatement(sql)) {
			String name = c.getName();
			String party = c.getParty();
			int votes = c.getVotes();
			stmt.setString(1, name);
			stmt.setString(2, party);
			stmt.setInt(3, votes);
			int cnt = stmt.executeUpdate();
			return cnt;

		}
	}

	//delete
	public int deleteCandidate(int id) throws SQLException {
		String sql = "DELETE FROM candidates WHERE id = ? ";
		try(PreparedStatement stmt = con.prepareStatement(sql)) {
			stmt.setInt(1, id);
			int cnt = stmt.executeUpdate();
			return cnt;
		}//stmt.close();
	}
	
	// update candidate
	public int updateCandidate(Candidate c) throws SQLException {
		String sql = "UPDATE candidates SET name = 'Abhey', party = 'congress'  WHERE id = ?";
		try(PreparedStatement stmt = con.prepareStatement(sql)) {
			int id = c.getId();
			stmt.setInt(1, id);
			int cnt = stmt.executeUpdate();
			return cnt;
		} 
	}
	
	// partyWise votes
	public List<PartyVotes> getPartyWiseVotes() throws SQLException{
		List<PartyVotes> list = new ArrayList<>();
		String sql = "select party, sum(votes) as totalVotes from candidates group by party";
		try(PreparedStatement stmt = con.prepareStatement(sql)){
			try(ResultSet rs = stmt.executeQuery()){
				while (rs.next()) {
					String party = rs.getString("party");
					int votes = rs.getInt("totalVotes");
					PartyVotes pv = new PartyVotes(party, votes);
					list.add(pv);
				}
			}
			
		}
		return list;	
	}
	
	//getALL
	public List<Candidate> getAll() throws SQLException{
		List<Candidate> list = new ArrayList<>();
		String sql = "SELECT * FROM candidates";
		try(PreparedStatement stmt = con.prepareStatement(sql)){
			try(ResultSet rs = stmt.executeQuery()){
				while(rs.next()) {
					int id = rs.getInt("id");
					String name = rs.getString("name");
					String party = rs.getString("party");
					int votes = rs.getInt("votes");
					Candidate c = new Candidate();
					list.add(c);
				}//rs.close()
			}//stmt.close//
		}
		return list;	
	}
   
	//getCandidateById
	
	public Candidate getCandidateById(int id) throws SQLException {
		String sql = "SELECT * FROM candidates WHERE id = ?";
		Candidate c1 = new Candidate();
		try(PreparedStatement stmt = con.prepareStatement(sql)){
		stmt.setInt(1, id);
		try(ResultSet rs = stmt.executeQuery()){
			while(rs.next()) {
			c1.setId(rs.getInt("id"));
			c1.setName(rs.getString("name"));
			c1.setParty(rs.getString("party"));
			c1.setVotes(rs.getInt("votes"));
			}
			}//rs.close()
		}//stmt.close()
		return c1;
	}
	
	
	
	
}
